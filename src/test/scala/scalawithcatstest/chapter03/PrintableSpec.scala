package scalawithcatstest.chapter03

import org.scalatest.FlatSpec
import scalawithcats.chapter03.Printable._

class PrintableSpec extends FlatSpec {
  "A string" should "be printed in quotes" in {
    assert(format("hello") equals "\"hello\"")
  }

  "A boolean" should "be printed as yes or no" in {
    assert(format(true) equals "yes")
    assert(format(false) equals "no")
  }
}
