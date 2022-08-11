package dev.araozu.lab10.model

import java.lang.IllegalArgumentException

enum class Distrito {
    ALTO_SELVA_ALEGRE,
    AREQUIPA,
    CAYMA,
    CERRO_COLORADO,
    CHARACATO,
    CHIGUATA,
    JACOBO_HUNTER,
    JOSE_LUIS_BUSTAMANTE_Y_RIVERO,
    MARIANO_MELGAR,
    MIRAFLORES,
    PAUCARPATA,
    SABANDIA,
    SACHACA,
    SOCABAYA,
    TIABAYA,
    UCHUMAYO,
    YANAHUARA,
    YURA;

    companion object {
        fun fromString(distrito: String): Distrito? {
            return try {
                valueOf(distrito.uppercase().replace(" ", "_"))
            } catch (e: IllegalArgumentException) {
                null
            }
        }
    }

    override fun toString(): String {
        return when (this) {
            ALTO_SELVA_ALEGRE -> "ALTO SELVA ALEGRE"
            CERRO_COLORADO -> "CERRO COLORADO"
            JACOBO_HUNTER -> "JACOBO HUNTER"
            JOSE_LUIS_BUSTAMANTE_Y_RIVERO -> "JOSE LUIS BUSTAMANTE Y RIVERO"
            MARIANO_MELGAR -> "MARIANO MELGAR"
            else -> super.toString()
        }
    }
}
