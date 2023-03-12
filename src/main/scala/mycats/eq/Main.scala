package mycats.eq

import cats.implicits._
import mycats.Cat
import mycats.eq.EqInstances._

object Main {

  def main(args: Array[String]): Unit = {
    val cat1       = Cat("Garfield", 38, "orange and black")
    val cat2       = Cat("Heathcliff", 33, "orange and black")
    val optionCat1 = Option(cat1)
    val optionCat2 = Option.empty[Cat]

    println(cat1 === cat2)
    println(optionCat1 === optionCat2)

  }

}
