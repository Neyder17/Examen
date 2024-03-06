package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") {
            Login(navController = navController){
                navController.navigate("screen2")
            }
        }
        composable("screen2") {
            Screen2(navController)
        }
        composable("screen3") {
            Screen3(navController)
        }
    }
}



