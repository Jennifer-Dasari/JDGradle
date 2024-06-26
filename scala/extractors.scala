case class Extractors(name: String, id: Int)

object andhra {
  def main(args: Array[String]): Unit = {
    val xyz = Extractors("Dave",123456) match {
      case Extractors(name,id) => List(name,id)
    }
    println(xyz)
  }
}