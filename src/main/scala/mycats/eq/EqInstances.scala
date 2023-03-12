package mycats.eq

import cats.Eq
import mycats.Cat

object EqInstances {

  implicit val eqCat: Eq[Cat] = (x: Cat, y: Cat) => x == y

}
