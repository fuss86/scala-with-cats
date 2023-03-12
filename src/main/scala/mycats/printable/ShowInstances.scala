package mycats.printable

import cats._
import cats.implicits._
import mycats.Cat

object ShowInstances {

  implicit val printableCat: Show[Cat] = (a: Cat) =>
    s"${a.name.show} is a ${a.age.show} year-old ${a.color.show} cat."


}
