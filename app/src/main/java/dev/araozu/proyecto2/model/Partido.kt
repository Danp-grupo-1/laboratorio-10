package dev.araozu.proyecto2.model


import androidx.room.*

@Dao
interface PartidoDao {
    @Query("SELECT * FROM partidos ORDER BY nombre ASC")
    suspend fun getAll(): List<Partido>

    @Query("SELECT * FROM partidos WHERE nombre = :name")
    suspend fun getByName(name: String): Partido

    @Insert
    suspend fun insertAll(vararg partidos: Partido)

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
){
    companion object {
        val Arequipa_Tradicion_Futuro = Partido(
            nombre = "Arequipa Tradicion y Futuro",
            fundacion = 2005,
            domicilio = "CALLE REPUBLICA DE CHILE N° 323 Dpto. 202",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/142",
        )
        val Arequipa_transformacion = Partido(
            nombre = "Arequipa Transformacion",
            fundacion = 2015,
            domicilio = "CALLE CORBACHO. URB. LA LIBERTAD N° 304",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2313",
        )
        val Frente_Popular_Agricola_del_Peru = Partido(
            nombre = "Frente Popular Agricola del Peru",
            fundacion = 2020,
            domicilio = "",
            imagen = "",
        )
        val Movimiento_Regional_Reveladora = Partido(
            nombre = "Movimiento Regional Reveladora",
            fundacion = 2020,
            domicilio = "-",
            imagen = "",
        )
        val Partido_Politico_Nacional_Peru_Libre = Partido(
            nombre = "Partido Politico Nacional Peru Libre",
            fundacion = 2016,
            domicilio = "AV. BRASIL N° 170 Dpto. 3er piso - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2218",
        )
        val Yo_Arequipa = Partido(
            nombre = "Yo Arequipa",
            fundacion = 2018,
            domicilio = "AV. VILLA GLORIA BLOCK T1 OFICINA 203 CH MANUEL POLO JIMENEZ",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2744",
        )
        val Movimineto_Regional_Arequipa_Avancemos = Partido(
            nombre = "Movimiento Regional Arequipa Avancemos",
            fundacion = 2014,
            domicilio = "AV. PUMACAHUA N° 202",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2307",
        )
        val Avanza_Pais_Partido_De_Integracion_Social = Partido(
            nombre = "Avanza Pais Partido De Integracion Social",
            fundacion = 2017,
            domicilio = "AV. NAZCA N° 167 - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2173",
        )
        val Juntos_Por_El_Desarrollo_De_Arequipa = Partido(
            nombre = "Juntos Por El Desarrollo De Arequipa",
            fundacion = 2014,
            domicilio = "CALLE COOPERATIVA CLISA C-4 N° S/N",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2257",
        )
        val Accion_Popular = Partido(
            nombre = "Accion Popular",
            fundacion = 2004,
            domicilio = "AV. 9 DE DICIEMBRE (EX PASEO COLON) N° 218 - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/4",
        )
        val Partido_Morado = Partido(
            nombre = "Partido Morado",
            fundacion = 2019,
            domicilio = "CALLE IGNACIO MERINO N° 375 - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2840",
        )
        val Fe_En_El_Peru =
            Partido(nombre = "Fe En El Peru", fundacion = 2020, domicilio = "-", imagen = "")
        val Partido_Frente_De_La_Esperanza_2021 = Partido(
            nombre = "Partido Frente De La Esperanza 2021",
            fundacion = 2020,
            domicilio = "-",
            imagen = "",
        )
        val Alianza_Para_El_Progreso = Partido(
            nombre = "Alianza Para El Progreso",
            fundacion = 2008,
            domicilio = "AV. DE LA POLICIA N° 643 - LIMA - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/1257",
        )
        val Fuerza_Arequipenya = Partido(
            nombre = "Fuerza Arequipeña",
            fundacion = 2010,
            domicilio = "CALLE Manuel Ugarteche, Selva Alegre N° 517",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/1393",
        )
        val Movimiento_Regional_Del_Ajo_Justicia_Y_Orden = Partido(
            nombre = "Movimiento Regional Del Ajo Justicia Y Orden",
            fundacion = 2020,
            domicilio = "-",
            imagen = "",
        )
        val Juntos_Por_El_Peru = Partido(
            nombre = "Juntos Por El Peru",
            fundacion = 2009,
            domicilio = "AV. Arequipa N° 330 Int. 1001 - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/1264",
        )
        val Arequipa_Unidos_Por_El_Gran_Cambio = Partido(
            nombre = "Arequipa Unidos Por El Gran Cambio",
            fundacion = 2013,
            domicilio = "CALLE LA MERCED N° 113",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2261",
        )
        val Partido_Democratico_Somos_Peru = Partido(
            nombre = "Partido Democratico Somos Peru",
            fundacion = 2004,
            domicilio = "JR. TORRE DE LA MERCED N° 165-167, URB. SANTA CATALINA - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/14",
        )
        val Podemos_Peru = Partido(
            nombre = "Podemos Peru",
            fundacion = 2018,
            domicilio = "AV. PASEO COLON N° 323 - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/2731",
        )
        val Fuerza_Popular = Partido(
            nombre = "Fuerza Popular",
            fundacion = 2010,
            domicilio = "AV. 9 DE DICIEMBRE N° 422 - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/1366",
        )
        val Arequipa_Renace = Partido(
            nombre = "Arequipa Renace",
            fundacion = 2006,
            domicilio = "CALLE Colón N° 131-B, oficina 01, primer piso N° 131-B Dpto. 01",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/443",
        )
        val Renovacion_Popular = Partido(
            nombre = "Renovacion Popular",
            fundacion = 2004,
            domicilio = "CALLE COSTA RICA N° 157, URB. LOS PATRICIOS - LIMA",
            imagen = "https://aplicaciones007.jne.gob.pe/srop_publico/Consulta/Simbolo/GetSimbolo/22",
        )

        var partidos = arrayListOf(
            Arequipa_Tradicion_Futuro,
            Arequipa_transformacion,
            Frente_Popular_Agricola_del_Peru,
            Movimiento_Regional_Reveladora,
            Partido_Politico_Nacional_Peru_Libre,
            Yo_Arequipa,
            Movimineto_Regional_Arequipa_Avancemos,
            Avanza_Pais_Partido_De_Integracion_Social,
            Juntos_Por_El_Desarrollo_De_Arequipa,
            Accion_Popular,
            Partido_Morado,
            Fe_En_El_Peru,
            Partido_Frente_De_La_Esperanza_2021,
            Alianza_Para_El_Progreso,
            Fuerza_Arequipenya,
            Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
            Juntos_Por_El_Peru,
            Arequipa_Unidos_Por_El_Gran_Cambio,
            Partido_Democratico_Somos_Peru,
            Podemos_Peru,
            Fuerza_Popular,
            Arequipa_Renace,
            Renovacion_Popular,
        )
    }
}