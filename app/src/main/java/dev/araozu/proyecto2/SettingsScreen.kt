package dev.araozu.laboratorio2

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.araozu.proyecto2.dataStore
import dev.araozu.proyecto2.ui.theme.ThemeViewModel

import dev.araozu.proyecto2.ui.theme.backgroundColor
import dev.araozu.proyecto2.ui.theme.captionColor

@SuppressLint("RememberReturnType")
@Composable
fun SettingsScreen() {

    var name by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var foto by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .background(backgroundColor())
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(40.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Row {
                Text(
                    text = "Ajustes",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(vertical = 10.dp)
                )
            }
            Row {
                TextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Nombre") }
                )
            }

            Row {
                TextField(
                    value = lastname,
                    onValueChange = { lastname = it },
                    label = { Text("Apellidos") }
                )
            }

            Row {
                TextField(
                    value = foto,
                    onValueChange = { foto = it },
                    label = { Text("URL Foto") }
                )
            }

            Row {
                Column {
                    Text(
                        text = "Tamaño de letra",
                        style = TextStyle(
                            color = MaterialTheme.colorScheme.primary,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier.padding(end = 1.dp)
                    )
                }
            }
            Row {
                Tamañodeletra()
            }

            Row {
                Column {
                    Text(
                        text = "Fuente",
                        style = TextStyle(
                            color = MaterialTheme.colorScheme.primary,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier.padding(end = 1.dp)
                    )
                }
            }
            Row {
                Fuentedeletra()
            }

            Row {
                Column {
                    Text(
                        text = "Tema de la aplicacion",
                        style = TextStyle(
                            color = MaterialTheme.colorScheme.primary,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier.padding(end = 1.dp)
                    )
                }
            }
            Row{
                Tema()
            }
        }
    }
}


@Composable
fun Tamañodeletra() {

    val items = listOf("1", "5", "8")
    var valfinal: String by remember { mutableStateOf("1") }
    var expanded by remember { mutableStateOf(false) }

    Box(
        Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .padding(5.dp)
                .clickable {
                    expanded = !expanded
                },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = valfinal,
                color = captionColor(),
                fontSize = 18.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
            Icon(
                imageVector = Icons.Filled.ArrowDropDown,
                contentDescription = "",
            )


            DropdownMenu(expanded = expanded, onDismissRequest = {
                expanded = false
            }) {
                items.forEach { valor ->
                    DropdownMenuItem(
                        text = {
                            Text(text = valor)
                        },
                        onClick = {
                            expanded = false
                            valfinal = valor
                        }
                    )
                }
            }
        }
    }
}


@Composable
fun Tema() {
    val ctx = LocalContext.current
    val viewModel = remember {
        ThemeViewModel(ctx.dataStore)
    }

    LaunchedEffect(viewModel) {
        viewModel.request()
    }


    val items = listOf("oscuro", "claro")
    var valfinal: String by remember { mutableStateOf("claro") }
    var expanded by remember { mutableStateOf(false) }

    var tema: Boolean

    Box(
        Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .padding(5.dp)
                .clickable {
                    expanded = !expanded
                },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = valfinal,
                color = captionColor(),
                fontSize = 18.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
            Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")


            DropdownMenu(expanded = expanded, onDismissRequest = {
                expanded = false
            }) {
                items.forEach { valor ->
                    DropdownMenuItem(
                        text = {
                            Text(text = valor)
                        },
                        onClick = {
                            expanded = false
                            valfinal = valor

                        }
                    )
                }
            }
        }
    }
    if(valfinal.equals("oscuro")){
        tema = true
    }else{
        tema = false
    }
    viewModel.switchToUseDarkMode(tema)

}


@Composable
fun Fuentedeletra() {

    val items = listOf("Sans Sheriff", "Inter", "Dancing")
    var valfinal: String by remember { mutableStateOf("Sanss Sheriff") }
    var expanded by remember { mutableStateOf(false) }

    Box(
        Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .padding(5.dp)
                .clickable {
                    expanded = !expanded
                },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = valfinal,
                color = captionColor(),
                fontSize = 18.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
            Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")

            DropdownMenu(expanded = expanded, onDismissRequest = {
                expanded = false
            }) {
                items.forEach { valor ->
                    DropdownMenuItem(
                        text = {
                            Text(text = valor)
                        },
                        onClick = {
                            expanded = false
                            valfinal = valor
                        }
                    )
                }
            }
        }
    }
}


