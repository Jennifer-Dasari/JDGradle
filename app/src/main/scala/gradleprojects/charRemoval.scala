package gradleprojects
//q. write a scala program to remove the character in a given position of a given string
//the given position will be in the range 0 .....string length -1inclusive
object charRemoval {
  def main(args: Array[String]): Unit = {
    println(removingChar("jon", 3))
    println(removingChar("jennifer", 3))
    println("bsadhb")
  }
  def removingChar(a: String, b:Int): String = {
    a.take(b) + a.drop(b +1)
  }
}
