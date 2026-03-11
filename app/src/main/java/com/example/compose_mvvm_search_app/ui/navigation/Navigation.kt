package com.example.compose_mvvm_search_app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose_mvvm_search_app.ui.screens.DetailsScreen
import com.example.compose_mvvm_search_app.ui.screens.SearchScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "search") {
        composable("search") {
            SearchScreen(navController)
        }

        composable("details/{title}/{description}") { backStackEntry ->

            val title =
                backStackEntry.arguments?.getString("title") ?: ""

            val description =
                backStackEntry.arguments?.getString("description") ?: ""

            DetailsScreen(
                title, description,
                navController = navController
            )
        }

    }
}