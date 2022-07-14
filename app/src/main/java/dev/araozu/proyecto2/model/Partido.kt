package dev.araozu.proyecto2.model

import androidx.room.*

@Entity(tableName = "partidos")
data class Partido(
    @ColumnInfo(name = "nombre") var nombre: String,
    @ColumnInfo(name = "fundacion") val fundacion: Int,
    @ColumnInfo(name = "domicilia") var domicilio: String,
    @ColumnInfo(name = "imagen") var imagen: String,
    @PrimaryKey(autoGenerate = true) val candidatoId: Int = 0,
)
