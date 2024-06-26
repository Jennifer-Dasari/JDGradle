 sealed trait example
 class A1 extends example
 class A2 extends example
 class A3 extends example
object D1 {
  def main(args: Array[String]): Unit = {
    def check(x: example): String = {
     val abc =  x match {
        case a:A1 => " a1"
        case a:A2 => " a2"
        case a:A3 => " a3"
      }
      ""
    }
    println(check(new A1))
    println(check(new A2))
    println(check(new A3))
  }
}

// sealed trait concepts where pattern matching is linked as here i can see that A1,A2,A3 all
 // these classes are matching
//and 1 case is missing to initialize or failed to match we ll get an exhaustive error.