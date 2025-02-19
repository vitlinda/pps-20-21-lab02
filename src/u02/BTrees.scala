package u02

object BTrees extends App {

  // A custom and generic binary tree of elements of type A
  sealed trait Tree[A]
  object Tree {
    case class Leaf[A](value: A) extends Tree[A]
    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

    import Option._

    def operation[A, B](t: Tree[A], predicate: Option[A => Boolean], op: (B, B) => B): B = (t, predicate) match {
      case (Branch(l, r), _) => op(operation(l, predicate, op), operation(r, predicate, op) )
      case (Leaf(e), Some(p)) if p(e) => ???
      case _ => ???
    }

    def size[A](t: Tree[A]): Int = t match {
      case Branch(l, r) => size(l) + size(r)
      case _ => 1
    }

    def find[A](t: Tree[A], predicate: A => Boolean): Boolean = t match {
      case Branch(l, r) => find(l, predicate) || find (r,predicate)
      case Leaf(e) => predicate(e)
    }

    def count[A](t: Tree[A], predicate: A => Boolean): Int = t match {
      case Branch(l, r) => count(l, predicate) + count(r,predicate)
      case Leaf(e) if predicate(e) => 1
      case _ => 0
    }
  }

  import Tree._
  val tree = Branch(Branch(Leaf(1),Leaf(2)),Leaf(1))

  val count: (Int, Int) => Int = _ + _
  operation(tree, Some((x: Int) => x == 1), count)
}
