package scalawithcats.chapter03

trait Printable[A] {
  self =>
  def format(value: A): String

  def contramap[B](f: B => A): Printable[B] =
    (value: B) => self.format(f(value))
}

object Printable {
  def format[A](value: A)(implicit p: Printable[A]): String = p.format(value)

  implicit val stringPrintable: Printable[String] =
    (value: String) => "\"" + value + "\""

  implicit val booleanPrintable: Printable[Boolean] =
    (value: Boolean) => if (value) "yes" else "no"
}