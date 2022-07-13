package dev.araozu.proyecto2.model

import android.content.Context
import androidx.annotation.WorkerThread
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Partido::class, Candidato::class],
    version = 1,
)
@TypeConverters(Candidato.Converter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun partidoDao(): PartidoDao
    abstract fun candidatoDao(): CandidatoDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        @WorkerThread
        fun getDatabase(context: Context? = null): AppDatabase {
            if (context == null && INSTANCE == null) {
                throw RuntimeException("Se intento a acceder a Room antes de su inicialización")
            }

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context!!.applicationContext,
                    AppDatabase::class.java,
                    "main_database"
                ).build()
                INSTANCE = instance

                instance
            }
        }

    }

}
