object lamda {

  trait lamda2{
    def show(): Int
  }
  trait lamda3{
    def show(): Int
  }

  class L extends lamda2 with lamda3 {
    override def show(): Int = {
      0
    }
  }
  class A extends lamda2 {
    override def show(): Int = {
      12
    }

  }
  class M extends lamda2 {
    override def show(): Int = {
      7
    }

  }
  class D extends lamda2 {
    override def show(): Int = {
      9
    }

  }
def main(args: Array[String]): Unit = {
  new lamda2:
    override def show(): Int = ???
}
}
