package dev.araozu.laboratorio2.model


import android.content.Context
import androidx.annotation.WorkerThread
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

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
        suspend fun getDatabase(context: Context): AppDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "main_database"
                ).build()
                INSTANCE = instance

                runBlocking {
                    launch {
                        populate(instance)
                    }
                }

                instance
            }
        }

        // Crea los partidos y candidatos iniciales
        suspend private fun populate(db: AppDatabase) {
            val partidoDao = db.partidoDao()
            partidoDao.deleteAll()
            Partido.partidos.forEach { partido ->
                partidoDao.insertAll(partido)
            }

            val candidatoDao = db.candidatoDao()
            candidatoDao.deleteAll()
            Candidato.candidatos.forEach { candidato ->
                candidatoDao.insertAll(candidato)
            }
        }
    }

}
