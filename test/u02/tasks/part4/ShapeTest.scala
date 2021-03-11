package u02.tasks.part4

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.tasks.part4.Shape._

class ShapeTest {
  @Test def rectangularPerimeterAndAreaTest() = {
    assertEquals(24, perimeter(Rectangular(2,10)))
    assertEquals(20, area(Rectangular(2,10)))
  }

  @Test def CirclePerimeterAndAreaTest() = {
    assertEquals(13, perimeter(Circle(2)))
    assertEquals(13, area(Circle(2)))
  }

}
