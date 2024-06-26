object listOperations {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5,6) //created a list here
    val list2 = list1.appended(7)//im adding an element at the end of the list
    val list3 = list1.prepended(0)//im adding an element at the starting of the list
    val list4 = list1.toSeq(3) //list1.toSeq converts list1 to a Seq, but since List is already a Seq, this conversion doesn't change the structure. (3) accesses the element at index 3 of the list.
    val list5 = list1.toString()//here im converting the list1 into a string
    val list6 = list1.head // trying to access head of the list
    val list7 = list1.tail//trying to access or get the tail of the list
    val list8 = list1.map(a => a * 2) //trying to compute all the ele of list
    val list9 = list1.take(5)
    val list10 = list1.foreach(a => println(a))
    val list11 = list1.flatMap(a=>List(a, a + 3))
    val list12 = list1.filter(x => x == 2)
    val list13 = list1.forall(a => a == 8)
    val list14 = List("a","b","c","d");println(list2) //multiline
    val list15 = list14.toList
    val list16 = list1.to(Array)// CONVERTING MY LIST1 INTO ARRAY
    val list17 = list1.to(Vector)// converting my list1 into vectors
    val list18 = list1.to(Seq)//converting my list into seq
    val list19 = list1.+:(7)
    val list20 = list1.fold(0)((x,y) => x + y )

    println(list3)
    println(list4)
    println(list5)
    println(list6)
    println(list7)
    println(list8)
    println(list9)
    println(list10)
    println(list11)
    println(list12)
    println(list13)
    println(list14)
    println(list15)
    println(list16)
    println(list17)
    println(list18)
    println(list19)
    println(list20)
    val l1 = List(1,2,34,5)
  }
}
//{Step-by-Step Execution of line 20
// list1 = 1,2,3,4,5,6 . initialization, x = 0, y = the starting of the elements => 0+ 1
//Initial value: 0
//First element: 1
//Apply (0 + 1) -> 1
//Second element: 2
//Apply (1 + 2) -> 3
//Third element: 3
//Apply (3 + 3) -> 6
//Fourth element: 4
//Apply (6 + 4) -> 10
//Fifth element: 5
//Apply (10 + 5) -> 15
//Sixth element: 6
//Apply (15 + 6) -> 21}