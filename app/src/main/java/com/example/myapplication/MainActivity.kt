package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    // The onCreate function is called when the activity is started
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting the content of the app using Jetpack Compose
        setContent {
            // Applying the app's theme
            MyApplicationTheme {
                // Creating a surface (a container) that will fill the entire screen
                Surface(
                    modifier = Modifier.fillMaxSize(), // Make it take up the whole screen
                    color = MaterialTheme.colorScheme.background // Set background color from the theme
                ) {
                    // Call the Greeting function to display "Hello, Android!"
                    Greeting("Android")
                }
            }
        }
    }
}

// A Composable function that creates a text element to display the message
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Displaying the text "Hello, Android!" using the Text composable
    Text(
        text = "Hello, $name!", // This displays the "Hello, Android!" message
        modifier = modifier // Modifier allows customizing the layout
    )
}

// A Preview function to show what the app will look like without running it on a device
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    // Applying the theme and displaying the Greeting function in the preview
    MyApplicationTheme {
        Greeting("Android")
    }
}