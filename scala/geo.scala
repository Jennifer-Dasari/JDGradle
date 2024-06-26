trait shapes {
  def side:Int
  def perimeter:Int
  def area:Int
}


 class Circle(radius:Int) extends shapes  {
   override def side: Int = {
     4
   }
   override def perimeter: Int = {
    2 * 3 * radius
  }
   override def area:Int = {
    4
  }
}
class Rectangle extends  shapes  {
  override def side: Int = {
    4
  }

  override def perimeter: Int = {
2
  }
  override def area: Int = {
    3
  }
}
class Square extends shapes{
  override def side: Int = {
2
  }
  override def perimeter: Int = {
3
  }

  override def area: Int = {
    3
  }
}
object geo {
  def main(args: Array[String]): Unit = {
    val mat: shapes= new Circle(radius = 5)
    println(mat.perimeter)
  }
}
sealed trait haldiram{
}
class jennifer extends haldiram {
}