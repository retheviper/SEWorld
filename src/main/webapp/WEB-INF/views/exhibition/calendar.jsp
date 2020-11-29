<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href='css/fullcalendar.min.css' rel='stylesheet' />
<link href='css/fullcalendar.print.min.css' rel='stylesheet' media='print' />
<script src='js/lib/moment.min.js'></script>
<script src='js/lib/jquery.min.js'></script>
<script src='js/fullcalendar.min.js'></script>
<script src='js/locale-all.js'></script>
<script>
	$(document).ready(function() {
		 $('#calendar').fullCalendar({
		     locale: 'ko'
		   , selectable: true
		   , selectHelper: true
		   , dayClick:	viewWord
		   , editable: false
		   , eventLimit: true // allow "more" link when too many events
		   , events: getWordCount
		 });
	});
  	var docStrDate;
  	var docEndDate;
  	
	function getWordCount(strDate,endDate,timezone,callback){
		docStrDate = strDate.format('YYYY-MM-DD');
		docEndDate = endDate.format('YYYY-MM-DD');
		var output;
		$.ajax({
			 method : 'POST'
			,url	: 'getWordCount'
			,data	: 	JSON.stringify({start:strDate,end:endDate})
			,dataType	: 'json'
			,contentType	: 'application/json; charset=UTF-8'
			,success: function(response){
					callback(response)
			}
		});
	}
	function viewWord(getDate){
		if(typeof getDate === 'string'){
			var date = getDate;
		}else{
			var date = getDate.format('YYYY-MM-DD');
		}
		$.ajax({
			 method : 'POST'
			,url	: 'getDayWord'
			,data	: 	JSON.stringify({indate:date})
			,dataType	: 'json'
			,contentType	: 'application/json; charset=UTF-8'
			,success: function(response){
				if($("#calender-view").children(".col-md-3") != null){
					$("#calender-view").children(".col-md-3").remove();
				}
				
				if(response.length < 1){
					$(".col-md-9").removeClass().addClass("col-md-12");
				}else{
					$(".col-md-12").removeClass().addClass("col-md-9");
					addHTML = "";
					addHTML += "<div class='col-md-3'><div class='card'><div class='card-body'><table class='table'><thead class='thead-dark'>";
					addHTML += "<tr><th>"+date+"</th></tr>";
					addHTML += "</thead><tbody>";
					$.each(response,function(index,item){
						addHTML += "<tr><td><a href='${pageContext.request.contextPath}/wordView?start="+docStrDate+"&end="+docEndDate+"'>"+item.mainword+"<a></td></tr>";
					});
					addHTML += "</tbody></table></div></div></div>";
					
					$("#calender-view").append(addHTML);
				}
			}
		});
	}
</script>
<style>
  #calendar {
    max-width: 900px;
    margin: 0 auto;
  }
</style>
<div class="content mt-3">
	<div class="animated fadeIn">
		<div class="row" id="calender-view">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<strong class="card-title"><b>캘린더</b></strong>
					</div>
					<div class="card-body" id="calendar-body">
						<div id="calendar"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- .animated -->
</div>