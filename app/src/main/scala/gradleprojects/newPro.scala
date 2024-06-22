package gradleprojects
//  Write a Scala program to create a new string where 'if' is added to the
//  front of a given string. If the string already begins with 'if', return the
//  string unchanged
object newPro {
  def main(args: Array[String]):Unit ={
val abc = addit(" jenni ")
    val results = addit(abc)
    println(results)
  }
def addit(a: String): String = {
  if(a.startsWith("if"))
    a
  else
    "if" + a
}
}
