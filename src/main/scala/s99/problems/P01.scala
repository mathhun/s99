package s99.problems

object P01 {
  def last[A](xs: List[A]): A = {
    if (xs.isEmpty) throw new Exception("list is empty")
    else xs match {
      case x :: Nil => x
      case x :: xs => last(xs)
    }
  }
}
