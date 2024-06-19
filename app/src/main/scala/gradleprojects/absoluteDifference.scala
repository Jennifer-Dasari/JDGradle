package gradleprojects
//Q. write a scala program to get the absolute difference betweeen n and 51. if n is
//greater that 51 return triple the absolute difference.
object absoluteDifference {
def main(args: Array[String]): Unit = {
  println(test(52))
  println(test(43))
}
  def test(n: Int): Int = {
    val abs_dif = math.abs(n - 51)//this line calculates the absolute difference between x and 51 and assignes it to the variable abs_dif
    if (n>51)
      3*abs_dif
    else
      abs_dif
  }
}
