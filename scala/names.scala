//PROGRAM ON 6.2.4 = FOLDS

case class Person(name: String, sex: String)

object names {
  def main(args: Array[String]): Unit = {
    val persons = List(
      Person("may", "female"),
      Person("cupid", "male"),
      Person("joe", "male")
    )
    val foldedList = persons.foldRight(List[String]()) { (person, accumulator) =>
      val title = person.sex match {
        case "male" =>  "Mr"
        case "female" => "Ms."
      }
       s"$title ${person.name}"::accumulator
    }
    println(foldedList)
  }
}
