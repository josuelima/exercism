class Anagram(val word: String) {

  def matches(candidates: Seq[String]) : Seq[String] = candidates.filter(compare)

  private def compare(anagram: String) : Boolean =
    anagram.toLowerCase.sorted == word.toLowerCase.sorted &&
    anagram.toLowerCase != word.toLowerCase

}
