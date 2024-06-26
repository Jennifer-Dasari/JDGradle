object caseClassPatternMatchning {
  def main(args: Array[String]): Unit = {
    val a = Patterns(1, "abc")
    val b = Patterns(2, "123456")
    val c = Patterns(3, "string")
    for (patterns <- List(a, b, c)) {
      patterns match {
        case Patterns(1, "abc") => println("nb")
        case Patterns(5, "123456") => println("saw")
        case _ => println("jjjjjjjjjj")
      }
      println(display(6))
      println(display(2.6))
      println(display(7.8897))
      println((show(3)))
      println(showed("hjni"))
    }
  }
  case class Patterns(a: Int, b: String)
  //i have created a method show and tried to match my parameter "a" with sever int types and tried to return int as well
  def show(a: Int): Int = {
    a match {
      case 0 => 123
      case 1 => 234
      case 2 => 456
      case _ => 987
    }
  }
  def showed(a: String): String = {
    a match {
      case "exam1" => "qqqqq"
      case "exam2 " => "wwwww"
      case "exam3" => "jjjjjjjj"
      case _ => "hhhhhhhh"
    }
  }
  def display(a: Any): String = {
    a match {
      case _: Int => "im printing interger"
      case (_): Int | _: Double | _: Float => "ITS A NUMERIC NUMBER"
      case _ if !a.isInstanceOf[String] => "i am everything except string"
      case _: String => " jxuj"
      case 1.2f => "sxded"
      case _ => "56678njdhc"
    }
  }
}