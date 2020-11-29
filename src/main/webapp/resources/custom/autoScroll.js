/**
 * Autoscroll Script
 */

$(document).ready(function() {
	$('html, body').animate({
		scrollTop : $('#scroll').offset().top
	}, 'slow');
});