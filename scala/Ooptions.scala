object Ooptions {
  def main(args: Array[String]): Unit = {
    def readInt(str: String): Option[Int] =
      if (str.matches("\\d+")) Some(str.toInt) else None
      //HERE, matches is a inbuilt function and "\\d+" helps in matching the ints that converted into strings 
    // weather the purticular int is int or not is it is int then it prints some(123) if not it will print non
      // 

    // Testing readInt
    println(readInt("123")) // Output: Some(123)
    println(readInt("5J43")) // Output: None

//     Pattern matching on Options
    readInt("123") match {
      case Some(number) => println(number + 1) // Output: 124
      case None         => println(0)          // Output: 0
    }
//    readInt("abc") match {
//      case Some(number) => println(number + 1)
//      case None         => println(0)          // Output: 0
//    }

    // Using map
//    println(readInt("123").map(_ + 1)) // Output: Some(124)
//    println(readInt("abc").map(_ + 1)) // Output: None

    // Using flatMap
//    println(readInt("123").flatMap(number => Some(number + 1))) // Output: Some(124)
//    println(readInt("abc").flatMap(number => Some(number + 1))) // Output: None
  }
}
