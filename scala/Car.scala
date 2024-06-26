// example of the liniarization the solution to diamond problem.


trait Vehicle{
  def pipe(): String = "idom"
}
trait Aeroplane1 extends Vehicle{
  override def pipe(): String = "its class aeroplane"
}
 class Bike extends Vehicle{
  override def pipe():String = "wierd"
}
class scooter extends Bike with Vehicle {
  override def pipe(): String = super.pipe()
}
//class truck extends scooter with Bike  //this cant be done coz u cant inherit multiple classes only a trait can does
object main3{
  def main(args: Array[String]): Unit = {
    val x = new scooter
    println(x.pipe())
  }
}