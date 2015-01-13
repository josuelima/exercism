object HammingRecursive {

  def compute(sequence_a: String, sequence_b: String) : Integer = {
    def acc(a: String, b: String, distance: Integer)(f: (Char, Char) => Int) : Int =
      if(a.isEmpty || b.isEmpty)
        distance
      else
        acc(a.tail, b.tail, distance + f(a.head, b.head))(f)

    acc(sequence_a, sequence_b, 0)((x: Char, y: Char) => if(x.equals(y)) 0 else 1)
  }

}
