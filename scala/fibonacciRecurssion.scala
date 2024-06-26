object fibonacciRecurssion {
  def main(args: Array[String]): Unit = {
    val count = 8
    for(i <-2 until count) {
      println(fibonaccii(i))
    }
  }
  }
def fibonaccii(n: Int): Int = n match  {
  case 0 => 0
  case 1 => 1
  case _ => fibonaccii(n-1) + fibonaccii(n-2)
}