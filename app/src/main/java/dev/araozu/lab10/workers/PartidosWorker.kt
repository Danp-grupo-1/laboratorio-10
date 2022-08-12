package dev.araozu.lab10.workers

import androidx.work.Worker
import androidx.work.WorkerParameters
import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import com.google.firebase.firestore.FirebaseFirestore
import dev.araozu.lab10.model.AppDatabase
import dev.araozu.lab10.model.Partido
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class PartidosWorker(
    private val appContext: Context,
    workerParameters: WorkerParameters
)
    : CoroutineWorker(appContext, workerParameters){

    override suspend fun doWork(): Result {
        val roomVacio = inputData.getBoolean(RoomWorker.DB_EMPTY, true)
        if (!roomVacio) return Result.success()

        val db = AppDatabase.getDatabase(appContext)

        val firestoreDB = FirebaseFirestore.getInstance()
        val task = firestoreDB.collection("partidos")
            .get()
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    val partidos = ArrayList<Partido>(it.result.size())

                    for (doc in it.result) {
                        val partido = Partido(
                            nombre = doc["nombre"] as String,
                            fundacion = (doc["fundacion"] as Long).toInt(),
                            domicilio = doc["domicilio"] as String,
                            imagen = doc["imagen"] as String,
                        )
                        partidos.add(partido)
                    }

                    runBlocking {
                        db.partidoDao().insertAll(partidos)
                        Log.d("MAIN", "Partidos insertados")
                    }

                } else {
                    Log.w("MAIN", "Error getting documents: ", it.exception)
                }
            }

        while (!task.isComplete) {
            delay(100)
        }

        return if (task.isSuccessful) Result.success() else Result.failure()
    }

}