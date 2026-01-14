package com.example.movieapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movieapp.model.MovieData
import com.example.movieapp.ui.screens.DetailScreen
import com.example.movieapp.ui.screens.HomeScreen

sealed class Screen(val route: String){
    object Home : Screen("Home")
    object Detail: Screen("detail/{movieId}"){
        fun createRoute(movieId: Int) = "detail/$movieId"
    }
}

@Preview(showBackground = true)
@Composable
fun MovieNavHost(
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(Screen.Home.route){
            HomeScreen(
                onMovieClick = { movieId ->
                    navController.navigate(Screen.Detail.createRoute(movieId))
                }
            )
        }

        composable(Screen.Detail.route){ backStackEntry ->
            val movieId = backStackEntry.arguments?.getString("movieId")?.toIntOrNull()
            val movie = remember(movieId) {
                MovieData.sampleMovies.find { it.id == movieId}
            }

            if (movie != null){
                DetailScreen(
                    movie = movie,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}