package dev.araozu.lab10.model

import androidx.room.*

@Dao
interface PartidoDao {
    @Query("SELECT * FROM partidos ORDER BY nombre ASC")
    suspend fun getAll(): List<Partido>

    @Query("SELECT * FROM partidos WHERE nombre = :name ORDER BY nombre ASC")
    suspend fun getByName(name: String): Partido

    @Insert
    suspend fun insertAll(vararg partidos: Partido)

    @Insert
    suspend fun insertAll(partidos: List<Partido>)

    @Update
    suspend fun update(partido: Partido)

    @Delete
    suspend fun delete(partido: Partido)

    @Query("DELETE FROM partidos")
    suspend fun deleteAll()
}
