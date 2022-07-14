package dev.araozu.proyecto2.model

import androidx.room.*

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
