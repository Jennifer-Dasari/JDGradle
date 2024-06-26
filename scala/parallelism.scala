

object parallelism {
  def main(args: Array[String]): Unit = {
    val listo = List(1,2,3,4,5)
    val list1 = List()
    //val reducedOperations = list1.reduce((x,y)=> x , y)
    val reducedOperations2 = list1.fold(0)((x,y)=> x +y)
    println(reducedOperations2)
    val reducedFunctionUses1 = listo.reduce((x,y) => x * y)
    val reducedFunctionUses2 = listo.reduce((a,b) => a + b)
    val reducedFunctionUses3 = listo.fold(1)((x,y) => x + y)
    println(reducedFunctionUses1)
      println(reducedFunctionUses2)
    println(reducedFunctionUses3)
    val counts = countingUntill150(0)
    println(counts)
  }
  //parallel execution:
  var count = 0
  def countingUntill150(a:Int):Int = {
    if (a < 150) {
      count += 10
      countingUntill150(a + 1)
    }
    count
  }
}

