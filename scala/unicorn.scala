case class Employee(name: String, age: Int)
  object Unicorn {
    def main(args: Array[String]): Unit = {
      val employee1 = Employee("Ammu", 22)
      val employee2 = Employee("betty", 20)
      //println(employee1)
      //println(employee2)
    def greet(employee: Employee): String = employee match {
      case Employee("Ammu", 22) => "hy ammu u r 22 years old"
      case Employee(name, age) => s"hy $name u r $age years old"
    }
    println(greet(employee1))
    println(greet(employee2))
  }
}
