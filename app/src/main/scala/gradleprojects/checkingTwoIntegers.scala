package gradleprojects
//Q. write a scala program to check two given
// integers, and return true if one of them is 30 or if their sum is 30
object checkingTwoIntegers{
  def main(args: Array[String]): Unit = {
    println(checkNumbers(30,30))
    println(checkNumbers(30,0))
    println(checkNumbers(7,30))
    println(checkNumbers(15,15))
    println(checkNumbers(2,16))

  }
def checkNumbers(a: Int, b:Int): Boolean ={
  a==30|| b==30 || a + b ==30
}
}
