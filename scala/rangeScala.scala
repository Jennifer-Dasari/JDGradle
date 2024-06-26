object rangeScala{
  def main(args: Array[String]): Unit = {

    val range: Range = Range(3,10,2)
    val x = 1 to 5
    println(x)
    val range2: Range = 3 until 10 by 2
    val range3: Range = range.inclusive
    println(range3)
    println(range == range2)
    println(range2)
    println(range(0))
    println(range.last)
  }
}

