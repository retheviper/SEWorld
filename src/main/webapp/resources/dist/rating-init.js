$(function() {
  $.fn.raty.defaults.path = 'resources/assets/images/rating/';

  // Default Score
  $('#score-rating').raty({
    score: 3
  });

  $('#score-rating').raty({
    click: function(score, evt) {
      alert('별점: ' + score + ' 점');
    }
  });
  
});
