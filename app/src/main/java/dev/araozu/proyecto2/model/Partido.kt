package dev.araozu.proyecto2.model

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


@Entity(tableName = "partidos")
data class Partido(
    @ColumnInfo(name = "nombre") var nombre: String,
    @ColumnInfo(name = "fundacion") val fundacion: Int,
    @ColumnInfo(name = "domicilia") var domicilio: String,
    @ColumnInfo(name = "imagen") var imagen: String,
    @PrimaryKey(autoGenerate = true) val candidatoId: Int = 0,
)