package presentation.ui

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApp
import presentation.screens.ExpensesScreen


@Composable
fun App() {
    PreComposeApp{
        val colors = getColorsTheme()
        AppTheme {
            ExpensesScreen({})
        }

    }
}