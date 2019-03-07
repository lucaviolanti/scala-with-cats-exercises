package scalawithcatstest.chapter03

import org.scalatest.FlatSpec
import scalawithcats.chapter03.Box
import scalawithcats.chapter03.Box._
import scalawithcats.chapter03.Printable._
import shapeless.test.illTyped

class BoxSpec extends FlatSpec {
  "A Box" should "be formatted according to the inner type" in {
    assert(format(Box("hello")) equals "\"hello\"")
    assert(format(Box(true)) equals "yes")
  }

  "Formatting a Box" should "not compile when the inner type does not have a `Printable`" in {
    illTyped("""format(Box(123))""")
  }
}
