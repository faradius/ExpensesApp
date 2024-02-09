package presentation.screens.home.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.path
import presentation.screens.home.model.TitleTopBarTypes

@Composable
fun getTitleTopAppBar(navigator: Navigator): String {
    var titleTopBar = TitleTopBarTypes.DASHBOARD

    val isOnAddExpenses = navigator.currentEntry.collectAsState(null).value?.route?.route.equals("/addExpenses/{id}")
    if (isOnAddExpenses) {
        titleTopBar = TitleTopBarTypes.ADD
    }

    //Si se obtiene un valor que es pasado por id, significa que estamos modificando un gasto
    val isOnEditExpenses = navigator.currentEntry.collectAsState(null).value?.path<Long>("id")
    isOnEditExpenses?.let {
        titleTopBar = TitleTopBarTypes.EDIT
    }

    return titleTopBar.value
}