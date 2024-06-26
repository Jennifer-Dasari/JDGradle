
object simplePrograms {
  def main(args: Array[String]): Unit = {
    println("10,20")//
   val statements3 = revers("jennifer").toString
// println(statements3)
//    println(reverse("burger").toUpperCase)
   // println(statement2)

    val n = 10
   val sumResult = 8
   for(a <- 1 to 10){
     //println(a)
     for(b <- 1 to 10){
       if(a + b == 8) {
         println(s"$a, $b")//{if i write println(a,b) it wont understand so, but when u use string interpolation
         // its a string and using a string u can call any value by using '$' values,
         // so that it will call those values seperatly.}
//         basically println statements take only one data types i.e  is any datatypes.but its cant be taking multiple data types.
       }
     }
   }
  }
  def revers(a: String) = {
    var result = ""
    for (b <- a.length-1 to 0 by -1){
      result = result + a(b)
    }
    result
  }

  def reverse(c: String): String = {
    def stringM(a: String, b: Int): String = {
      if (b <= -1) a
      else
        stringM(a + c(b), b - 1)
    }
    stringM("", c.length-1)
  }
}
