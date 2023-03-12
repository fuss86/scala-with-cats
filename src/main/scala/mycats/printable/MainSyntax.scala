package mycats.printable

import mycats.Cat
import mycats.printable.PrintableInstances._
import mycats.printable.PrintableSyntax.PrintableOps

object MainSyntax {

  def main(args: Array[String]): Unit = {
    2023.print
    "scala".print
    Cat("Luis", 7, "black").print
  }

}
