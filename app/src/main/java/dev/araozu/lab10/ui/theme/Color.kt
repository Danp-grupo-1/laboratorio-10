package dev.araozu.lab10.ui.theme
/*
import androidx.compose.ui.graphics.Color

val md_theme_light_primary = Color(0xFF006d40)
val md_theme_light_onPrimary = Color(0xFFffffff)
val md_theme_light_primaryContainer = Color(0xFF73fcb2)
val md_theme_light_onPrimaryContainer = Color(0xFF002110)
val md_theme_light_secondary = Color(0xFF4e6355)
val md_theme_light_onSecondary = Color(0xFFffffff)
val md_theme_light_secondaryContainer = Color(0xFFd1e9d6)
val md_theme_light_onSecondaryContainer = Color(0xFF0c1f14)
val md_theme_light_tertiary = Color(0xFF3b6471)
val md_theme_light_onTertiary = Color(0xFFffffff)
val md_theme_light_tertiaryContainer = Color(0xFFbee9f8)
val md_theme_light_onTertiaryContainer = Color(0xFF001f27)
val md_theme_light_error = Color(0xFFba1b1b)
val md_theme_light_errorContainer = Color(0xFFffdad4)
val md_theme_light_onError = Color(0xFFffffff)
val md_theme_light_onErrorContainer = Color(0xFF410001)
val md_theme_light_background = Color(0xFFfbfdf8)
val md_theme_light_onBackground = Color(0xFF191c1a)
val md_theme_light_surface = Color(0xFFfbfdf8)
val md_theme_light_onSurface = Color(0xFF191c1a)
val md_theme_light_surfaceVariant = Color(0xFFdce5dc)
val md_theme_light_onSurfaceVariant = Color(0xFF404942)
val md_theme_light_outline = Color(0xFF717972)
val md_theme_light_inverseOnSurface = Color(0xFFeff1ec)
val md_theme_light_inverseSurface = Color(0xFF2e312e)
val md_theme_light_inversePrimary = Color(0xFF53df98)
val md_theme_light_shadow = Color(0xFF000000)

val md_theme_dark_primary = Color(0xFF53df98)
val md_theme_dark_onPrimary = Color(0xFF00391f)
val md_theme_dark_primaryContainer = Color(0xFF00522f)
val md_theme_dark_onPrimaryContainer = Color(0xFF73fcb2)
val md_theme_dark_secondary = Color(0xFFb5ccba)
val md_theme_dark_onSecondary = Color(0xFF213528)
val md_theme_dark_secondaryContainer = Color(0xFF374b3e)
val md_theme_dark_onSecondaryContainer = Color(0xFFd1e9d6)
val md_theme_dark_tertiary = Color(0xFFa3cddc)
val md_theme_dark_onTertiary = Color(0xFF033541)
val md_theme_dark_tertiaryContainer = Color(0xFF224c58)
val md_theme_dark_onTertiaryContainer = Color(0xFFbee9f8)
val md_theme_dark_error = Color(0xFFffb4a9)
val md_theme_dark_errorContainer = Color(0xFF930006)
val md_theme_dark_onError = Color(0xFF680003)
val md_theme_dark_onErrorContainer = Color(0xFFffdad4)
val md_theme_dark_background = Color(0xFF191c1a)
val md_theme_dark_onBackground = Color(0xFFe2e3df)
val md_theme_dark_surface = Color(0xFF191c1a)
val md_theme_dark_onSurface = Color(0xFFe2e3df)
val md_theme_dark_surfaceVariant = Color(0xFF404942)
val md_theme_dark_onSurfaceVariant = Color(0xFFc0c9c0)
val md_theme_dark_outline = Color(0xFF8a938b)
val md_theme_dark_inverseOnSurface = Color(0xFF191c1a)
val md_theme_dark_inverseSurface = Color(0xFFe2e3df)
val md_theme_dark_inversePrimary = Color(0xFF006d40)
val md_theme_dark_shadow = Color(0xFF000000)

val seed = Color(0xFF2ec27e)
val error = Color(0xFFba1b1b)
*/

//
import android.annotation.SuppressLint
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


val Red = Color.fromRGB("#FF7C74")
val DarkBlue = Color.fromRGB("#0B1729")
val Silver20 = Color.fromRGB("#E5E5E5")
val SilverLight = Color.fromRGB("#F8F7F8")
val White = Color.fromRGB("#FFFFFF")

@Composable
fun backgroundColor() = DarkBlue orInLightTheme SilverLight

@Composable
fun captionColor() = Silver20 orInLightTheme DarkBlue


@Composable
fun fontsize() = 1

private fun Color.Companion.fromRGB(rgb: String) = Color(android.graphics.Color.parseColor(rgb))

@SuppressLint("ConflictingOnColor")
val AppLightColors = lightColors(
    primary = Red,
    secondary = DarkBlue,
    background = White,
    surface = White,
    onPrimary = White,
    onBackground = DarkBlue,
    onSecondary = White,
)

@SuppressLint("ConflictingOnColor")
val AppDarkColors = darkColors(
    primary = Red,
    secondary = White,
    background = DarkBlue,
    surface = DarkBlue,
    onPrimary = DarkBlue,
    onBackground = Silver20,
    onSecondary = DarkBlue,
)