pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
  }

  versionCatalogs {
    create("libs") {
      // versions
      version("android-plugin", "7.4.1")
      version("kotlin", "1.7.20")
      version("compose", "1.3.2")

      // libraries
      library("androidx-core", "androidx.core:core-ktx:1.9.0")
      library("androidx-lifecycle-runtime", "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
      library("androidx-activity-compose", "androidx.activity:activity-compose:1.6.1")
      library("androidx-compose-ui", "androidx.compose.ui", "ui").versionRef("compose")
      library("androidx-compose-ui-tooling-preview", "androidx.compose.ui", "ui-tooling-preview").versionRef("compose")
      library("androidx-compose-material3", "androidx.compose.material3:material3:1.0.1")
      library("androidx-datastore", "androidx.datastore:datastore-preferences:1.0.0")

      library("junit", "junit:junit:4.13.2")
      library("androidx-test-ext-junit", "androidx.test.ext:junit:1.1.5")
      library("androidx-test-espresso-core", "androidx.test.espresso:espresso-core:3.5.1")
      library("androidx-compose-ui-test-junit4", "androidx.compose.ui", "ui-test-junit4").versionRef("compose")
      library("androidx-compose-ui-tooling", "androidx.compose.ui", "ui-tooling").versionRef("compose")
      library("androidx-compose-ui-test-manifest", "androidx.compose.ui", "ui-test-manifest").versionRef("compose")

      // plugins
      plugin("android-application", "com.android.application").versionRef("android.plugin")
      plugin("android-library", "com.android.library").versionRef("android.plugin")
      plugin("kotlin-android", "org.jetbrains.kotlin.android").versionRef("kotlin")
    }
  }
}

rootProject.name = "DroidSKK"
include(":app")
