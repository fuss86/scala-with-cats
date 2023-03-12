package printable

/**
  * Create an object called PrintableSyntax.
  */
object PrintableSyntax {

  /**
    * Inside PrintableSyntax define an implicit class PrintableOps[A] to wrap up a value of type A.
    */
  implicit class PrintableOps[A](a: A) {

    /**
      * format accepts an implicit Printable[A] and returns a String
      * representation of the wrapped A;
      */
    def format(implicit printable: Printable[A]): String = printable.format(a)

    /**
      * print accepts an implicit Printable[A] and returns Unit. It
      * prints the wrapped A to the console
      */
    def print(implicit printable: Printable[A]): Unit = println(printable.format(a))
  }

}
