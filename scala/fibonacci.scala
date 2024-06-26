//prgram on getting finonacci series without recurssion 
object fibonacci {
  def main(args: Array[String]): Unit = {
    val count = 10
    var n1 = 0
    var n2 = 1
    println(s"$n1,$n2")
    for (_ <- 2 until count)
      val n3 = n1 + n2
      n1 = n2
      n2 = n3
      println(s"$n3")
  }
}