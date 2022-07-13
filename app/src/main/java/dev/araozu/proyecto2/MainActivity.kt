package dev.araozu.proyecto2

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.datastore.preferences.preferencesDataStore
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.firebase.firestore.FirebaseFirestore
import dev.araozu.proyecto2.model.AppDatabase
import dev.araozu.proyecto2.model.Candidato
import dev.araozu.proyecto2.model.Distrito
import dev.araozu.proyecto2.model.Partido
import dev.araozu.proyecto2.ui.theme.AppTheme
//import dev.araozu.laboratorio2.ui.theme.Proyecto1Theme
import dev.araozu.proyecto2.viewmodel.PartidoViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val Context.dataStore by preferencesDataStore("settings")

/**
 * Inicializa la base de datos de Room. Si Room esta vacio,
 * recupera los registros de Firebase.
 */
suspend fun initializeRoom(ctx: Context) {
    val db = AppDatabase.getDatabase(ctx)
    val listaCandidatosRoom = db.candidatoDao().getAll()

    // Si hay datos en Room terminar.
    if (listaCandidatosRoom.isNotEmpty()) return

    // Retrieve data from Firestore: Candidatos
    val firestoreDB = FirebaseFirestore.getInstance()
    firestoreDB.collection("candidatos")
        .get()
        .addOnCompleteListener {
            if (it.isSuccessful) {
                val candidatos = ArrayList<Candidato>(it.result.size())

                for (doc in it.result) {
                    val candidato = Candidato(
                        nombre = doc["nombre"] as String,
                        partido = doc["partido"] as String,
                        foto = doc["foto"] as String,
                        biografia = doc["biografia"] as String,
                        distrito = Distrito.fromString(doc["distrito"] as String)!!
                    )
                    candidatos.add(candidato)
                }

                runBlocking {
                    db.candidatoDao().insertAll(candidatos)
                    Log.d("MAIN", "Candidatos insertados")
                }

            } else {
                Log.w("MAIN", "Error getting documents: ", it.exception)
            }
        }

    firestoreDB.collection("partidos")
        .get()
        .addOnCompleteListener {
            if (it.isSuccessful) {
                val partidos = ArrayList<Partido>(it.result.size())

                for (doc in it.result) {
                    val partido = Partido(
                        nombre = doc["nombre"] as String,
                        fundacion = (doc["fundacion"] as Long).toInt(),
                        domicilio = doc["domicilio"] as String,
                        imagen = doc["imagen"] as String,
                    )
                    partidos.add(partido)
                }

                runBlocking {
                    db.partidoDao().insertAll(partidos)
                    Log.d("MAIN", "Partidos insertados")
                }

            } else {
                Log.w("MAIN", "Error getting documents: ", it.exception)
            }
        }

}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        runBlocking {
            launch {
                initializeRoom(this@MainActivity)
            }
        }

        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationHost()
                }
            }
        }
    }
}

/**
 * Configura las rutas para cambiar entre interfaces
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController) }
    ) {
        NavHost(
            navController = navController,
            startDestination = Destinations.DistritosScreen.route
        ) {
            composable(
                route = Destinations.DistritosScreen.route
            ) {
                ListDistritos(navController)
            }

            composable(
                route = Destinations.CandidatosDistritoScreen.route,
                arguments = listOf(navArgument("distrito") { defaultValue = "Arequipa" })
            ) {
                val distrito = it.arguments?.getString("distrito")
                requireNotNull(distrito)
                ListCandidatosDistrito(distrito, navController)
            }
            composable(
                route = Destinations.PartidosScreen.route
            ) {
                ListPartidos(navController, viewModel = PartidoViewModel())
            }
            //
            composable(
                route = Destinations.CandidatosPartidoScreen.route,
                arguments = listOf(navArgument("partido") {
                    defaultValue = "Arequipa_Tradicion_Futuro"
                })
            ) {
                val partido = it.arguments?.getString("partido")
                requireNotNull(partido)
                ListCandidatosPartido(partido, navController)
            }
            //Settings
            composable(
                route = Destinations.SettingsScreen.route
            ) {
                SettingsScreen()
            }
        }
    }

}


// Bottom Navigation

sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {
    object DistritosBottom :
        BottomNavItem("Distritos", R.drawable.ic_district, Destinations.DistritosScreen.route)

    object PartidosBottom :
        BottomNavItem("Partidos", R.drawable.ic_party, Destinations.PartidosScreen.route)

    object SettingsBottom :
        BottomNavItem("Settings", R.drawable.ic_settings, Destinations.SettingsScreen.route)
}

@Composable
fun BottomNavigation(navController: NavController) {
    val items = listOf(
        BottomNavItem.DistritosBottom,
        BottomNavItem.PartidosBottom,
        BottomNavItem.SettingsBottom
    )

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 12.sp
                    )
                },
                alwaysShowLabel = true,
                selected = currentRoute == item.screen_route,
                onClick = {
                    navController.navigate(item.screen_route) {

                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

