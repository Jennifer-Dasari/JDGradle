//PROGRAMS ON COLLECTIONS AND THEIR BASIC OPERATIONS

object Collect{
  val sequence: Seq[Int] = Seq(1, 2, 3, 4, 5, 8, 9, 10)
  val head: Int = sequence.head
  val tail: Seq[Int] = sequence.tail
  val headTail: Int = sequence.tail.head
  val jenni: Int = sequence(1)
  val karthi: Option[Int] = sequence.headOption
  val kai2: Option[Nothing] = Seq().headOption
  val length: Int = sequence.length
  val boolean: Boolean = sequence.contains(2)
  val find: Option[Int] = sequence.find(_ == 3)
  val find1: Option[Int] = sequence.find(_ > 4)
  val filter: Seq[Int] = sequence.filter(_ > 1)
  val sorting: Seq[Int] = sequence.sortWith(_ < _)
  val append: Seq[Int] = sequence :+ 11
  val prepend: Seq[Int] = 0 +: sequence
  val concat: Seq[Int] = sequence ++ Seq(11, 12, 13)

  def main(args: Array[String]): Unit = {
    println(s"Sequence: $sequence")
    println(s"head: $head")
    println(s"tail: $tail")
    println(s"headTail: $headTail")
    println(s"jenni: $jenni")
    println(s"karthi: $karthi")
    println(s"kai2: $kai2")
    println(s"length: $length")
    println(s"boolean: $boolean")
    println(s"find: $find")
    println(s"find1: $find1")
    println(s"filter: $filter")
    println(s"sorting: $sorting")
    println(s"append: $append")
    println(s"prepend: $prepend")
    println(s"concat: $concat")
  }
}
