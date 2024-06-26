import scala.annotation.tailrec

object factorial {
  def main(args: Array[String]): Unit ={
    for(x<- 1 to 10 if(true)) if(true){
      println(x)
      }
    val y = for{x <- 1 until 10 if(true)

      } yield x*2
    println(y)

    val result = fact(4)
    println(result)
    factorialTailRecursion(5)
    val res = fact1(3)
    println(res)
    val res2 = fact3(0)
    println(res2)
  }
  def fact(n: Int): Int ={
    if (n <= 1) 1
    else n * fact(n - 1)
  }
  def factorialTailRecursion(n: Int): Int = {
    @tailrec
    def factorial2(result: Int, n: Int): Int = {
      if (n <= 1)
        result
      else
        factorial2(n * result, n - 1)
    }
    factorial2(1, n)
  }
  def fact1(a: Int):Int ={
    @tailrec
    def fact2(b: Int, n:Int): Int ={
      if(n >= 1){
        fact2(b * n,n-1)
      }
      else
        b
    }
    fact2(1,a)
  }










  def fact3(a: Int):Int = {
    @tailrec
    def fact4(result: Int, n:Int): Int ={
      if(n >= 100) {
        result
      }
      else{
        fact4(result + 1, n+1)
      }
    }
    fact4(0,a)
  }








}
