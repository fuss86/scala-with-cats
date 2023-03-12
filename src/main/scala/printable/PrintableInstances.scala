package printable

/**
  * Create an object PrintableInstances containing instances of
  * Printable for String and Int.
  */
object PrintableInstances {

  implicit val printableInt: Printable[Int]       = (a: Int) => a.toString
  implicit val printableString: Printable[String] = (a: String) => a
  implicit val printableCat: Printable[Cat] = (a: Cat) =>
    s"${Printable.format(a.name)} is a ${Printable.format(a.age)} year-old ${Printable.format(a.color)} cat."

}
