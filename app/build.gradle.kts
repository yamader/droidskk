import java.util.*

plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "net.dyama.droidskk"
  compileSdk = 33

  defaultConfig {
    applicationId = "net.dyama.droidskk"
    minSdk = 21
    targetSdk = 33
    versionCode = 10
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables.useSupportLibrary = true
  }

  signingConfigs {
    val keyPropsFile = rootProject.file("key.properties")
    val keyProps = Properties().apply {
      keyPropsFile.inputStream().use { load(it) }
    }

    create("release") {
      storeFile = file(keyProps["storeFile"] as String)
      storePassword = keyProps["storePassword"] as String
      keyAlias = keyProps["keyAlias"] as String
      keyPassword = keyProps["storePassword"] as String
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
      signingConfig = signingConfigs.getByName("release")
    }
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.get()
  }

  kotlinOptions {
    freeCompilerArgs += listOf(
      "-opt-in=androidx.compose.material3.ExperimentalMaterial3Api",
    )
  }
}

dependencies {
  implementation(libs.androidx.core)
  implementation(libs.androidx.lifecycle.runtime)
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.compose.ui)
  implementation(libs.androidx.compose.ui.tooling.preview)
  implementation(libs.androidx.compose.material3)
  implementation(libs.androidx.datastore)

  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.test.ext.junit)
  androidTestImplementation(libs.androidx.test.espresso.core)
  androidTestImplementation(libs.androidx.compose.ui.test.junit4)
  debugImplementation(libs.androidx.compose.ui.tooling)
  debugImplementation(libs.androidx.compose.ui.test.manifest)
}
