package printable

import printable.PrintableInstances._

object MainInterfaceObjects {

  def main(args: Array[String]): Unit = {
    Printable.print(2023)
    Printable.print("scala")
    Printable.print(Cat("Luis", 7, "black"))
  }

}
