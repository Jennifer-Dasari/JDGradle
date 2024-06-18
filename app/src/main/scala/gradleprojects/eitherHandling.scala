package gradleprojects

object eitherHandling {
  def main(args: Array[String]): Unit  = {
    println(divide(100,60))
    println(divide(20,0))
  }
  def divide(a:Int,b:Int): Either[String,Int] = {
    if(b ==0) Left("failue of the code")
    else
      Right(a/b)
  }

}
