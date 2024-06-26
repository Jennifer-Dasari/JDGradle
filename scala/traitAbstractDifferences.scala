
trait A{
  val x = 1
  println(s"Trait A: x = $x")
}
class B extends A{
  val a = 2
  println(s"the abstract B: a = $a")
}
class X extends B{
  val h = 3
  println(s"hbfurhjbdsjchb: $h")
}
//abstract class C{
//  val b = 3
//  println(s"hvgv: $b")
//}
//class D extends C{
//  val y = 6
//  println(s"bhftfgcv: $y")
//}
//class E extends D

object traitAbstractDifferences {
  def main(args: Array[String]): Unit = {
    //val m = new B
    val k = new X
  }
}