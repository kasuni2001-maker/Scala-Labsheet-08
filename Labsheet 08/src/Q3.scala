object Q3 {

    def toUpper(s: String): String = {
      s.toUpperCase()
    }

    def toLower(s: String): String = {
      s.toLowerCase()
    }

    def toUpper(s:String, i:Int) : String = {
      var str = new StringBuilder(s)
      var c = toUpper(s.charAt(i).toString)
      str.deleteCharAt(i)
      str.insert(i,c).toString()
    }

    def formatNmaes(name:String, f:String => String) : String = f(name)

    def formatNames(name: String, f : (String,Int) => String, index:Int): String = f(name,index)

    def main(args: Array[String]): Unit = {
      val arr:Array[String] = Array("Benny", "Niroshan", "Saman", "Kumara")

      def formattedNames(name : String): String => String = {
        name match {
          case  n if n == arr(0) => formatNames(arr(0), toUpper)
          case n if n == arr(1) =>  formatNames(arr(1), toUpper, 1)
          case n if n == arr(2) => formatNames(arr(2), toLower, 1)
          case n if n == arr(3) => formatNames(arr(3), toUpper,arr(3).length-1)
        }
      }
      formattedNames.foreach(println)
    }
}
