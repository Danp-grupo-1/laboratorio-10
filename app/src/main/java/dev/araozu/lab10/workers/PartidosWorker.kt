package dev.araozu.lab10.workers

import androidx.work.Worker
import androidx.work.WorkerParameters
import android.content.Context
import androidx.work.CoroutineWorker

class PartidosWorker(appContext: Context, workerParameters: WorkerParameters)
    : CoroutineWorker(appContext, workerParameters){

    override suspend fun doWork(): Result {
        // TODO
        return Result.success()
    }

}