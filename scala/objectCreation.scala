object objectCreation extends App {
 val a = Mpc().thomson()
 val b = new Bca().charles()
 val c = Msc(1,"",2).edison()
 val d = new Bsc(1).rutherfor()
  val e = new Bipc(1,2,3).wrrite()
 val f = Bio(2).pascal()
}
case class Mpc(){
  def thomson(): Unit ={
  }
}
class Bca {
  def charles(): Unit ={
  }
}
case class Msc(a:Int,b:String,c:Int){
  def edison(): Unit = {
  }
}
class Bsc(a:Int){
  def rutherfor(): Unit = {
    println(" ###############################")
  }
}
class Bipc(a:Int,b:Int,c:Int){
  def wrrite(): Unit = {
  }
}
case class Bio(s:Int) {
  def pascal(): Unit = {
  }
}
