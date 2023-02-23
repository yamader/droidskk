package net.dyama.droidskk

import android.inputmethodservice.InputMethodService
import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.findViewTreeCompositionContext
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.ViewTreeLifecycleOwner
import net.dyama.libdskk.SKKContext

class DroidSKK: InputMethodService(), LifecycleOwner {
  private val skk = SKKContext()

  private val view by lazy {
    ComposeView(this).apply {
      setContent {
        Text("asdf")
      }
    }
  }

  init {
    // todo: なんとかする
    ViewTreeLifecycleOwner.set(view, this)
    Log.d("yamaddddddd", "${view.findViewTreeCompositionContext()}")
  }

  // InputMethodService
  override fun onCreateInputView() = view

  // LifecycleOwner
  private val lifecycle = LifecycleRegistry(this)
  override fun getLifecycle() = lifecycle

//  // ViewModelStoreOwner
//  private val store = ViewModelStore()
//  override fun getViewModelStore() = store
}
