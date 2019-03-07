package scalawithcats.chapter03

final case class Box[A](value: A)

object Box {
  implicit def boxPrintable[A](implicit pa: Printable[A]): Printable[Box[A]] =
    pa.contramap(_.value)
}
