package u02.tasks.part2

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class FunctionsTest {

  val function = Functions

  @Test def testParity() {
    assertEquals("even", function.parity(2))
    assertEquals("odd", function.parity(3))
    assertEquals("even", function.parity(4))
  }

  @Test def testParityAsMethod() {
    assertEquals("odd", function.parityAsMethod(5))
    assertEquals("odd", function.parityAsMethod(3))
    assertEquals("even", function.parityAsMethod(2))
  }

  @Test def testNeg() {
    //    val empty: String => Boolean = s => s == ""
    val empty: String => Boolean = _ == ""
    val notEmpty = function.neg(empty);
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(!notEmpty(""))

  }

  @Test def testNegAsMethod() {
    //    val empty: String => Boolean = s => s == ""
    val empty: String => Boolean = _ == ""
    val notEmpty = function.negAsMethod(empty);
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(!notEmpty(""))
  }

  @Test def testGenericNeg() {
    //    val positive: Int => Boolean = s => s > 0
    val positive: Int => Boolean = _ > 0
    val notPositive = function.genericNeg(positive)
    assertTrue(notPositive(-1))
  }

  @Test def testNotEmptyStillWorksWithGenericNeg() {
    val empty: String => Boolean = _ == ""
    val notEmpty = function.genericNeg(empty);
    assertTrue(notEmpty("foo"))
  }

}
