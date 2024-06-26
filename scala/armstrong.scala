object armstrong {
  def main(args: Array[String]): Unit = {
    val number = 153 // Change this to any number you want to check
    if (isArmstrong(number)) {
      println(s"$number is an Armstrong number")
    } else {
      println(s"$number is not an Armstrong number")
    }
  }

  def isArmstrong(num: Int): Boolean = {
    val digits = num.toString.map(_.asDigit)
    println(digits)
    val numDigits = digits.length
    println(digits.length)
    val sumOfPowers = digits.map { digit =>
      println(digit)
      println(math.pow(digit, numDigits))
      math.pow(digit, numDigits)
    }.sum
    sumOfPowers == num
  }
}
