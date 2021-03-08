package u02.tasks

object Functions {

  val parity: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  def parityFun(number: Int): String = {
    parity(number)
  }

}
