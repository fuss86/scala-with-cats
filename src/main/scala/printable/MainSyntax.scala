package printable

import printable.PrintableSyntax.PrintableOps
import printable.PrintableInstances._

object MainSyntax {

  def main(args: Array[String]): Unit = {
    2023.print
    "scala".print
    Cat("Luis", 7, "black").print
  }

}
