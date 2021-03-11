package u02.tasks.part2

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class CompositionTest {
  val composition = Composition

  @Test def compositionTest() {
    assertEquals(9, composition.compose(_ - 1, _ * 2)(5))
  }

  @Test def genericComposeTest() {
    assertEquals(7, composition.genericCompose[Int](x => x, _+2)(5))
  }



}

