sealed trait sealedTraitExample2 {
def show(a: Int,b:Int): Unit
}
case class  OptionA() extends sealedTraitExample2{
  override def show(a: Int, b: Int): Unit = {
    println(a * b)
  }
}
 case class OptionB() extends sealedTraitExample2{
   override def show(a: Int,b:Int): Unit = {
     println(a+b)
   }
 }
object sealedTraitExample{
  def main(args: Array[String]): Unit = {
    val abc = new OptionA
    abc.show(2,3)
    val cba = new OptionB
    cba.show(6,4)
  }
}