case class SpaceAge(val seconds : Long) {

  def onEarth   : Double = calculateAge(Period.earth)

  def onMercury : Double = calculateAge(Period.mercury)

  def onVenus   : Double = calculateAge(Period.venus)

  def onMars    : Double = calculateAge(Period.mars)

  def onJupiter : Double = calculateAge(Period.jupiter)

  def onSaturn  : Double = calculateAge(Period.saturn)

  def onUranus  : Double = calculateAge(Period.uranus)

  def onNeptune : Double = calculateAge(Period.neptune)

  private def calculateAge(planetPeriod: Double) = precision(seconds / planetPeriod)

  private def precision(number: Double) = (number * 100).round / 100.0

}

object Period {
  val earth   = 31557600.00
  val mercury = 0.2408467  * earth
  val venus   = 0.61519726 * earth
  val mars    = 1.8808158  * earth
  val jupiter = 11.862615  * earth
  val saturn  = 29.447498  * earth
  val uranus  = 84.016846  * earth
  val neptune = 164.79132  * earth
}