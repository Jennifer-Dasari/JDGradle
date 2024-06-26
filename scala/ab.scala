object ab {
 def main(args:Array[String]): Unit = {
  println(show(10,2))
   println(show(1,0))
 }
def show(a: Int, b: Int): Either[String, Int] = {
  if (b == 0) Left("fail")
  else
    Right(a / b)
}
}
