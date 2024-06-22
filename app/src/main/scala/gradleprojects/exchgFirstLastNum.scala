package gradleprojects
//Q8. Write a scala program to exchange the first
// and last characters in a given string and return the new string
object exchgFirstLastNum {
  def main(args: Array[String]): Unit = {
 println(exchanging("jennifer"))
  }

  def exchanging(first: String): String =
  {
    val findlength = first.length
    if(findlength <= 1)
      first
    else
      first.charAt(findlength-1) + first.substring(1,findlength-1) + first.charAt(0)

  }
}
//first.charAt(7): The 8th character (0-based index 7) is 'r'.
//first.substring(1, 7): The substring from index 1 to 6 is "ennife".
//first.charAt(0): The 1st character (0-based index 0) is 'j'.
//Concatenate: 'r' + "ennife" + 'j' results in "rennifej".
//Thus, the final output of the exchanging("jennifer") call is "rennifej".