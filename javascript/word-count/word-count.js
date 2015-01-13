'use-strict';

module.exports = function(sentence) {
  var counter = {};

  sentence.split(/\s/).forEach(function(word){
    // .hasOwnProperty is used to avoid evaluating reserved words
    counter[word] = counter.hasOwnProperty(word) ? counter[word] + 1 : 1;
  });

  return counter;
};
