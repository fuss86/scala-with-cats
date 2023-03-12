package printable

/**
  * Define a type class Printable[A] containing a single method format.
  * format should accept a value of type A and return a String.
  */
trait Printable[A] {

  def format(a: A): String

}

/**
  * Define an object Printable with two generic interface methods:
  * format accepts a value of type A and a Printable of the corresponding type.
  * It uses the relevant Printable to convert the A to a String.
  * print accepts the same parameters as format and returns Unit. It
  * prints the A value to the console using println.
  */
object Printable {

  def apply[A](implicit printable: Printable[A]): Printable[A] = printable

  def format[A](a: A)(implicit printable: Printable[A]): String = printable.format(a)

  def print[A](a: A)(implicit printable: Printable[A]): Unit = println(printable.format(a))

}
