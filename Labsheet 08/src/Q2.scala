object Q2 {

    def main(args: Array[String]): Unit = {
      val input = getUserInput("Enter an integer: ").toInt

      val checkNumber: Int => String = {
        case n if n < 0 => "Negative"
        case 0 => "Zero"
        case n if n % 2 == 0 => "Even number"
        case _ => "Odd number"
      }

      val result = checkNumber(input)
      println(result)
    }

    def getUserInput(prompt: String): String = {
      println(prompt)
      scala.io.StdIn.readLine()
    }


}
