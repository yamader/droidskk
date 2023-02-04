package net.dyama.droidskk.ui.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import net.dyama.droidskk.R
import net.dyama.droidskk.ui.theme.DroidSKKTheme

@Composable
@Preview
fun Settings() {
  DroidSKKTheme {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

    // todo: edge-to-edge Scaffold
    Scaffold(
      Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
      {
        LargeTopAppBar(
          { Text(stringResource(R.string.ime_settings)) },
          scrollBehavior = scrollBehavior,
        )
      }
    ) {
      Column(
        Modifier
          .fillMaxSize()
          .padding(it)
          .verticalScroll(rememberScrollState())
      ) {
        Text("Settings")
      }
    }
  }
}
