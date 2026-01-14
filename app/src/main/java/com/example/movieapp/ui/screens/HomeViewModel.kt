package com.example.movieapp.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.movieapp.model.Movie
import com.example.movieapp.model.MovieData


class HomeViewModel : ViewModel() {
    //State List Movie
    var movies by mutableStateOf<List<Movie>>(emptyList())
        private set

    //State Search Query
    var searchQuery by mutableStateOf("")
        private set

    //State Loading
    var isLoading by mutableStateOf(false)
        private set

    //State Error
    var error by mutableStateOf<String?>("")

    //State Favorite Movie
    var favoriteMovieIds by mutableStateOf<Set<Int>>(emptySet())
        private set

    init {
        loadMovies()
    }

    fun loadMovies(){
        isLoading = true
        error = null

        //Contoh delay
        Thread.sleep(1000)

        movies = MovieData.sampleMovies
        isLoading = false
    }

    fun updateSearchQuery(query : String){
        searchQuery = query
    }

    fun toggleFavorite(movieId: Int){
        favoriteMovieIds = if (favoriteMovieIds.contains(movieId)){
            favoriteMovieIds - movieId
        }else{
            favoriteMovieIds + movieId
        }
    }

    val filteredMovies: List<Movie>
        get() = if (searchQuery.isBlank()){
            movies
        } else {
            movies.filter { movie ->
                movie.title.contains(searchQuery, ignoreCase = true) ||
                movie.overview.contains(searchQuery, ignoreCase = true)
            }
        }
}