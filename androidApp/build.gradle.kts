plugins {
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.android.application)
}

android {
  namespace = "com.fredporciuncula.kinject.example.android"
  compileSdk = 33
  defaultConfig {
    applicationId = "com.fredporciuncula.kinject.example.android"
    minSdk = 24
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
}

dependencies {
  implementation(project(":shared"))
  implementation(libs.androidx.activity.compose)
  implementation(platform(libs.compose.bom))
  implementation(libs.compose.foundation)
  implementation(libs.compose.material3)
  implementation(libs.compose.runtime)
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.toolingPreview)
  debugRuntimeOnly(libs.compose.ui.tooling)
}
