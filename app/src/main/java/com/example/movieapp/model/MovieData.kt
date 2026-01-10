package com.example.movieapp.model

object MovieData {
    val sampleMovies = listOf(
        Movie(
            id = 1,
            title = "The Shawshank Redemption",
            overview = "Two imprisoned men bond over a number of years...",
            posterPath = "/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
            releaseDate = "1994-09-23",
            voteAverage = 8.7
        ),
        Movie(
            id = 2,
            title = "The Godfather",
            overview = "The aging patriarch of an organized crime dynasty...",
            posterPath = "/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
            releaseDate = "1972-03-24",
            voteAverage = 8.7
        ),
        // Tambahkan 3 film lagi
        Movie(
            id = 3,
            title = "The Dark Knight",
            overview = "When the menace known as the Joker wreaks havoc...",
            posterPath = "/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
            releaseDate = "2008-07-18",
            voteAverage = 8.5
        ),
        Movie(
            id = 4,
            title = "Pulp Fiction",
            overview = "The lives of two mob hitmen, a boxer, a gangster...",
            posterPath = "/d5iIlFn5s0ImszYzBPb8JPIfbXD.jpg",
            releaseDate = "1994-10-14",
            voteAverage = 8.5
        ),
        Movie(
            id = 5,
            title = "Inception",
            overview = "A thief who steals corporate secrets through...",
            posterPath = "/oYuLEt3zVCKq57qu2F8dT7NIa6f.jpg",
            releaseDate = "2010-07-16",
            voteAverage = 8.3
        )
    )
}