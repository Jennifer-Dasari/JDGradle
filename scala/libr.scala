//program on IMPORTING COLLECTIONS AND OTHER LIBRARIES

object libr {
  def main(args: Array[String]): Unit = {
    val seq: Seq[Int] = Seq(1, 2, 3)
    val list: List[Int] = List(4, 5, 6)
    println(s"seq: $seq")
    println(s"list: $list")

    import scala.collection.immutable.Vector
    val vector: Vector[Int] = Vector(1, 2, 3)
    println(s"vector: $vector")

    import scala.collection.immutable._
    val queue:Queue[Int] = Queue(1,2,3)
    println(s"queue: $queue")

    import scala.collection.immutable.Vector.apply
    val applying:Vector[Int] = apply(1,2,3)
    println(s"applying: $applying")

    def someMethod(): Unit ={
      import scala.collection.immutable.Vector.empty
      val emptyMethod:Vector[Int] =  empty[Int]
      println(s"someMethod: $emptyMethod")
    }
    someMethod()
  }
}