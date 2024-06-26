object findNum{
  def main(args: Array[String]): Unit = {
    val n = 20
    val target = 6
    val elements: IndexedSeq[(Int, Int)] = for {
      x <- 1 to n
      y <- 1 to n
      if x + y == target
    } yield (x, y)

    elements.foreach{ case(x,y)=>
    println(s"($x,$y)")
    }
  }
}