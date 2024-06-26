object parallel {
  def main(args: Array[String]): Unit = {
    //val john: haldiram = new jennifer
    //class laddu extends haldiram{
    }
    val result = for {
      x <- Seq(1, 2, 3)
      y <- Seq(4, 5, 6)
    } yield x + y
    println(result)
    println(Seq(1,2,3).zip(Seq(4,5,6)))
    val moreResults = for (x <- Seq(1,2,3).zip(Seq(4,5,6))) yield {val (a,b)= x; a +b }
      println(moreResults)
    val mtching = for((a,b) <- Seq(1,2,3).zip(Seq(4,5,6))) yield a + b
    println(mtching)
    val inter = for {
      x <- Seq(1,2,3)
      square = x * x
      y <- Seq(4,5,6)
    } yield square * y
    val filter: Seq[Int] = for (x <- Seq(-3, -2, -1, 0, 1, 2, 3) if x > 0) yield x
    println(inter)
    println(filter)
    //dealing with maps now:
    val example = Map("a"-> 1, "b"-> 2, "c" -> 3)
    println(example)
    println(example.get("c"))
    println(example("b"))
    println(example.getOrElse("d",0))
    println(example.contains("a"))
    println(example.contains("e"))
    println(example.size)
    println(example.+("d" -> 10, "e" -> 11, "f" ->12))
    println(example.-("a"))
    val exa2 = scala.collection.mutable.Map("x" ->10, "y" -> 11, "z" -> 12)
    println(exa2)
    println(exa2 += ("x" -> 60))
    println(exa2)
    val sortedMap = scala.collection.immutable.ListMap("a" -> 1) + ("b" -> 2) + ("c" -> 3) + ("d" -> 4) + ("e" -> 5)
    println(sortedMap)
    val ex = for {
      (str, num) <- example
      x <- 1 to 3
    } yield (str + x) + "=" +(x * num)
    println(ex)
  }

