object palindrom {
  def isPalindrome(str: String): Boolean = {
    val cleanedStr = str.toLowerCase.replaceAll("\\s", "")
    cleanedStr == cleanedStr.reverse
  }

  def main(args: Array[String]): Unit = {
    val test = "mom"
    println(s"hy '$test' a palindrome ? ${isPalindrome(test)}")
  }
}
