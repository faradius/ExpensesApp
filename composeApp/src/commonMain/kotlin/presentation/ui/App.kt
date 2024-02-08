package presentation.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import data.datasource.ExpenseManager
import data.repository.ExpenseRepositoryImpl
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.flow.collectAsStateWithLifecycle
import moe.tlaster.precompose.viewmodel.viewModel
import presentation.screens.home.ExpensesScreen
import presentation.screens.home.viewmodel.ExpensesViewModel


@Composable
fun App() {
    PreComposeApp{
        val colors = getColorsTheme()
        val viewModel = viewModel(modelClass = ExpensesViewModel::class){
            ExpensesViewModel(ExpenseRepositoryImpl(ExpenseManager))
        }

        //Un delegador es cuando le damos una función al sistema para que cree una instancia
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        AppTheme {
            ExpensesScreen(
                uiState = uiState,
                onExpenseClick = {}
            )
        }

    }
}