import scala.collection.mutable.ArrayBuffer

object Email{
  def unapply(str: String): Option[(String, String)] = {
    val parts = str.split("@")
    if (parts.length == 2) Some((parts(0),parts(1))) else None
  }
}
object main {
  def main(args: Array[String]): Unit = {
    val result = "dava@underscore.io" match {
      case Email(user, domain) => List(user, domain)
      case _ => Nil
    }
    println(result)
    val buffer = new ArrayBuffer[Int]()
    println(buffer += 1)
    println(buffer)
    val result2 = "dave" match {
      case Email(user, domain) => List(user,domain)
      case _ => Nil
    }
    println(result2)
  }
}
case class Upper(firstName: String, lastName: String)
object Uppercase {
  def unapply(str: String): Option[String] = Some(str.toUpperCase) }
  val upperInstance = Upper("Dave", "Grunell")
  //println(result4)
  val result4 = upperInstance match {
    case Upper(f, Uppercase(l)) => s"$f $l"
    case _ => "No match"
  }
//println(result4)
