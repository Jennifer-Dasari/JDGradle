//trait Milton{
//  //def show():String
//}
//trait Milton1[A]{ //non primitive
//}
//trait Glass extends Milton
//class Spoon extends Milton1[Glass]
//class Bottle extends Milton
////case class Bottles(a: String){
////}
//object variencesConcepts {
//  def main(args:Array[String]): Unit = {
//    val abc: Milton1[Glass] = new Spoon
//  }
//}
//the entire program is to note that we can put the type abc we can give type preference is milton

object variencesConcepts {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    //created an instance of a class child and gave type reference as a generic trait
    //here,i see no relation with the
    val name: Abby[Animals] = new child()
  }
}
//i have created the trait with generics.
trait Abby[+Z] {
}
//this trait is normal.
trait Animals {
}
//im extending the trait with another trait.
trait Cats extends Animals {
}
//im extending the class with generic trait.
class child extends Abby[Cats] {
}