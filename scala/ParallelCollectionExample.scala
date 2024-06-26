//object ParallelCollectionsExample {
//  def main(args: Array[String]): Unit = {
//    // Creating a parallel list from a sequential list
// //   val parallelList: collection.parallel.ParSeq[Int] = (0 to 100).par
//
//    // Performing parallel computations on the parallel list
//    val evenNumbers = parallelList.filter(_ % 2 == 0)
//    val sumOfAllNumbers = parallelList.fold(0)(_ + _)
//    val doubledNumbers = parallelList.map(_ * 2)
//
//    println(s"Even numbers: $evenNumbers")
//    println(s"Sum of all numbers: $sumOfAllNumbers")
//    println(s"Doubled numbers: $doubledNumbers")
//
//    // Creating a parallel range
//    val parallelVector = collection.parallel.ParVector.range(0, 1000)
//
//    // Creating a parallel vector using tabulate
//    val otherParallelVector = collection.parallel.ParVector.tabulate(1000)(x => x)
//
//    // Performing parallel computations on the parallel vector
//    val filteredVector = parallelVector.filter(_ % 5 == 0)
//    val productOfVector = parallelVector.fold(1)(_ * _)
//    val squaredVector = parallelVector.map(x => x * x)
//
//    println(s"Filtered vector (multiples of 5): $filteredVector")
//    println(s"Product of vector elements: $productOfVector")
//    println(s"Squared vector: $squaredVector")
//  }
//}
