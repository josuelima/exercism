class Bob {
  def hey(input: String) : String = input match {
    case Yelling()  => "Whoa, chill out!"
    case Silence()  => "Fine. Be that way!"
    case Question() => "Sure."
    case _ => "Whatever."
  }
}

case object Yelling {
  def unapply(input: String) = input.toUpperCase == input && input.toLowerCase() != input
}

case object Silence {
  def unapply(input: String) = input.replaceAll("""\s+""", "").length == 0
}

case object Question {
  def unapply(input: String) = input.endsWith("?")
}