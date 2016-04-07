package s99.problems

import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators}

object P01Check extends Properties("P01") {
  property("last()") = forAll { (s: List[Int]) =>
    (!s.isEmpty) ==> (P01.last(s) == s.last)
  }
}
