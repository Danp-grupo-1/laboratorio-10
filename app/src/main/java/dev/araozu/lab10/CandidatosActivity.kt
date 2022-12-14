package dev.araozu.lab10

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.paging.PagingData
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.compose.AsyncImage
import dev.araozu.lab10.model.Candidato
import dev.araozu.lab10.model.Distrito
import dev.araozu.lab10.ui.theme.backgroundColor
import dev.araozu.lab10.viewmodel.CandidatoViewModel
import kotlinx.coroutines.flow.Flow


/**
 * Muestra una tarjeta de un candidato
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TarjetaCandidato(candidato: Candidato) {
    val tarjetaAbierta = remember { mutableStateOf(false) }

    ElevatedCard(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth(),
        onClick = {
            android.util.Log.d("TARJETA", "click, $tarjetaAbierta")
            tarjetaAbierta.value = !tarjetaAbierta.value
        }
    ) {
        Row(
            verticalAlignment = Alignment.Top,
        ) {
            AsyncImage(
                model = candidato.foto,
                placeholder = painterResource(id = R.drawable.user),
                contentDescription = "Imagen de perfil",
                modifier = Modifier
                    .height(125.dp)
                    .width(125.dp)
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = candidato.nombre,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = candidato.partido,
                    fontWeight = FontWeight.Light,
                )
                Text(
                    text = candidato.distrito.toString(),
                    fontWeight = FontWeight.Light,
                )
            }
        }


        AnimatedVisibility(visible = tarjetaAbierta.value) {
            Text(
                text = candidato.biografia,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CandidatoInfoList(
    titulo: String,
    onBack: () -> Unit,
    candidatoList: Flow<PagingData<Candidato>>,
) {
    val candidatesListItems: LazyPagingItems<Candidato> = candidatoList.collectAsLazyPagingItems()
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text(titulo) },
                navigationIcon = {
                    IconButton(onClick = { onBack() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
            )
        },
        content = {
            LazyColumn(
                modifier = Modifier
                    .background(backgroundColor())
                    .padding(it)
            ) {
                items(
                    candidatesListItems,
                ) { candidato ->
                    TarjetaCandidato(candidato = candidato!!)
                    Spacer(modifier = Modifier.height(15.dp))
                }
                item {
                    Spacer(modifier = Modifier.height(100.dp))
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaCandidatos(titulo: String, onBack: () -> Unit, viewModel: CandidatoViewModel) {
    CandidatoInfoList(titulo, onBack, candidatoList = viewModel.candidatos)
}

/**
 * Muestra una lista de candidatos filtrados segun un distrito
 */
@Composable
fun ListCandidatosDistrito(
    distritoStr: String,
    navController: NavController,
) {
    val distrito = Distrito.fromString(distritoStr)
    val viewModel = CandidatoViewModel(filtroDistrito = distritoStr)

    ListaCandidatos(
        titulo = distrito?.toString() ?: "Distritos",
        onBack = {
            navController.navigate(
                route = Destinations.DistritosScreen.route
            )
        },
        viewModel,
    )
}


/**
 * Muestra una lista de candidatos filtrados segun un partido politico
 */
@Composable
fun ListCandidatosPartido(
    partidoStr: String,
    navController: NavController,
) {
    val partido = partidoStr
    val viewModel = CandidatoViewModel(filtroPartido = partidoStr)

    ListaCandidatos(
        titulo = partido,
        onBack = {
            navController.navigate(
                route = Destinations.PartidosScreen.route
            )
        },
        viewModel,
    )
}
