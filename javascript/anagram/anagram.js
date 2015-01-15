'use-strict';

module.exports = function(word) {
  return {
    matches: matches.bind(this, word)
  };
};

var matches = function(word, anagrams) {
  anagrams = Array.isArray(anagrams) ? anagrams : [].slice.call(arguments, 1);

  return anagrams.filter(function(angr) {
    return word.isAnagramOf(angr);
  });
};

String.prototype.sorted = function() {
  return this.split("").sort().toString();
};

String.prototype.isAnagramOf = function(word) {
  return this.toLowerCase().sorted() === word.toLowerCase().sorted() && this.toLowerCase() !== word.toLowerCase();
}