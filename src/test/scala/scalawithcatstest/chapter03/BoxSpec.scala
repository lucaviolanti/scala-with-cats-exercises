package scalawithcatstest.chapter03

import org.scalatest.FlatSpec
import org.scalatest.Matchers._
import scalawithcats.chapter03.Box
import scalawithcats.chapter03.Box._
import scalawithcats.chapter03.Printable._

class BoxSpec extends FlatSpec {
  "A Box" should "be formatted according to the inner type" in {
    assert(format(Box("hello")) equals "\"hello\"")
    assert(format(Box(true)) equals "yes")
  }

  "format(Box(123))" shouldNot compile
}
