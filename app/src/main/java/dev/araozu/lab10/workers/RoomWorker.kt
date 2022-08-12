package dev.araozu.lab10.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import dev.araozu.lab10.model.AppDatabase

class RoomWorker(
    private val appContext: Context,
    workerParameters: WorkerParameters
) :
    CoroutineWorker(appContext, workerParameters) {

    override suspend fun doWork(): Result {
        val db = AppDatabase.getDatabase(appContext)
        val listaCandidatos = db.candidatoDao().getAll()
        val listaPartidos = db.partidoDao().getAll()

        val isEmpty = listaCandidatos.isEmpty() || listaPartidos.isEmpty()

        val returnData = workDataOf(DB_EMPTY to isEmpty)
        return Result.success(returnData)
    }

    companion object {
        const val DB_EMPTY = "DB_EMPTY"
    }
}