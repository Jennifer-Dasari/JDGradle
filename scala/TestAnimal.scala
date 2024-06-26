///program on traits
trait Animal{
  def makeSound(): String

  def sleep(): String = "sleeping on the couch"

}
class Dog extends Animal{
  def makeSound(): String = "bark"
}
class Cat extends Animal{
  def makeSound(): String = "meow"
}
object TestAnimal{
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    val cat = new Cat
    println(s"Dog sound: ${dog.makeSound()}")
    println(s"Dog sleep: ${dog.sleep()}")

    println(s"Cat sound: ${cat.makeSound()}")
    println(s"Cat sound: ${cat.sleep()}")
  }
}