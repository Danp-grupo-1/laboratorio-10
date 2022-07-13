package dev.araozu.proyecto2.model

import androidx.room.*

const val loremIpsum =
    "\"Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet \" +\n" +
    "\"obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!\","



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

@Entity(
    tableName = "candidatos",
)
data class Candidato(
    @ColumnInfo(name = "nombre") var nombre: String,
    // Id del partido en Room
    @ColumnInfo(name = "partido") var partido: String,
    /**
     * Una url a una foto
     */
    @ColumnInfo(name = "foto") var foto: String,
    @ColumnInfo(name = "biografia") var biografia: String,
    @ColumnInfo(name = "distrito") var distrito: Distrito,
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
) {

    class Converter {
        @TypeConverter
        fun fromDistrito(d: Distrito): String {
            return d.toString()
        }

        @TypeConverter
        fun toDistrito(s: String): Distrito {
            return Distrito.fromString(s)!!
        }
    }

}
