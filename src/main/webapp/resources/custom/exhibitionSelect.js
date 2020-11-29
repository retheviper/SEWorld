/**
 * jQuery DataTable for exhibitions list
 */
function format(data) {
	return '<table cellpadding="5" cellspacing="0" border="0" style="padding-left:50px;">'
			+ '<tr><td>Title in English:</td><td>'
			+ data.exhibitionTitleEng
			+ '</td></tr><tr><td>City:</td><td>'
			+ data.openingCity
			+ '</td></tr><tr><td>To get extra info:</td><td><a href="exhibitionDetail?exhibitionId='
			+ data.exhibitionId + '">Click here</a></td></tr></table>';
}

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
			"url" : "exhibitionListAjax",
			"dataType" : "JSON"
		},

		columns : [ {
			data : null
		}, {
			"className" : 'details-control',
			"orderable" : false,
			"data" : null,
			"defaultContent" : ''
		}, {
			data : "exhibitionTitleKor"
		}, {
			data : "openingCountry"
		}, {
			data : "openingTerm"
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

	$('#alt_pagination').on('click', 'td.details-control', function() {
		var tr = $(this).closest('tr');
		var row = table.row(tr);

		if (row.child.isShown()) {
			row.child.hide();
			tr.removeClass('shown');
		} else {
			row.child(format(row.data())).show();
			tr.addClass('shown');
		}
	});

	$("#checkall").click(function() {
		// 클릭
		if ($("#checkall").prop("checked")) {
			// input태그의 name이 chk인 태그들을 찾아서 checked옵션을 true로 정의
			$("input[name=chk]").prop("checked", true);
			// 클릭x
		} else {
			// input태그의 name이 chk인 태그들을 찾아서 checked옵션을 false로 정의
			$("input[name=chk]").prop("checked", false);
		}
	})

});