package dev.araozu.laboratorio2

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.paging.PagingData
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import dev.araozu.laboratorio2.model.Candidato
import dev.araozu.laboratorio2.model.Partido
import dev.araozu.laboratorio2.source.PartidoSource
import dev.araozu.laboratorio2.viewmodel.CandidatoViewModel
import dev.araozu.laboratorio2.viewmodel.PartidoViewModel
import kotlinx.coroutines.flow.Flow

var listaPartidos = Partido.partidos.let {
    it.sortBy { p -> p.nombre }
    it
}
@ExperimentalMaterial3Api
@Composable
fun TarjetaPartido(partido: Partido, navController: NavController) {

    ElevatedCard(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth(),
        onClick = {
            navController.navigate(
                route = Destinations.CandidatosPartidoScreen.createRoute(
                    partido.nombre
                )
            )
        }

    ) {
        Row(
            verticalAlignment = Alignment.Top,
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo del partido",
                modifier = Modifier
                    .height(150.dp)
                // .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = partido.nombre,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = partido.domicilio,
                    fontWeight = FontWeight.Light,
                )
                Text(
                    text = partido.fundacion.toString(),
                    fontWeight = FontWeight.Light,
                )
            }
        }



    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PartidoInfoList(
    navController: NavController,partidoList: Flow<PagingData<Partido>>
) {
    val partidosListItems: LazyPagingItems<Partido> = partidoList.collectAsLazyPagingItems()

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = "Buscar por partido político",
                style = TextStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier.padding(vertical = 10.dp)
            )
        }
        items(partidosListItems) {partido ->
            TarjetaPartido(partido=partido!!, navController)
            Spacer(modifier = Modifier.height(10.dp))

        }
        item {
            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaPartidos(navController: NavController, viewModel: PartidoViewModel) {
    PartidoInfoList(navController =navController , partidoList = viewModel.partidos)
}
/**
 * Renderiza una lista de botones con los partidos políticos
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPartidos( navController: NavController,viewModel: PartidoViewModel) {
  ListaPartidos(navController = navController, viewModel =viewModel )
}
