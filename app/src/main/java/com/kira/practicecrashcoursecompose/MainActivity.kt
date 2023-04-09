package com.kira.practicecrashcoursecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kira.practicecrashcoursecompose.ui.theme.PracticeCrashCourseComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeCrashCourseComposeTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(count = 10) {index ->
            Image(painter = painterResource(
                id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.background(Color.Red).size(100.dp)
            )
        }
    }



}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PracticeCrashCourseComposeTheme {
        Greeting("Android")
    }
}