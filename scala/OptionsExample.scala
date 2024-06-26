object OptionsExample {
  def main(args: Array[String]): Unit = {
    //now trying with getOrElse
    val b: Option[String] = Option.apply("hello")
    val c: Option[Nothing] = None
    println(b.get)
    println(b.orElse(Option("hi")))
    println("the statement goes like this " + b.getOrElse(2))
    println("The statement goes like this " + c.getOrElse(0))
    println(" the result " + c.isEmpty)
    val numbers = List(1, 2, 3, 4,5,6,7,8,9,10)
    val evens = numbers.filter(x => x % 2 == 0)
    //anonymous function: here => is a transformer means The transformer is
    // used to convert the parameter list to the left of the symbol into a new result
    // using the expression on the right.
    val function1 = (functionName1: Int , functionName2: Int ) => functionName1 + functionName2
    val function2 = (_:Int) * (_:Int)
    println(function2(2,4))
    println(function1(15,30))
    println(s"Even numbers in the list: $evens")
    //Anonymous Functions Without Parameters:
    val funct1 = () => {"this is anonymous function"}
    println(funct1())

  }
}

