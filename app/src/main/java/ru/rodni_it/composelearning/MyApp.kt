package ru.rodni_it.composelearning

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyApp(content: @Composable () -> Unit) {
    //BasicsCodelabTheme {
        Surface(color = Color.White) {
            content()
        }
    //}
}

@Preview("Content preview")
@Composable
fun MyAppPreview() {
    MyApp {
        NewsStory()
    }
}