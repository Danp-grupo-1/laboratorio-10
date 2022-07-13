package dev.araozu.laboratorio2

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.Button
import androidx.compose.material.RadioButton
import androidx.compose.material.Switch
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.paging.PagingData
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import dev.araozu.laboratorio2.model.Distrito
import dev.araozu.laboratorio2.ui.theme.*
import dev.araozu.laboratorio2.ui.theme.Fonts.Caption
import kotlinx.coroutines.flow.Flow


@SuppressLint("RememberReturnType")
@Composable
fun SettingsScreen() {
    val context = LocalContext.current

    val viewModel = remember {
        ThemeViewModel(context.dataStore)
    }
    val value = viewModel.state.observeAsState().value
    val systemInDarkTheme = isSystemInDarkTheme()

    val darkModeChecked by remember(value) {
        val checked = when (value) {
            null -> systemInDarkTheme
            else -> value
        }
        mutableStateOf(checked)
    }
    val useDeviceModeChecked by remember(value) {
        val checked = when (value) {
            null -> true
            else -> false
        }
        mutableStateOf(checked)
    }

    LaunchedEffect(viewModel) {
        viewModel.request()
    }

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
                Text(
                    text = "Modo Oscuro",
                    color = captionColor(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
                Switch(
                    checked = darkModeChecked,
                    onCheckedChange = { viewModel.switchToUseDarkMode(it) })
            }
            Row {
                Text(
                    text = "Tema del Sistema",
                    color = captionColor(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
                Switch(
                    checked = useDeviceModeChecked,
                    onCheckedChange = { viewModel.switchToUseSystemSettings(it) })
            }
        }
    }
}


