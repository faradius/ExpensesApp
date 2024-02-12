import androidx.compose.ui.window.ComposeUIViewController
import di.appModule
import org.koin.core.context.startKoin
import presentation.screens.home.HomeScreen

fun MainViewController() = ComposeUIViewController { HomeScreen() }

fun initKoin(){
    startKoin{
        modules(appModule())
    }.koin
}