package u02.tasks

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._
import u02.tasks.es2a.Functions
import u02.tasks.es2a.Functions._

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
    //    val negation: Int => Boolean = s => s > 0
    val negative: Int => Boolean = _ > 0
    val notNegative = function.genericNeg(negative)
    assertTrue( notNegative(-1))
  }

  @Test def testNotEmptyStillWorksWithGenericNeg() {
    val empty: String => Boolean = _ == ""
    val notEmpty = function.genericNeg(empty);
    assertTrue(notEmpty("foo"))
  }

}
