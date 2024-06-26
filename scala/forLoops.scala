object forLoops {
  def main(args: Array[String]): Unit = {
    show()
    println(patternMatching2("book"))
    println(patternMatching(2))
    println(pattern3(2.4))
    println(pattern4(Summer(40)))//i am passing a case class object in the main method
    println(pattern4(3,8))
    println(pattern4(List(1,2,3,4)))
    println(pattern4(Vector(1,2,3,4)))
  }
  def show():Unit = {
    for (a <- 1 until 11 if (a >= 8 || a <= 10)) {
      println(a)
    }
  }
    def patternMatching(a: Int): String = {
      a match {
        case 10 => "jenni"
        case _ => "not jenni"
      }
    }
    def patternMatching2(a:String): String ={
      a match {
        case "abc" => "bottle"
        case _ => "hair clip"
      }
    }
    def pattern3(a: Double): Byte = {
      a match {
        case 2.4 => 20
        case _ => 2
      }
    }
    case class Summer(d: Int)
    def pattern4(a: Any): Any ={
      a match {
        case 1 => "jennifer"
        case 2.2 => 80
        case ("two", "three") => 2.4567
        case p@ Summer(40)  if(p.d==40) => 234 // (p@ = variable binding)P = Summer , @ = tells that summer is inside P, p.d = Summer.40 {im try to take parameters from the objects}
        case Summer(n) if (n == 40) => 765 // here aswell trying to take parameters in the objects
        case Summer(s) => s"summer valuez is $s" // this is an extractors
        case (d,e) => s"i am in dark wear $d and $e"
        case List(_,_*) => "i am groots"
        case  Vector(1,2,_*) => 23.1
        case _ => 2345
      }

    }
    sealed trait Glass
    case class Ae() extends Glass
  case class Bb() extends Glass
  case class Cc() extends Glass
   def show1(h: Glass): String ={
       h match {
         case Ae() => " "
         case Bb() =>" "
       }
     }
}