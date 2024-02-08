package presentation.screens.home.state

import domain.model.Expense

data class ExpensesUiState(
    val expenses: List<Expense> = emptyList(),
    val total: Double = 0.0
)
