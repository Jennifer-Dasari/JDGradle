case class navya(age: Int, id:Int)

object bhavya{
  def main(args: Array[String]): Unit = {
    //val xyz = navya.unapply( 22, 102)
    val kp = navya (22,763)
    val zp = navya.unapply(navya (22,36))
  }
}