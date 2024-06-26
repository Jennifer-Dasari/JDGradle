object multipleFile {

  def squaring(a: Int): Int= {
    a*a
  }
  def main(args: Array[String]): Unit = {
  val collection = Seq(1,2,3,4,5,6,7)
    val new_collections = collection.map(squaring)
    println(new_collections)
    val sum = new OptionY
    val sum2 = sum.show(100,3000)
  }
}
class OptionY extends OptionA(){
  override def show(a: Int, b: Int): Unit = {
  println(a*b)
  }
}