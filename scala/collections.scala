object collections{
  val sequence: Seq[Int] = Seq(1,2,3,4,5,8,9,10,10)
  val head = sequence.head
  val tail = sequence.tail
  val headTail = sequence.tail.head
  val jenni = sequence(1)
  val kai = sequence.headOption
  val kai2 = Seq().headOption
  val length = sequence.length
  val boolean = sequence.contains(2)
  val find = sequence.find(_==3)
  val find1 = sequence.find(_>4)
  val filter = sequence.filter(_>1)
  val sorting = sequence.sortWith(_<_)
  val append = sequence.:+(11)
  val prepend = sequence.+:(0)
  val concat = sequence ++ Seq(11,12,13)

  def main(args: Array[String]): Unit = {
    println(s"Sequence: $sequence")
    println(s"head: $head")
    println(s"tail: $tail")
    println(s"headTail: $headTail")
    println(s"jenni: $jenni")
    println(s"kai: $kai")
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