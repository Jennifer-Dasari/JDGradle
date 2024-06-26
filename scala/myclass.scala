object MyClass{
  def main(args:Array[String]):Unit ={

  }
  case class Deloite(name:String,Id:Int)
  // this is thecreation of case class

  //now how to create the list of objects(deloitee objects)

  //first we have todeclare the List
  //inside the list we have to declare the Objects, like other data type
  // but in the place of datatype how can pass the objects of case class


  val dellist =List(Deloite("ravi",2),
    Deloite("raju",3),
    Deloite("ram",4))

  //this we how we create the objects of case class in list of objects

  // now how to use filter
  //filter also work like for loop and condition statement

  //for first iteration we get Deloite("ravi",2) in obj
  //for second iteration we get Deloitee("raju",3) in obj
  //for third itertaion because we have only three objects so this is the last


  //when we are accessing obj means deloitee refernce
  //so obj.name = delitee.name
  val output =  dellist.filter(obj => obj.name == "raju" )

  // we get only List(Deloitee("raju",3))

  //for example lets increase the conditions in filter

  val intput =  dellist.filter(obj => obj.name == "raju" || obj.name == "ravi")

  //we get List(  Deloite("ravi",2),  Deloite("raju",3) )


}