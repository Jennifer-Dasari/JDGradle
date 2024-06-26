object pattern{
  def main(args: Array[String]): Unit ={

    val m1 = minni("lmn",6)
     val result = m1.match {
      case minni("qrs", _) => " hai "
      case minni("hyt", 7) => " good morning"
      case minni("abc", 4) => " gn"
      case _ => "im no one"
    }
    println(result)
    val jenni = "jen"
    val xyz =  jenni.match {
      case("jenni") => "hello"
      case(x) if (x.length == 7) => "how r u"
      case _ => "i am groot"
    }
    println(xyz)
  }
  case class minni(name: String, age: Int) {
     }
}