package scalawithcatstest

import org.scalatest._
import scalawithcats.Tree._
import scalawithcats._
import cats.syntax.functor._

class TreeSpec extends FlatSpec {
  "A Tree" should "get doubled when mapping `double` over it" in {
    val evenTree: Tree[Int] = Branch(Leaf(1), Branch(Leaf(3), Leaf(5)))
    val doubleTree: Tree[Int] = Branch(Leaf(2), Branch(Leaf(6), Leaf(10)))
    assert(evenTree.map(_ * 2) == doubleTree)
  }
}