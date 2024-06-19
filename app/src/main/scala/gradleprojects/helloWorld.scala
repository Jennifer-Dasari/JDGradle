package gradleprojects
//Q. write a scala program to compute the sum of the two given integer values.
//if the values are same, then return triples their sum
object helloWorld {
def main(args: Array[String]): Unit = {
  println(" the total answer is : " +test(15,23))
  println(" the total answer if a, b are same is : " +test(15,15))

}
  def test(a: Int,b: Int): Int = {
    if(a == b)
      (a + b) * 3
    else
      a * b
  }
}
