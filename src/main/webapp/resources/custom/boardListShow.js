/**
 * Board Control Script
 */

$(document).ready(function() {
	var table = $('#alt_pagination').DataTable({
		pagingType : "full_numbers",
		responsive : true,
		processing : true,
		ordering : false,
		serverSide : true,
		searching : true,

		ajax : {
			"type" : "POST",
			"url" : "reviewsAjax",
			"dataType" : "JSON"
		},

		columns : [ {
			data : null
		}, {
			className : 'details-show',
			data : "title"
		}, {
			className : 'details-show',
			data : "memberId"
		}, {
			className : 'details-show',
			data : "createdDate"
		} ],

		columnDefs : [ {
			searchable : false,
			orderable : false,
			targets : 0
		}, ]
	});

	table.on('draw.dt', function() {
		var info = table.page.info();
		table.column(0, {
			search : 'applied',
			order : 'applied',
			page : 'applied'
		}).nodes().each(function(cell, i) {
			cell.innerHTML = i + 1 + info.start;
		});
	});

	$('#alt_pagination').on('click', 'td.details-show', function() {
		var tr = $(this).closest('tr');
		var row = table.row(tr);

		location.href = 'readArticle?boardId=' + row.data().boardId;
	});

});