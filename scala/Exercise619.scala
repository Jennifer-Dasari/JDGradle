object Exercise619{
  val seq: Seq[String] = Seq("cat", "dog", "penguin")
  val animal: List[String] = List("cat", "dog", "penguin")
  val append: List[String] = animal.:+("tyranosaurous")
  val prepend: List[String] = append.+:("mouse")
  val prepend2: List[Any] = prepend.:+(2)

  def main(args: Array[String]): Unit = {
    println(s"seq: $seq")
    println(s"animal: $animal")
    println(s"append: $append")
    println(s"prepend: $prepend")
    println(s"prepend2: $prepend2")
  }
}