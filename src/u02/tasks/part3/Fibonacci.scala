package u02.tasks.part3

object Fibonacci {


  def fib(n: Int): Int = {
    @annotation.tailrec
    def _fib(n: Int, accumulator: Int, a: Int): Int = n match {
      case 0 => accumulator
      case _ => _fib(n - 1, a, accumulator + a)
    }
    _fib(n, 0, 1)
  }


}
