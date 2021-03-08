package u02.tasks

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._
import u02.tasks.Functions._

class FunctionsTest {

  val function = Functions

  @Test def testParity(){
    assertEquals("even", function.parity(2))
    assertEquals("odd", function.parity(3))
    assertEquals("even", function.parity(4))
  }

  @Test def testParityFun(){
    assertEquals("odd", function.parityFun(5))
    assertEquals("odd", function.parityFun(3))
    assertEquals("even", function.parityFun(2))

  }

}
