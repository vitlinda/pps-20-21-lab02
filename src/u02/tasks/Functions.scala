package u02.tasks

object Functions {

  val parity: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

//  def parityAsMethod(number: Int): String = {
//    parity(number)
//  }
  def parityAsMethod(number: Int): String = number match {
    case number if number % 2 == 0 => "even"
    case _ => "odd"
  }

  //  val neg: (String => Boolean) => (String => Boolean) = p => (s => !p(s))
  val neg: (String => Boolean) => (String => Boolean) = p => !p(_)

  //  def negAsMethod(predicate: String => Boolean): String => Boolean = s => (!predicate(s))
  def negAsMethod(predicate: String => Boolean): String => Boolean = !predicate(_)

}