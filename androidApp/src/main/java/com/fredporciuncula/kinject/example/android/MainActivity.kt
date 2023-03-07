package com.fredporciuncula.kinject.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fredporciuncula.kinject.example.Greeting

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White,
      ) {
        Text(text = Greeting().greet())
      }
    }
  }
}
