object caseClassOperations { //created object
  def main(args: Array[String]): Unit = { //created main method
  println(getEmployee)
    println(getEmployee2)
    println(getDetails)
    println(getDetails1)
  }
  case class Tectoro(name: String,id: Int,salary: Double,city: String, pincode: Int) // created case class and gave 5 parameters
   val employee = List(Tectoro("saima",123,12345.67,"banglore",510007), //now im coverting case class elements into a list
     Tectoro("riya", 124, 09876.65,"assam", 200001),
     Tectoro("sravya",125,12345.67,"kerala",300005),
     Tectoro("sunny",126,129863.344,"kurnool",876543)
   )
   val getEmployee = employee.filter(x => x.id == 126 )//im applying filter filter method on employee and retriving sunny's details here
   val getEmployee2 = employee.filter(x =>x.id == 120 || x.city == "assam")//its an OR operation that means any value if anyone condition is true then it will be executed
   val getDetails = employee.filter(x=>x.id >=75)
   val getDetails1 = employee.take(3)//here i can take 3 values from the list
   


}
