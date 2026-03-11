package com.example.compose_mvvm_search_app.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AddNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "search") {
        composable("search") {
            SearchScreen(navController)
        }
    }
}