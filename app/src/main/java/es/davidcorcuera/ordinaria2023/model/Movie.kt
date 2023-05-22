package es.davidcorcuera.ordinaria2023.model

data class Movie(
    val title: String,
    val genre: String,
    val director: String,
    val imageResourceId: Int,
    val year: Int,
    val cast: Array<String>
)