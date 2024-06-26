object abcd {
  def main(args: Array[String]): Unit = {
    val monday = (1+4) match {
      case 1 => "it's one!"
      case 2 => "it's two"
      case 3 => "it's three"
      case _ => "is it  a  the final result?"
    }
    println(monday)
    val me = Seq(1,2,3).map(_ * 2)
    println(me)
    val mee = 1 until 11
    val me1 = for {
      a <- 1 until 11
    }yield a * 2
    println(me1)
    val me2 = for {
      a <- Seq(1,2,3)
    }yield a * 3
    println(me2)
    val me3 = Set(6,7,8,9)
    println(me3)
    val me4 = for {
      a <- Set(6,7,8,9)
    }yield a * 4
    println(me4)
   val preeti = List(List(List(1),List(2,3),List(5)))
    println(preeti.flatMap(x => x.flatMap(t => t.map(s => s * 10))))
   val preeti2 = for {
     a <- preeti
     x <- a
      y <- x
   } yield y * 2
    println(preeti2)
    val wse = for(x <- 1 until 3){
    }
   val hhh = List(4,5,6).foreach(_ * 2)
    println(hhh)
    val hh2: Map[Double, String] = Map(2.22 -> "jennifer")
    hh2.map(x => x._1)
    val asd = Option[String]("bnk")
       val xmp = asd match {
        case Some(x) => {
          x.match {
            case "bnk" => "yes "
          }
        }
        case None => "dont "
      }
    println(xmp)
    {
      val min = Ordering.fromLessThan[Int](_ < _)
      implicit val max = Ordering.fromLessThan[Int](_ > _)
      println(List(3, 4, 2).sorted)
      println(List(2, 7, 4, 9, 7, 3).sorted)
    }
    {
      println(List(7,0,9,6).sorted)
    }
    //A.1.4 - 168
    val person = My("moon", "jenni")
    val moon2 = person.match {
      case P @ My(s,_) => s"The person $P has the surname $s "
    }
    val moon3 = ("betty","ammu")
    val mon = moon3.match {
      case ("betty","ammu")  if(2 % 2 == 0) => "nope its jenni "
    }
    val tuesday = ("luna","cynthiya") match {
      case ("noel","stars") => "i ll do everything"
      case ("luna",_) => s" always getting on my nerve"
    }
    val x = "hi"
    val y = " bye "
    val z = "c u tmr"
    val mad = "bye".match {
      case x => "hi"
      case y => "its bye!"
      case _ => " its c u tmr"
    }
    val abi = 123 match {
      case a if(a % 2 == 1) => "perfect"
      case _ => "missmatch"
    }
    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "  " + abi)
    println(mad)
    println(tuesday)
    println(mon)
    println(moon2)

     val g = My("Dave", "Gurnell") match {
      case My("Noel", _) => "It's Noel!"
      case My("Dave", _) => "It's Dave!"
    }
    // res: String = It's Dave!
    val d = My("Dave", "Gurnell") match {
      case My(name, _) => s"It's $name!"
    }
    import scala.util.matching.Regex
    val r = new Regex ("""(\d+)\.(\d+)\.(\d+)\.(\d+)""")
     val m = "192.168.0.1" match{
      case r(a,b,c,d) => List(a,b,c,d)
    }
    val o = List(1,2,3,4) match {
      case List(a,b,c,d) => a*b*c*d
    }
    val i = Nil match {
      case List(a) => "length 1"
      case Nil => "length 0"
    }
    println(i)
    println("................................"+ "...."+o)
    println("################################################" +"  "+ m)
    // res: String = It's Dave!
     val h = My("John", "Doe") match {
      case My("Noel", _) => "It's Noel!"
      case My("Dave", _) => "It's Dave!"
      case _ => "It's someone else!"
    }
    val l = List(1,2,3) match {
      case ::(head, tail) => s"head $head tail $tail "
      case Nil => "empty"
    }
    val q = List(1,2,3) match {
      case head:: tail => s"head $head tail $tail"
      case Nil => "empty"
    }
    val ars = List(1,2,3) match {
      case Nil => "length 0"
      case a:: Nil => s"hello jenni $a"
      case a::b::Nil => s" hi jenni $a $b"
      case a::b::c::_=> s"school? $a $b $c"
    }
    println(ars)
    println(q)
    println(l)
    println(h)
    println(d)
    println(g)
  }
  case class My(firstName: String, lastName: String )
}