object lamdaFunctionExample {
  //function currying
  def show1(a: Int): (String,Int)=>(String,Int,Double)=>String = (b: String, c: Int) =>  (d: String,e:Int,f:Double) => a *2 + b
  def show(a: Int): (Int,Int) => (Int,Int,Int) =>Int = (b: Int, c:Int) => (d:Int,e:Int,f:Int) => a * b * c * d * e * f
def main(args: Array[String]): Unit = {
  val abc1 = show1(1)("jenni", 2)("john", 3 , 4.2)
  val abc = show(2)(3,4)(5,6,7)
  println(abc)





  //lamda functions with parameters here; a,b are the parameters
    val funct1 = (a:Int,b:Int) => a*b
   val funct0 = (_:Int) + (_:Int) + ("abc")
  println((1+2 + "abc" + (1+2) ))
  println(funct0(10,5))
    val functa = (jbc: Int ) => jbc * 2
  println(functa(3)+ "................................................................")
    println(funct1(7,3))
  val list0 = List(1,2,3).map( _ * 2)
  val list: List[(Int,Int)] = List((1,2),(2,2),(3,3))
  println(list)
  val tuple:(Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int) = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)
  println(tuple._1)
  val tuple2 = ("a","b","c","d","a","b","c","d","a","b","c","d","a","b","c","d","a","b","c","d","a","b")
  println(tuple2._22)
  //lamda functions without parameters
  val funct2  = () => {"values for funct2"}
  println(funct2())
}
class Jen{
  val name = "jenni"

  def nameDec(): String = {
    val name2 = " rain"
    name + " " + "rainbow"
  }
}
}
