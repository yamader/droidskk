package net.dyama.droidskk.ui.keyboard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import net.dyama.droidskk.ui.theme.DroidSKKTheme
import net.dyama.libdskk.SKKContext

@Composable
fun Keyboard(ctx: SKKContext) {
  DroidSKKTheme {
    Text("Keyboard")
  }
}
