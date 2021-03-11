package u02.tasks.part3

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class FibonacciTest {
  @Test def fibonacciTest() {
    assertEquals(0, Fibonacci.fib(0))
    assertEquals(1, Fibonacci.fib(1))
    assertEquals(1, Fibonacci.fib(2))
    assertEquals(2, Fibonacci.fib(3))
    assertEquals(3, Fibonacci.fib(4))
  }

}
