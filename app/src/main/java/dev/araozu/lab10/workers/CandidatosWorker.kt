package dev.araozu.lab10.workers

import android.content.Context
import android.os.AsyncTask
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.google.firebase.firestore.FirebaseFirestore
import dev.araozu.lab10.model.AppDatabase
import dev.araozu.lab10.model.Candidato
import dev.araozu.lab10.model.Distrito
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class CandidatosWorker(
    private val appContext: Context,
    workerParameters: WorkerParameters
)
    : CoroutineWorker(appContext, workerParameters){

    override suspend fun doWork(): Result {
        val db = AppDatabase.getDatabase(appContext)

        // Retrieve data from Firestore: Candidatos
        val firestoreDB = FirebaseFirestore.getInstance()
        val task = firestoreDB
            .collection("candidatos")
            .get()
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    val candidatos = ArrayList<Candidato>(it.result.size())

                    for (doc in it.result) {
                        if (doc.data.isEmpty()) continue

                        val candidato = Candidato(
                            nombre = doc["nombre"] as String,
                            partido = doc["partido"] as String,
                            foto = doc["foto"] as String,
                            biografia = doc["biografia"] as String,
                            distrito = Distrito.fromString(doc["distrito"] as String)!!
                        )
                        candidatos.add(candidato)
                    }

                    runBlocking {
                        db.candidatoDao().insertAll(candidatos)
                        Log.d("MAIN", "Candidatos insertados")
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