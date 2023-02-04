package net.dyama.droidskk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import net.dyama.droidskk.ui.settings.Settings

class SettingsActivity: ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { Settings() }
  }
}
