package scalawithcatstest.chapter03

import org.scalatest.FlatSpec
import scalawithcats.chapter03.Box
import scalawithcats.chapter03.Codec._

class CodecSpec extends FlatSpec {
  "The Codecs" should "work as expected" in {
    assert(encode(123.4) equals "123.4")
    assert(decode[Double]("123.4") equals 123.4)
    assert(encode(Box(123.4)) equals "123.4")
    assert(decode[Box[Double]]("123.4") equals Box(123.4))
  }
}
