import java.io.IOException
object exceptionHandling {
  def main(args: Array[String]): Unit = {
    try {
      val a = 5 / 0
    }
    catch  
    {
      case b: IOException => {
        println("IOException occured")
      }
      case c: ArithmeticException => {
        println("arithmetic exception occured")
      }
      case d: Exception => " "
    }
    finally 
      {
        println("this block will be final")
      }
  }
}
