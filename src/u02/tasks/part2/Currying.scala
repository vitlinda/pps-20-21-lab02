package u02.tasks.part2

object Currying {
  val p1: (Int, Int) => (Int => Boolean) = (a,b) => c => (a <= b) && ( b <= c)

  val p2: (Int, Int, Int) => Boolean = (a, b, c) => (a <= b) && (b <= c)
}
