package u02.tasks.part2

object Composition {
  //compose(x => x -1, y => y * 2)(5)
  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

}
