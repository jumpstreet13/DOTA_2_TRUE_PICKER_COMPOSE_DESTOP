import androidx.compose.desktop.Window
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.imageFromResource

fun main() = Window(
    title = "Dota 2, true picker"
) {
    MaterialTheme {
        Image(
            bitmap = imageFromResource("drawable/dota2.jpeg"),
            contentDescription = "Dota",
            modifier = androidx.compose.ui.Modifier.fillMaxSize()
        )
    }
}