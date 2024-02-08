package ui

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApp
import presentation.ExpensesScreen
import ui.AppTheme
import ui.getColorsTheme


@Composable
fun App() {
    PreComposeApp{
        val colors = getColorsTheme()
        AppTheme {
            ExpensesScreen()
        }

    }
}