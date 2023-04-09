package com.kira.practicecrashcoursecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kira.practicecrashcoursecompose.ui.theme.PracticeCrashCourseComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeCrashCourseComposeTheme {
                var name by remember {
                    mutableStateOf("")
                }
                var names by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)) {
                   Row(
                       modifier = Modifier.fillMaxWidth()
                   ) {
                       OutlinedTextField(
                           value = name,
                           onValueChange = { text ->
                               name = text
                           },
                           modifier = Modifier.weight(1f)
                       )
                       Spacer(modifier = Modifier.width(16.dp))
                       Button(
                           onClick = {
                               if (name.isNotBlank()) {
                                   names = names +name
                                   name = ""
                               }
                           }
                       ) {
                           Text(text = "Add")
                       }
                   }
                    LazyColumn {
                        items(names) { currentName ->
                            Text(
                                text = currentName,
                                modifier =
                                Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp)
                            )
                            Divider()
                        }
                    }
                }
            }
        }
    }
}


