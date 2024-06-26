//PROGRAM ON 6.2.7.1 EXERCISE IN ESSENTIAL SCALA
case class Film(
                 name: String,
                 yearOfRelease: Int,
                 imdbRating: Double
               )

case class Director(
                     firstName: String,
                     lastName: String,
                     yearOfBirth: Int,
                     films: Seq[Film]
                   )

object filmDatabaseApp1 
{
  def main(args: Array[String]): Unit = {
    val memento = new Film("Memento", 2000, 8.5)
    val darkKnight = new Film("Dark Knight", 2008, 9.0)
    val inception = new Film("Inception", 2010, 8.8)
    val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7)
    val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9)
    val unforgiven = new Film("Unforgiven", 1992, 8.3)
    val granTorino = new Film("Gran Torino", 2008, 8.2)
    val invictus = new Film("Invictus", 2009, 7.4)
    val predator = new Film("Predator", 1987, 7.9)
    val dieHard = new Film("Die Hard", 1988, 8.3)
    val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6)
    val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8)
    val eastwood = new Director("Clint", "Eastwood", 1930,
      Seq(highPlainsDrifter, outlawJoseyWales, unforgiven, granTorino, invictus))
    val mcTiernan = new Director("John", "McTiernan", 1951,
      Seq(predator, dieHard, huntForRedOctober, thomasCrownAffair))
    val nolan = new Director("Christopher", "Nolan", 1970,
      Seq(memento, darkKnight, inception))
    val someGuy = new Director("Just", "Some Guy", 1990,
      Seq())
    val directors = Seq(eastwood, mcTiernan, nolan, someGuy)

    println("Nolan Films:")
    println(nolan.films.map(_.name))

    println("All Films:")
    println(directors.flatMap(_.films).map(_.name))

    println("Earliest McTiernan Film:")
    println(mcTiernan.films.map(_.yearOfRelease).min)

    println("Films sorted by IMDB rating:")
    println(directors.flatMap(_.films).sortBy(-_.imdbRating).map(f => s"${f.name}: ${f.imdbRating}"))

    println("Average IMDB rating:")
    val allFilmsList = directors.flatMap(_.films)
    val averageScore = allFilmsList.map(_.imdbRating).sum / allFilmsList.size
    println(averageScore)

    println("Tonight's Listings:")
    val tonightListings = for {
      director <- directors
      film <- director.films
    } yield s"Tonight only! ${film.name} by ${director.firstName} ${director.lastName}!"
    tonightListings.foreach(println)

    println("Earliest film by any director:")
    val earliestFilm = directors.flatMap(_.films).minBy(_.yearOfRelease)
    println(s"Earliest film: ${earliestFilm.name} (${earliestFilm.yearOfRelease})")
  }
}
