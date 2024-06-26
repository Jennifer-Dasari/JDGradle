object randomWords {
  def main(args: Array[String]): Unit = {
    val subjects = List("Noel", "The cat", "the dog")
    val verbs = List("wrote", "chased", "slept on")
    val objects = List("the book", "the ball", "the bed")

    def allSentences: List[(String, String, String)] = {
      for {
        subject <- subjects
        verb <- verbs
        obj <- objects
      } yield (subject, verb, obj)
  }
      allSentences.foreach {
        case (subject, verb, obj) => println(s"$subject $verb $obj")
      }
  }
}