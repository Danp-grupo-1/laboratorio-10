package dev.araozu.proyecto2.model

import androidx.room.*

@Dao
interface CandidatoDao {
    @Query("SELECT * FROM candidatos ORDER BY nombre ASC")
    suspend fun getAll(): List<Candidato>

    @Query("SELECT * FROM candidatos WHERE nombre = :nombre ORDER BY nombre ASC")
    suspend fun getByNombre(nombre: String): Candidato

    @Query("SELECT * FROM candidatos WHERE partido = :partido ORDER BY nombre ASC")
    suspend fun getByPartido(partido: String): List<Candidato>

    @Query("SELECT * FROM candidatos WHERE distrito = :distrito ORDER BY nombre ASC")
    suspend fun getByDistrito(distrito: String): List<Candidato>

    @Insert
    suspend fun insertAll(vararg candidato: Candidato)

    @Insert
    suspend fun insertAll(candidatos: List<Candidato>)

    @Update
    suspend fun update(candidato: Candidato)

    @Delete
    suspend fun delete(candidato: Candidato)

    @Query("DELETE FROM candidatos")
    suspend fun deleteAll()
}
