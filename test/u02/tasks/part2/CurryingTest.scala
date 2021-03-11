package u02.tasks.part2

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class CurryingTest {

  val currying = Currying

  @Test def testP1() {
    val partialResult1 = currying.p1(1,2)
    val result1 = partialResult1(3)
    assertTrue(result1)

    val partialResult2 = currying.p1(3,2)
    val result2 = partialResult2(3)
    assertFalse(result2)
  }

  @Test def testP2() {
    assertTrue(currying.p2(1,2,3))
    assertFalse(currying.p2(2,1,3))
    assertFalse(currying.p2(2,1,3))
  }
}
