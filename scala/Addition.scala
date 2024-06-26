object Addition
{
  def main(args: Array[String]): Unit =
  {
    show("")
   // println( "Sum1 = " + sum(1))
   // println( "Sum2 = " + sum(2))
  }
  var a = {
    println(" print a statement ")
    6
  }
  lazy val y: Double = {
    println(" jjjjjjjjjjjj")
    9.6
  }
  def show(abe: String): String ={

    println("the second statement")
    println(a)
    " "
  }

  //here im using anonymous function "=>"
  val sum = (b:Int) => b + a
}