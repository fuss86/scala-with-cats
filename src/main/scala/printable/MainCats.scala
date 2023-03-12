package printable

import cats.implicits._
import ShowInstances._

object MainCats {

  def main(args: Array[String]): Unit = {
    println(2023.show)
    println("scala".show)
    println(Cat("Luis", 7, "black").show)
  }

}
