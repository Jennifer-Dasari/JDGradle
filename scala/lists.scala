//PROGRAMS ON LISTS THAT TALKS ABOUT COLLECTIONS
object lists{
  val emptyList: Any = Nil
  val list: List[Int] = 1 :: 2 :: 3 :: Nil
  val newNumbers: List[Int] = 4 :: 5 :: list
  val list1: List[Int] = List(1, 2, 3)
  val concat: List[Int] = List(1, 2, 3) ::: List(4, 5, 6)
  val concat2: List[Int] = List(2, 3, 4) ++ List(5, 6, 7)

 def main(args: Array[String]): Unit = {
   println(s"emptyList: $emptyList")
   println(s"list: $list")
   println(s"newNumbers: $newNumbers")
   println(s"list1: $list1")
   println(s"concat: $concat")
   println(s"concat2: $concat2")
 }
}