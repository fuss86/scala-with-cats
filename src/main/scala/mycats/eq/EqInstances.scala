package mycats.eq

import cats.Eq
import cats.implicits.catsSyntaxEq
import mycats.Cat

object EqInstances {

  implicit val eqCat: Eq[Cat] =
    (x: Cat, y: Cat) => x.age === y.age && x.name === y.name && x.color === y.color

}
