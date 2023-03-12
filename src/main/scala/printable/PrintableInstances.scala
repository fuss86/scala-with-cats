package printable

/**
 * Create an object PrintableInstances containing instances of
 * Printable for String and Int.
 */
object PrintableInstances {

  implicit val printableInt: Printable[Int] = (a: Int) => s"$a.Int"
  implicit val printableString: Printable[String] = (a: String) => s"$a.String"


}
