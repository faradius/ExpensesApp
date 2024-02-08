package data.repository

import data.datasource.ExpenseManager
import domain.model.Expense
import domain.model.ExpenseCategory
import domain.repository.ExpenseRepository

class ExpenseRepositoryImpl(
    private val expenseManager: ExpenseManager
): ExpenseRepository {
    override fun getAllExpenses(): List<Expense> {
        return expenseManager.fakeExpenseList
    }

    override fun addExpense(expense: Expense) {
        expenseManager.addNewExpense(expense)
    }

    override fun editExpense(expense: Expense) {
        expenseManager.editExpense(expense)
    }

    override fun getCategories(): List<ExpenseCategory> {
        return expenseManager.getCategories()
    }

    override fun deleteExpense(expense: Expense): List<Expense> {
        TODO("Not yet implemented")
    }
}