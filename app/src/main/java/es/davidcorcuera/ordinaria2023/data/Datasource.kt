package es.davidcorcuera.ordinaria20231.data

import es.davidcorcuera.ordinaria20231.R
import es.davidcorcuera.ordinaria2023.model.Movie

class Datasource {
    fun loadMovies(): List<Movie> {
        return listOf<Movie>(
            Movie("Interstellar",
                "Sci-Fi",
                "Cristopher Nolan",
                R.drawable.interstellar,
                2014,
                arrayOf("Matthew McConaughey",
                    "Anne Hathaway",
                    "Michael Caine",
                    "Matt Damon")
            ),
            Movie(
                "En busca del arca perdida",
                "Aventuras",
                "Steven Spielberg",
                R.drawable.arca_perdida,
                1981,
                arrayOf("Harrison Ford",
                        "Karen Allen",
                        "Paul Freeman")
            ),
            Movie(
                "La vida es bella",
                "Drama",
                "Roberto Begnini",
                R.drawable.la_vida_es_bella,
                1997,
                arrayOf("Roberto Benigni",
                        "Nicoletta Braschi",
                        "Giorgio Cantarini")
            ),
            Movie(
                "Platoon",
                "Bélica",
                "Oliver Stone",
                R.drawable.platoon,
                1986,
                arrayOf("Willem Dafoe",
                        "Charlie Sheen",
                        "Tom Berenger")
            ),
            Movie(
                "El golpe",
                "Comedia",
                "George Roy Hill",
                R.drawable.el_golpe,
                1973,
                arrayOf("Paul Newman",
                        "Robert Redford")
            ),
            Movie(
                "Toy Story",
                "Animación",
                "John Lasseter",
                R.drawable.toy_story,
                1995,
                arrayOf("Tom Hanks",
                    "Tim Allen",
                    "Don Rickles")
            )
        )
    }
}