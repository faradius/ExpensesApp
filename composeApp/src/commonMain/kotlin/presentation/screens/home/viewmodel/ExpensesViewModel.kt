package presentation.screens.home.viewmodel

import domain.model.Expense
import domain.model.ExpenseCategory
import domain.repository.ExpenseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope
import presentation.screens.home.state.ExpensesUiState

class ExpensesViewModel(
    private val repository: ExpenseRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ExpensesUiState())
    val uiState = _uiState.asStateFlow()

    private val allExpense = repository.getAllExpenses()

    init {
        getAllExpenses()
    }

    private fun getAllExpenses() {
        viewModelScope.launch {
            updateState()
        }
    }

    fun addExpense(expense: Expense) {
        viewModelScope.launch {
            repository.addExpense(expense)
            updateState()
        }
    }

    fun editExpense(expense:Expense){
        viewModelScope.launch {
            repository.editExpense(expense)
            updateState()
        }
    }

    fun deleteExpense(expense: Expense){
        viewModelScope.launch {
            repository.deleteExpense(expense)
            updateState()
        }
    }

    private fun updateState(){
        _uiState.update { state ->
            state.copy(
                expenses = allExpense,
                total = allExpense.sumOf { it.amount }
            )
        }
    }

    fun getExpenseWithId(id: Long): Expense {
        return allExpense.first { it.id == id }
    }

    fun getCategories(): List<ExpenseCategory>{
        return  repository.getCategories()
    }

}