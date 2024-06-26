class Person1(first: String, middle: String,last: String){
  val firstName: String = first
  val middleName:String = middle
  val lastName: String = last
  def name: String = firstName + "  " + lastName+"   "+ middleName
}
 
var dave:Person1 = new Person1("jessie", "salvatore","mikelson")
object Mad{
  def main(args: Array[String]): Unit =
  {
    println(dave.name)
  }
}