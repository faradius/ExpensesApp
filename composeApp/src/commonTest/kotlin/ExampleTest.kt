import domain.model.Expense
import domain.model.ExpenseCategory
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class ExampleTest {

    @Test
    fun sum_must_succed() {
        //Given - Dado cierto tipo de datos, cierto objeto, cierta variable, cierto valor
        val x = 5
        val y = 10

        //When - cuando se ejecuta cierta función, cierto método, cierto comportamiento
        val result = x + y

        //Then - Entonces se espera cierto resultado, cierto comportamiento, cierta acción
        assertEquals(15, result)
    }

    @Test
    fun sum_must_fail() {
        //Given - Dado cierto tipo de datos, cierto objeto, cierta variable, cierto valor
        val x = 5
        val y = 10

        //When - cuando se ejecuta cierta función, cierto método, cierto comportamiento
        val result = x + y

        //Then - Entonces se espera cierto resultado, cierto comportamiento, cierta acción
        assertNotEquals(10, result)
    }

    @Test
    fun expense_model_list_test() {
        // Given
        val expenseList = mutableListOf<Expense>()
        val expense = Expense(id = 1, amount = 4.5, category = ExpenseCategory.CAR, description = "Combustible")

        // When
        expenseList.add(expense)

        // Then
        assertContains(expenseList, expense)
    }

    @Test
    fun expense_model_param_test_success() {
        // Given
        val expenseList = mutableListOf<Expense>()
        val expense = Expense(id = 1, amount = 4.5, category = ExpenseCategory.OTHER, description = "Combustible")
        val expense2 =  Expense(id = 2, amount = 14.5, category = ExpenseCategory.OTHER, description = "Limpieza")

        // When
        expenseList.add(expense)
        expenseList.add(expense2)

        // Then
        assertEquals(expenseList[0].category, expenseList[1].category)
    }

    @Test
    fun expense_model_param_test_fail() {
        // Given
        val expenseList = mutableListOf<Expense>()
        val expense = Expense(id = 1, amount = 4.5, category = ExpenseCategory.CAR, description = "Combustible")
        val expense2 =  Expense(id = 2, amount = 14.5, category = ExpenseCategory.OTHER, description = "Limpieza")

        // When
        expenseList.add(expense)
        expenseList.add(expense2)

        // Then
        assertNotEquals(expenseList[0].category, expenseList[1].category)
    }
}