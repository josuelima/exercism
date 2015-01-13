object Hamming {

  def compute(sequence_a: String, sequence_b: String) : Integer =
    sequence_a.zip(sequence_b).count { case(a,b) => a != b }

}
