package scalawithcats.chapter03

sealed trait Tree[+A]

final case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

final case class Leaf[A](value: A) extends Tree[A]

object Tree {

  import cats.Functor

  implicit val treeFunctor: Functor[Tree] = new Functor[Tree] {
    override def map[A, B](t: Tree[A])(f: A => B): Tree[B] = t match {
      case Branch(l, r) => Branch(map(l)(f), map(r)(f))
      case Leaf(v) => Leaf(f(v))
    }
  }
}
