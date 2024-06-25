package gradleprojects
import java.sql.DriverManager
object HelloWorld3 {
  sealed trait Animal
  case class Dog(name:String) extends Animal
  case class Cat(name:String) extends Animal
  case class Bird(name:String) extends Animal
  trait BehavelikeHuman[A]{
    def speak(a:A):String
  }

  def main(args: Array[String]): Unit = {
    //DriverManager.getConnection()
    println("Hello, World!")
//creating an trait instance
    val sp = new BehavelikeHuman[Dog]{
      def speak(a:Dog)={
        s"this ${a} can speak "
      }
    }
    print(sp.speak(Dog("bobby")))
  }
}