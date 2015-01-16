'use-strict';

var Beer = function() {};

Beer.verse = function(number) {
  return verseInit(number) + verseEnd(number);
};

Beer.sing = function(from, to) {
  to = to == null ? 0 : to
  var output = [];

  for(var i = from; i >= to; i--)
    output.push(this.verse(i));

  return output.join("\n");
};

function verseInit(n) {
  switch(n) {
    case 0:  return "No more bottles of beer on the wall, no more bottles of beer.\n"
    default: return [n, plural(n), "of beer on the wall,", n, plural(n), "of beer.\n"].join(" ");
  };
};

function verseEnd(n) {
  switch(n) {
    case 0:  return "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
    case 1:  return "Take it down and pass it around, no more bottles of beer on the wall.\n";
    default: return ["Take one down and pass it around,", n - 1, plural(n - 1) , "of beer on the wall.\n"].join(" ");
  };
}

function plural(number) {
  return number == 1 ? "bottle" : "bottles";
}

module.exports = Beer;