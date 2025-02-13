package com.example.movieapp.common

import com.example.movieapp.model.Movie

val movieList = listOf(
    "Movie 1",
    "Movie 2",
    "Movie 3",
    "Movie 4",
    "Movie 5",
    "Movie 6",
    "Movie 7",
    "Movie 8",
    "Movie 9",
    "Movie 10",
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "tt0111161",
            title = "The Shawshank Redemption",
            year = "1994",
            genre = "Drama",
            director = "Frank Darabont",
            actors = "Tim Robbins, Morgan Freeman",
            plot = "Two imprisoned men bond over several years, finding solace and eventual redemption through acts of common decency.",
            poster = "https://m.media-amazon.com/images/M/MV5BMDAyY2FhYjctNDc5OS00MDNlLThiMGUtY2UxYWVkNGY2ZjljXkEyXkFqcGc@._V1_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BNjQ2NDA3MDcxMF5BMl5BanBnXkFtZTgwMjE5NTU0NzE@._V1_QL75_UX500_CR0,47,500,281_.jpg",
                "https://static1.moviewebimages.com/wordpress/wp-content/uploads/2023/04/the_shawshank_redemption_1200x630.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMTM0NjUxMDk5MF5BMl5BanBnXkFtZTcwNDMxNDY3Mw@@._V1_.jpg"
            ),
            rating = "9.3"
        ),
        Movie(
            id = "tt0068646",
            title = "The Godfather",
            year = "1972",
            genre = "Crime, Drama",
            director = "Francis Ford Coppola",
            actors = "Marlon Brando, Al Pacino, James Caan",
            plot = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            poster = "https://m.media-amazon.com/images/M/MV5BNGEwYjgwOGQtYjg5ZS00Njc1LTk2ZGEtM2QwZWQ2NjdhZTE5XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BYzIzODc2YjktNjA3Yi00NTcxLWEzYWUtMzI5MzRhYzY5NjYzXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_QL75_UX500_CR0,47,500,281_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTkzNTkxMDUtNDJmMi00MjNhLWIyNjItN2RjZmE0MjllNTI0XkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX500_CR0,0,500,281_.jpg",
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2022/08/09/223359.jpg"
            ),
            rating = "9.2"
        ),
        Movie(
            id = "tt0468569",
            title = "The Dark Knight",
            year = "2008",
            genre = "Action, Crime, Drama",
            director = "Christopher Nolan",
            actors = "Christian Bale, Heath Ledger, Gary Oldman",
            plot = "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
            poster = "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BZWI2YzhjNmMtNjkzZi00MzdiLWEzZDUtNzM5NTBhNDBlZjExXkEyXkFqcGc@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjA1MTQ0ODM5OV5BMl5BanBnXkFtZTcwODEyMjc2Nw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTc3ODQ0NTI2OF5BMl5BanBnXkFtZTcwOTEyMjc2Nw@@._V1_.jpg"
            ),
            rating = "9"
        ),
        Movie(
            id = "tt0110912",
            title = "Pulp Fiction",
            year = "1994",
            genre = "Crime, Drama",
            director = "Quentin Tarantino",
            actors = "John Travolta, Uma Thurman, Samuel L. Jackson",
            plot = "The lives of two mob hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
            poster = "https://m.media-amazon.com/images/M/MV5BYTViYTE3ZGQtNDBlMC00ZTAyLTkyODMtZGRiZDg0MjA2YThkXkEyXkFqcGc@._V1_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMjAyMjUyNzg1Ml5BMl5BanBnXkFtZTgwNzAwMzg5MTE@._V1_QL75_UX329_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTQ2MDk3ODAwMV5BMl5BanBnXkFtZTgwNzE4OTEwMjE@._V1_QL75_UX320_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTUwNTE0NjU2Ml5BMl5BanBnXkFtZTcwMDE0MzU5Ng@@._V1_.jpg"
            ),
            rating = "8.9"
        ),
        Movie(
            id = "tt0109830",
            title = "Forrest Gump",
            year = "1994",
            genre = "Drama, Romance",
            director = "Robert Zemeckis",
            actors = "Tom Hanks, Robin Wright, Gary Sinise",
            plot = "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other historical events unfold through the perspective of an Alabama man with an IQ of 75.",
            poster = "https://m.media-amazon.com/images/M/MV5BNDYwNzVjMTItZmU5YS00YjQ5LTljYjgtMjY2NDVmYWMyNWFmXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BYjk1MzZhZjItMjM4Yi00M2M4LWI4NmEtYTdiYjMwOGRjZGI0XkEyXkFqcGc@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BN2U4NGY0NjItZWUwMC00MzNiLTk4NzQtYmIyNTFiMDRkYTllXkEyXkFqcGc@._V1_QL75_UX324_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTM0NzMzNDYyOV5BMl5BanBnXkFtZTcwODM2NDY3Mw@@._V1_.jpg"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "tt1375666",
            title = "Inception",
            year = "2010",
            genre = "Action, Adventure, Sci-Fi",
            director = "Christopher Nolan",
            actors = "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page",
            plot = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
            poster = "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMTY3MzMzMDgyMF5BMl5BanBnXkFtZTcwMzY0OTk1Mw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTk1MzExMjM5Nl5BMl5BanBnXkFtZTcwNjI2NjQ0Mw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTQ3NTU4MjA2Ml5BMl5BanBnXkFtZTcwNjQ0OTk1Mw@@._V1_.jpg"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "tt0133093",
            title = "The Matrix",
            year = "1999",
            genre = "Action, Sci-Fi",
            director = "Lana Wachowski, Lilly Wachowski",
            actors = "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
            plot = "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
            poster = "https://m.media-amazon.com/images/M/MV5BN2NmN2VhMTQtMDNiOS00NDlhLTliMjgtODE2ZTY0ODQyNDRhXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BNzM4OTkzMjcxOF5BMl5BanBnXkFtZTgwMTkxMjI1MTI@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BODRlZmY0NzktNTUyNi00OGRlLTgyOTMtYzQ2MDQ1OTUzZjEwXkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX500_CR0,0,500,281_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNDdiYzJjNmYtMzRhMC00Yjc3LTlmNjItMjkyMzg0NzBiOTllXkEyXkFqcGc@._V1_.jpg"
            ),
            rating = "8.7"
        ),
    )
}