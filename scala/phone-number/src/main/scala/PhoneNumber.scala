class PhoneNumber(val phone: String) {

  def number = cleanNumber match {
    case ValidNumber()       => cleanNumber
    case ValidElevenDigits() => cleanNumber.tail
    case _                   => "0000000000"
  }

  def areaCode : String = number.take(3)

  def phoneStart : String = number.substring(3, 6)

  def phoneEnd: String = number.substring(6, 10)

  override def toString = s"($areaCode) $phoneStart-$phoneEnd"

  private def cleanNumber : String = phone.replaceAll("[^0-9]", "")
}

case object ValidNumber {
  def unapply(number: String) : Boolean = number.length == 10
}

case object ValidElevenDigits {
  def unapply(number: String) : Boolean = number.length == 11 && number.startsWith("1")
}
