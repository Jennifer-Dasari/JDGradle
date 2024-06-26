//program on the CONSTRUCTORS

class person (first: String, hobbie: String){
  val firstName= first
  val lastName = hobbie
  def name = firstName+ " - "+ lastName
}

object marks{
def main(args: Array[String]): Unit = {
  val jennifer = new person("jennifer","d")
  println(jennifer.name)
}

}

