class DNA(val dna: String) {
  dna.foreach(validateNucleotide)

  def count(nucleotide: Char) : Int = {
    validateNucleotide(nucleotide)
    dna.count(_ == nucleotide)
  }

  def nucleotideCounts : Map[Char, Int] = nucleotides ++ countedNucleotides

  private def nucleotides = Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)

  private def countedNucleotides : Map[Char, Int] = dna.groupBy(c => c).map(w => w._1 -> w._2.length)

  private def validateNucleotide(nucleotide: Char) =
    if(!nucleotides.contains(nucleotide)) throw new IllegalArgumentException

}
