class Phrase(val phrase: String) {

  def wordCount : Map[String, Int] =
    phrase.replaceAll("[^\\w']", " ").split("\\s+").groupBy(w => w.toLowerCase()).map(w => w._1 -> w._2.length)

}
