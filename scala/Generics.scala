object Generics {
  def main(args: Array[String]): Unit = {
    val sys: List[Aeroplane] = List(Aeroplane("zxc", 234), Aeroplane("ini", 1234),
      Aeroplane("abcd", 98))
    val sys0 = List(Games("cxz",2),Games("thrfb",3),Games("BHGB",4))
    val sys2: Aeroplane = Aeroplane(" ", 234)
    val sys3: Games = Games(" wes", 18)
   println(display(1,sys,sys0))
    println(display(1,sys0,sys))
  }
  def display[A,B](k: Int,x: List[A], y:List[B]): (List[A],List[B],Int)= {
    (x,y,k)
  }
}
case class Aeroplane(name: String,capacity: Int)
case class Games(name: String, Id: Int)
















object ExamplesOnGenerics{
  def main(args: Array[String]): Unit ={
    val mamu1 = Mamu("babi",7)
    //List(stu1,std2)
    val mamu2 = List(Mamu("ABC",1),Mamu("DEF",2))
    val mamu3 = Mami(" GHI","JKL")
    val mamu4 = List(Mami("MNO","PQR"))
    println(year(mamu4,mamu2,5))
    println(year(mamu2,mamu4,6))
  }
  def year[A,B](j:List[A],k:List[B],l:Int):(List[A],List[B],Int) ={
    (j,k,l)
  }
}
case class Mamu(name:String,Id:Int)
case class Mami(first: String,last:String)

