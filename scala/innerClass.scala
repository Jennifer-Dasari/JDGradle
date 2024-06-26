object innerClass{
  def show[z](x:Int,y:z): Int = {
  2
  }
  def add[A](a:Int,b:A): String ={
    " "
  }
  def subMix[A](a:String,b:Double,c:Boolean,d:A):String ={
     " "
  }
  //def show(a:Int,b:Int): Int
  //def show(a: String, b: String): String
  //def show(a: String, b: Int): String

  def main(args: Array[String]): Unit = {
    show(6,5)
    subMix(" ",5.6,true,"")
    show(4,"de")
    show(9,'e')
    add(2,"jj")
  }
}
class MyClasses{
}
case class MyCases(){
}
// [1->2,3->4]

trait abc[A]{
  def mul(a: A,b: A): A
}
class Abc1 extends abc[String]{
  override def mul(a: String, b: String): String = {
    ""
  }
}
class She extends abc[Double] {
  override def mul(a: Double, b: Double): Double = {
    8.3
  }
}
sealed trait xyz{
}
class Pqr extends xyz
//this program is about the invariance of generics