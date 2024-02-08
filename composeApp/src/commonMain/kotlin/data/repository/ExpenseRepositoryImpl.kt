package data.repository

import data.datasource.ExpenseManager
import domain.model.Expense
import domain.model.ExpenseCategory
import domain.repository.ExpenseRepository

class ExpenseRepositoryImpl: ExpenseRepository {
    override fun getAllExpenses(): List<Expense> {
        return ExpenseManager.fakeExpenseList
    }

    override fun addExpense(expense: Expense) {
        ExpenseManager.addNewExpense(expense)
    }

    override fun editExpense(expense: Expense) {
        ExpenseManager.editExpense(expense)
    }

    override fun getCategories(): List<ExpenseCategory> {
        return ExpenseManager.getCategories()
    }
}