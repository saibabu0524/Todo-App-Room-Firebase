package com.saibabui.todo_app_room_firebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saibabui.todo_app_room_firebase.auth.singup.presentation.SignUpScreen
import com.saibabui.todo_app_room_firebase.dashboard.DashBoardScreen
import com.saibabui.todo_app_room_firebase.ui.theme.TodoAppRoomFirebaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoAppRoomFirebaseTheme() {
                val navController = rememberNavController()

                NavHost(navController, startDestination = "dashboard") {
                    composable("dashboard") { DashBoardScreen(navController) }
                    composable("signup") { SignUpScreen() }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TodoAppRoomFirebaseTheme {
        Greeting("Android")
    }
}