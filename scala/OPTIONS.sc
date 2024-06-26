sealed trait Option[+A] {
  def getOrElse[B >: A](default: B): B
  def isEmpty: Boolean
  def isDefined: Boolean = !isEmpty

  def map[B](f: A => B): Option[B]
  def flatMap[B](f: A => Option[B]): Option[B]
  def filter(p: A => Boolean): Option[A]
}

final case class Some[A](x: A) extends Option[A] {
  def getOrElse[B >: A](default: B): B = x
  def isEmpty: Boolean = false

  def map[B](f: A => B): Option[B] = Some(f(x))
  def flatMap[B](f: A => Option[B]): Option[B] = f(x)
  def filter(p: A => Boolean): Option[A] = if (p(x)) this else None
}

final case object None extends Option[Nothing] {
  def getOrElse[B](default: B): B = default
  def isEmpty: Boolean = true

  def map[B](f: Nothing => B): Option[B] = None
  def flatMap[B](f: Nothing => Option[B]): Option[B] = None
  def filter(p: Nothing => Boolean): Option[Nothing] = None
}
