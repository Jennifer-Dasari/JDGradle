object favorites {
  val people = Set(
    "Alice", 
    "Bob", 
    "Charlie", 
    "Derek",
    "Edith", 
    "Fred"
  )
  val ages = Map(
    "Alice" -> 20,
    "Bob" -> 30, 
    "Charlie" -> 50,
    "Derek" -> 40,
    "Edith" -> 10, 
    "Fred" -> 60
  )
  val favoriteColors = Map(
    "Bob" -> "green",
    "Derek" -> "magenta", 
    "Fred" -> "yellow"
  )
  val favoriteLolcats = Map(
    "Alice" -> "Long Cat",
    "Charlie" -> "Ceiling Cat", 
    "Edith" -> "Cloud Cat"
  )

  def favoriteColor(name: String): Option[String] = {
    favoriteColors.get(name)
  }

  def favoriteColorOrDefault(name: String): String = {
    favoriteColors.getOrElse(name, "beige")
  }

  def printColors(): Unit = {
    people.foreach { person =>
      val color = favoriteColors.getOrElse(person, "beige")
      println(s"$person's favorite color is $color")
    }
  }

  def lookup[A](name: String, map: Map[String, A]): Option[A] = {
    map.get(name)
  }

  def colorOfOldestPerson(): String = {
    val oldestPerson = ages.maxBy(_._2)._1
    favoriteColors.getOrElse(oldestPerson, "beige")
  }

  def main(args: Array[String]): Unit = {
    println(favoriteColor("Bob"))   // Output: Some(green)
    println(favoriteColor("Alice")) // Output: None

    println(favoriteColorOrDefault("Bob"))   // Output: green
    println(favoriteColorOrDefault("Alice")) // Output: beige

    printColors()

    println(lookup("Bob", ages))            // Output: Some(30)
    println(lookup("Alice", favoriteLolcats)) // Output: Some(Long Cat)

    println(colorOfOldestPerson()) // Output: yellow
  }
}
