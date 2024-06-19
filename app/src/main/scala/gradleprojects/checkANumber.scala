package gradleprojects
//Q. write a scala program to check a
// given integer and return true if it is within 20 of 100 or 300
object checkANumber {
def checkNum(a: Int): Boolean = {
  math.abs(100-a)<=20||math.abs(300-a)<=20
}
  def main(args: Array[String]): Unit = {
    println(checkNum(80))
    println(checkNum(250))
    println(checkNum(60))
    println(checkNum(115))

  }
}
