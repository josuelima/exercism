class Bob {

  def hey(input: String) : String =
    if(input.toUpperCase == input && input.toLowerCase() != input)
      return "Whoa, chill out!"
    else if(input.replaceAll("""\s+""", "").length == 0)
      return "Fine. Be that way!"
    else if(input.takeRight(1) == "?")
      return "Sure."
    else
      return "Whatever."

}
