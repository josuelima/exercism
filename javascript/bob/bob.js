var Bob = function() {};

Bob.prototype.hey = function(input) {

  if(input.toUpperCase() == input && input.toLowerCase() != input)
    return 'Whoa, chill out!';

  else if(input.replace(/\s/g, '').length == 0)
    return 'Fine. Be that way!'

  else if(input.indexOf('?') == input.length - 1)
    return 'Sure.';

  else
    return 'Whatever.';

};

module.exports = Bob;
