package dev.araozu.lab10.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters

class CandidatosWorker(appContext: Context, workerParameters: WorkerParameters)
    : CoroutineWorker(appContext, workerParameters){

    override suspend fun doWork(): Result {
        // TODO
        return Result.success()
    }

}