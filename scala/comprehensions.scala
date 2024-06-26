//program on 6.3 FOR COMPREHENSIONS
object comprehensions {
  val seq: Seq[Int] = Seq(1, 2, 3)
  val seq2 = Seq(1,2,3).map(_*2)
  val seq3 = for{
    x<-Seq(1,2,3)
  }yield( x * 9)
  println(seq2)
  val data = Seq(Seq(1),Seq(2,3),Seq(4,5,6))
  val datais = data.flatMap(_.map(_*2))
  val datacompli = for{
    subseq <- data
    element <- subseq
  }yield element *3
  println(datacompli)
  println(datais)
def main(args: Array[String]): Unit = {
  println(seq3)
}
}
