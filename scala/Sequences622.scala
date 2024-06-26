import scala.collection.mutable.ListBuffer

object Sequences622{
  val sequence: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 7)
  val doubleElement: Seq[Int] = sequence.map(_ * 9)
  val words: Seq[String] = Seq("a", "wet", "dog","Null","Null","Null")
  val permutations: Seq[String] = words.flatMap(_.permutations.toList)
  val words1: Seq[Int] = Seq(1, 2, 3)
  val permutations1: Seq[Int] = words1.flatMap(num => Seq(num, num * 10))
  println(permutations1)
  println(permutations)
  println("dog".permutations.toList)
  import scala.collection.immutable.Vector

  val vector: Vector[Int] = Vector(1, 2, 3)
  val permutations2: Vector[Int] = vector.flatMap(num => Seq(num, num * 10))
  println(permutations2)
  def main(args: Array[String]): Unit = {
    val opt: Option[Int] = Some(5)
    val doubleOpt:Option[Int] = opt.flatMap(x =>Some(x*2))
    println("jjjjjjjjjjjjjjjjjjjj"+doubleOpt)
    println(s"sequence: $sequence")
    println(s"doubleElement: $doubleElement")
    var a = ListBuffer(1, 2, 3, 4, 5)
    for(res<-1 to 20){
      a+=res
    }
    println(a)
    //println("!!!!!!!!!!!!!!!!!!!!!!"+c)
  }

}