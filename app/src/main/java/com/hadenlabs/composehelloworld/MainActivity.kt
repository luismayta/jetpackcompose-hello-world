package com.hadenlabs.composehelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      App()
    }
  }
}

@Preview(showBackground = true)
@Composable
fun App() {
  LazyColumn(
    modifier = Modifier
      .fillMaxSize()
      .background(Color.Red)
  ) {
    item {
      Image(
        modifier = Modifier
          .fillMaxWidth()
          .height(200.dp),
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo Hadenlabs",
      )
      Text(
        text = "Hadenlabs",
        fontSize = 32.sp,
        color = Color.White,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
      )
      Text(
        text = "Lucho Mayta",
        color = Color.White,
        fontSize = 16.sp
      )
      LazyRow (horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        item {
          Text(text = "Go")
          Text(text = "Python")
          Text(text = "Kotlin")
          Text(text = "TypeScript")
          Text(text = "Lua")
          Text(text = "Rust")
          Text(text = "bash")
        }
      }

    }
  }
}


