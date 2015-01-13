'use-strict';

module.exports.compute = function(seq_a, seq_b) {
  if(seq_a.length !== seq_b.length) throw new Error('DNA strands must be of equal length.')

  var distance = 0;

  for(var i = 0; i < seq_a.length; i++)
    if(seq_a.charAt(i) !== seq_b.charAt(i)) distance++;

  return distance;
};
