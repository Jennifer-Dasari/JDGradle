trait animals {
  def sound:String
}
class cat extends animals {
  override def sound:String = {
    " meow "
  }
}
case class dog() extends animals {
  override def sound: String = {
    " bow bow"
  }
}