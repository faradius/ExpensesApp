package data.datasource

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

object SessionCache {
    var configDevice: CrossConfigDevice? = null

    @Composable
    fun isDarkMode(): Boolean {
        //Esto es algo nativo en android
        return configDevice?.isDarkModeEnabled() ?: isSystemInDarkTheme()
    }
}