object Q1 {
    def main(args: Array[String]): Unit = {
      val deposit = input("Enter the deposit amount: ").toDouble
      val calculation: Double => Double = getInterest(deposit)
      val interest = calculation(deposit)

      println(s"The interest earned on Rs. $deposit is Rs. $interest")
    }

    def input(prompt: String): String = {
      println(prompt)
      scala.io.StdIn.readLine()
    }

    def getInterest(deposit: Double): Double => Double = {
      deposit match {
        case d if d <= 20000 => amount => 0.02 * amount
        case d if d <= 200000 => amount => 0.04 * amount
        case d if d <= 2000000 => amount => 0.055 * amount
        case _ => amount => 0.065 * amount
      }
    }


}
