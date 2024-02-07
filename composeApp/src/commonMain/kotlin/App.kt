import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApp


@Composable
fun App() {
    PreComposeApp{
        val colors = getColorsTheme()
        AppTheme {
            Text("Hello, World!", color = colors.textColor)
        }

    }
}