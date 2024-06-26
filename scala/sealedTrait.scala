sealed trait traitsExample {
  def add(s: Int, k: Int): Unit

  def mul(s: Int, K: Int): Unit
}
  class Access extends traitsExample {
  override def add(s: Int, k: Int): Unit = {
    println(s + k)
   }

   override def mul(s: Int, k: Int): Unit = {
     println(s * k)
   }
 }

object sealedTrait {
  def main(args: Array[String]): Unit = {
    val s = new Access
     s.add(5,7)
    val k = new Access
     k.mul(5,9)
  }
}