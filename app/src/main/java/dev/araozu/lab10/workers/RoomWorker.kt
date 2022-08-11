package dev.araozu.lab10.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf

class RoomWorker(appContext: Context, workerParameters: WorkerParameters) :
    CoroutineWorker(appContext, workerParameters) {
    override suspend fun doWork(): Result {
        // TODO
        val returnData = workDataOf(DB_EMPTY to true)
        return Result.success(returnData)
    }

    companion object {
        const val DB_EMPTY = "DB_EMPTY"
    }
}