package u02.tasks.part4

import scala.math

sealed trait Shape
object Shape {
  case class Rectangular(width: Double, height: Double) extends Shape
  case class Circle(radius: Double) extends Shape
  case class Square(side: Double) extends Shape

  def perimeter(shape: Shape): Double = shape match {
    case Rectangular(w, h) => 2 * (w + h)
    case Circle(r) => r * math.Pi * 2
    case Square(s) => s * 4
  }

  def area(shape: Shape): Double = shape match {
    case Rectangular(w, h) => w * h
    case Circle(r) => math.Pi * math.pow(r, 2)
    case Square(s) => math.pow(s, 2)
  }

}

