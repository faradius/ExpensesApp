package org.developerscracks.previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import data.datasource.ExpenseManager
import presentation.screens.home.components.AllExpensesHeader
import presentation.screens.home.components.ExpensesItem
import presentation.screens.home.components.ExpensesScreen
import presentation.screens.home.components.ExpensesTotalHeader
import presentation.screens.home.state.ExpensesUiState

@Preview(showBackground = true)
@Composable
fun ExpensesTotalHeaderPreview() {
    Box(modifier = Modifier.padding(16.dp)){
        ExpensesTotalHeader(total = 1028.8)
    }

}

@Preview(showBackground = true)
@Composable
fun AllExpensesHeaderPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        AllExpensesHeader()
    }
}

@Preview(showBackground = true)
@Composable
fun ExpensesItemPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        ExpensesItem(expense = ExpenseManager.fakeExpenseList[0], onExpenseClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun ExpenseScreenPreview() {
    ExpensesScreen(
        uiState = ExpensesUiState(
            total = 1028.8,
            expenses = ExpenseManager.fakeExpenseList
        ),
        onExpenseClick = {}
    )
}