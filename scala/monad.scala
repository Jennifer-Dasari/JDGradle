import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Success, Failure}

object Monad {
  implicit val ec: ExecutionContext = ExecutionContext.global

  def getFirstNumber: Future[Int] = Future {
    // Simulate a computation or an API call
    40
  }

  def getSecondNumber: Future[Int] = Future {
    // Simulate a computation or an API call
    20
  }

  def main(args: Array[String]): Unit = {
    val result = for {
      a <- getFirstNumber
      b <- getSecondNumber
    } yield a + b

    result.onComplete {
      case Success(sum) => println(s"The sum is: $sum")
      case Failure(e) => println(s"An error occurred: ${e.getMessage}")
    }
    // Keep the main thread alive long enough for the Future to complete
    Thread.sleep(1000)
  }
}
