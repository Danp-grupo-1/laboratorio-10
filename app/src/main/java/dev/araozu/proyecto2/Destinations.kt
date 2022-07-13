package dev.araozu.proyecto2

sealed class Destinations(val route: String) {
    object DistritosScreen : Destinations("distritos_screen")
    object PartidosScreen : Destinations("partidos_screen")
    object CandidatosDistritoScreen : Destinations("candidatos_screen/?distrito={distrito}") {
        fun createRoute(distrito: String) = "candidatos_screen/?distrito=$distrito"
    }

    object CandidatosPartidoScreen : Destinations("candidatos_screen/?partido={partido}") {
        fun createRoute(partido: String) = "candidatos_screen/?partido=$partido"
    }

    object SettingsScreen: Destinations("settings_screen")
}
