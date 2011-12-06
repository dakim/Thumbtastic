$(document).ready(function() {
	$("ul.thumb li a").hoverIntent({interval: 300,over: makeTall,timeout: 300,out: makeShort});
	function makeTall() {
	  $(this.lastElementChild).toggle();
	}
	function makeShort() {
	  $(this.lastElementChild).toggle();
	}
});