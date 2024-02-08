package org.developerscracks.previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import domain.model.Expense
import domain.model.ExpenseCategory
import presentation.components.AllExpensesHeader
import presentation.components.ExpensesItem
import presentation.components.ExpensesTotalHeader

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
        ExpensesItem(expense = Expense(
            id = 1L,
            amount = 70.0,
            category = ExpenseCategory.CAR,
            description = "Fin de Semana"
        ), onExpenseClick = {})
    }
}