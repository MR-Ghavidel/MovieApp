package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.ui.screens.DetailsScreen
import com.example.movieapp.ui.screens.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(route = MovieScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(
            route = MovieScreens.DetailsScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            DetailsScreen(
                navController = navController,
                movieId = backStackEntry.arguments?.getString("movie")
            )
        }
    }
}