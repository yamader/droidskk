package net.dyama.droidskk.ui.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
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

    Scaffold(
      Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
      {
        LargeTopAppBar(
          { Text(stringResource(R.string.settings_title)) },
          scrollBehavior = scrollBehavior,
        )
      },
      floatingActionButton = {
        FloatingActionButton({ /*TODO*/ }, ) {
          Icon(Icons.Filled.Edit, contentDescription = stringResource(R.string.settings_testing_field))
        }
      }
    ) {
      Column(
        Modifier
          .fillMaxSize()
          .padding(it)
          .verticalScroll(rememberScrollState())
      ) {
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
          text,
          { text = it },
          Modifier.fillMaxWidth(),
          label = { Text(stringResource(R.string.settings_testing_field)) })
        Text("todo: ↑をポップアップのメニューに入れる")
      }
    }
  }
}
