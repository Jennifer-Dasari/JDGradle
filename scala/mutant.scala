import scala.collection.mutable.Seq
import scala.collection.JavaConverters._
object mutant{
  def main(args: Array[String]): Unit = {
    val mutable1 = Seq(1,2,3,4)
    val javaList = mutable1.asJava
    println(javaList)
//    try {
//      javaList.set(0,5)
//    }
//    catch{
//      case e: UnsupportedOperationException => println("UnsupportedOperationException")
//    }
//    val javaList2 = new java.util.ArrayList[Int]()
//    val javaConversions = javaList.asScala
//    javaConversions += 5
//    println(javaConversions)
    val mut3 = mutable1:+9
    val mut = mutable1.update(3,5) //updating the seq
    val mut2 = mutable1(2)=6//if i try to print this i ll get () coz this stores nothing so i need to be printing mutable1
    println("mutable sequence " + mutable1)
    println(mut3)
  }
}

