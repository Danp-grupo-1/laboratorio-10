package dev.araozu.lab10

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.FilledTonalButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.araozu.lab10.model.Distrito
import dev.araozu.lab10.ui.theme.backgroundColor

var listaDistritos = Distrito.values().let {
    it.sortBy { p -> p.name }
    it
}

@Composable
fun BotonDistrito(navController: NavController, distrito: Distrito) {
    Row(modifier = Modifier.fillMaxWidth()) {
        FilledTonalButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                navController.navigate(
                    route = Destinations.CandidatosDistritoScreen.createRoute(
                        distrito.name
                    )
                )
            }
        ) {
            Text(
                text = distrito.toString(),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.Light, fontStyle = FontStyle.Italic
                )
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DistritoInfoList(
    navController: NavController,
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(backgroundColor())
    ) {
        item {
            Text(
                text = "Buscar por distritos",
                style = TextStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier.padding(vertical = 10.dp)
            )
        }
        items(listaDistritos) { distrito ->
            BotonDistrito(navController, distrito = distrito!!)
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}

/**
 * Renderiza una lista de botones con todos los distritos de Arequipa
 */
@Composable
fun ListDistritos(navController: NavController) {
    DistritoInfoList(navController = navController)
}
