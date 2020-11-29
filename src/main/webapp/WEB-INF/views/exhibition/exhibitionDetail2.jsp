<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>volumn bootstrap 3 one page template</title>

  <!-- css -->
  <link href="resources/volumn/css/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="resources/volumn/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
  <link href="resources/volumn/css/nivo-lightbox.css" rel="stylesheet" />
  <link href="resources/volumn/css/nivo-lightbox-theme/default/default.css" rel="stylesheet" type="text/css" />
  <link href="resources/volumn/css/owl.carousel.css" rel="stylesheet" media="screen" />
  <link href="resources/volumn/css/owl.theme.css" rel="stylesheet" media="screen" />
  <link href="resources/volumn/css/flexslider.css" rel="stylesheet" />
  <link href="resources/volumn/css/animate.css" rel="stylesheet" />
  <link href="resources/volumn/css/style.css" rel="stylesheet">
  <link href="resources/volumn/color/default.css" rel="stylesheet">



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>전시회 상세 정보 - SE World</title>
<!-- 구글맵 -->
<script>
var map;
var exhibitionhall = "${exhibitionDetail.exhibitionHall}";   //전시회장 이름 불러옴

function initMap() {
   // 마커 아이콘 변경
   var options = {
              zoom: 16,         // 확대 비율!
              center: new google.maps.LatLng(37.5130509, 127.0584479), // centered KOEX
              mapTypeId: google.maps.MapTypeId.ROADMAP,               // HYBRID, ROADMAP, SATELLITE, TERRAIN 4가지 종류가 있음
              mapTypeControl: false,
              scaleControl: false,
              rotateControl: true,
              suppressInfoWindows: true,
              gestureHandling: 'greedy'      //지도 확대/축소 컨트롤 키 누르고 스크롤 기능 안하고 그냥 스크롤로 확대/축소
          };
          
  // init map
  map = new google.maps.Map(document.getElementById('map'), options);      // 맵 생성!
  //Geocoder 를 받아옴. : 주소 - > 좌표값 얻음
  var geocoder = new google.maps.Geocoder();
  //geocodeAddress를 불러와서 exhibitionhall를 뿌림.
  if(exhibitionhall!=null){
     geocodeAddress(geocoder, map);
  }
}

function geocodeAddress(geocoder, resultsMap) {
    //전시회장 이름 불러옴
   var address = exhibitionhall;
    // 마커 아이콘 변경
    var myIcon = new google.maps.MarkerImage("resources/image/icon/maps_icon7(50, 50).png", null, null, null, new google.maps.Size(50, 50)); // (가로, 세로)
    
    geocoder.geocode({'address': address}, function(results, status) {
      if (status === 'OK') {
        resultsMap.setCenter(results[0].geometry.location);
        var marker = new google.maps.Marker({
          map: resultsMap,
          icon: myIcon,
          animation: google.maps.Animation.DROP,       //지도 실행시 마커 표시가 위에서 떨어지는 효과
          position: results[0].geometry.location
        });
      } else {
        alert('Geocode was not successful for the following reason: ' + status);
      }
    });
}
</script>
<style type="text/css">
section{
   width: 100%;
    min-height: 100vh;
    background: #c850c0;
    background: -webkit-linear-gradient(45deg, #4158d0, #c850c0);
    background: -o-linear-gradient(45deg, #4158d0, #c850c0);
    background: -moz-linear-gradient(45deg, #4158d0, #c850c0);
    background: linear-gradient(45deg, #4158d0, #c850c0);
  
    display: -webkit-box;
    display: -webkit-flex;
    display: -moz-box;
    display: -ms-flexbox;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-wrap: wrap;
    padding: 50px 30px 50px 30px; /* 높이 조절 */
    text-align:"center";
    position: relative;
}

div#exTitle{
   border: 1px solid #444444;
   border-radius: 20px;
   text-align: center;
   background-color: white;
   width:600px;
}

div.input{
   width: 100%;
   border: 1px solid #444444;
   border-radius: 20px;
   text-align: center;
   background-color: white;
   margin: auto; 
   position: relative;
   left: 0;
   right: 0;
   top: 20px;
   bottom: 0;
}

table{
   width: 600px;
   border-top: 1px solid #444444;
    border-collapse: collapse;
    background-color: white;
    
}

tr{
   padding: 10px;
}

td{
   border-bottom: 1px solid #444444;
   padding: 10px;
}

#map{
   border-radius: 20px;
   display: block;
}

#like{
   
   margin-left:80%;
}

#wishlist{
   
   margin-right:0;
}

</style>
</head>
<body>
<!-- Navigation -->
  <div id="navigation">
    <nav class="navbar navbar-custom" role="navigation">
      <div class="container">
        <div class="row">
          <div class="col-md-2 mob-logo">
            <div class="row">
              <div class="site-logo">
                <a href="./"><img src="resources/assets/images/logo2.png" style="width: 60px; height: 50px;" alt="" /></a>
              </div>
            </div>
          </div>


          <div class="col-md-10 mob-menu">
            <div class="row">
              <!-- Brand and toggle get grouped for better mobile display -->
              <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu">
                                                <i class="fa fa-bars"></i>
                                                </button>
              </div>
              <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="menu" style="">
                <ul class="nav navbar-nav navbar-right">
                  <li class="active"><a href="#intro">Home</a></li>
                  <li><a href="#about">About Us</a></li>
                  <li><a href="#service">Services</a></li>
                  <li><a href="#works">Works</a></li>

                  <li><a href="#contact">Contact</a></li>
                  <li class="dropdown nav-toggle">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropwdown<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                      <li><a class="external" href="#">Sub menu</a></li>
                      <li><a class="external" href="#">Sub menu</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
              <!-- /.Navbar-collapse -->
            </div>
          </div>
        </div>
      </div>
      <!-- /.container -->
    </nav>
  </div>
  <!-- /Navigation -->
   
<section>
   <div id="wrapper">
      
      <a href="http://www.aimer-web.jp/"><img src="resources/image/icon/like1.png" id="like" style="width: 100px; height: 60px;"/></a>
      <a href="http://www.naver.com/"><img src="resources/image/icon/wishlist.png" id="wishlist" style="width: 100px; height: 60px;"/></a>
      <br/><br/>
      <div class="col-md-6 tablerow">
         
         <div id="exTitle">
            <ul style="list-style:none; padding: 10px;">
               <li>${exhibitionDetail.exhibitionTitleKor}</li>
               <li>${exhibitionDetail.exhibitionTitleEng}</li>
            </ul>
         </div>
         <br/>
         <table>
            <tr>
               <td style="color: #808080;">개최기간</td>
               <td>${exhibitionDetail.openingTerm}</td>
            </tr>
            <tr>
               <td>최초개최연도</td>
               <td>${exhibitionDetail.firstOpeningYear}</td>
            </tr>
            <tr>
               <td>개최국가</td>
               <td>${exhibitionDetail.openingCountry}</td>
            </tr>
            <tr>
               <td>개최도시</td>
               <td>${exhibitionDetail.openingCity}</td>
            </tr>
            <tr>
               <td>주최기관</td>
               <td>${exhibitionDetail.sponsor}</td>
            </tr>
         </table>
         <br/>
      </div>
      <div class="col-md-6 buttonrow">
      
   </div>
      <div class="col-md-6 maprow">
         <div id="map" style="float:right; width:550px; height:340px; margin-left: auto; margin-right: auto;"></div>
      </div>
   </div>
    <!-- /#wrapper -->
    <div class="col-md-6 commentrow">
      <div class="input"><br/>
         <div id="result"></div>
         <hr>
         <input class="userid" type="text" placeholder="ID"> <input
         class="replytext" type="text" placeholder="내용"
         onkeypress="if(event.keyCode==13) {replyInsert(); return false;}">
         <input id="replyInsert" type="button" value="추가">
         <br/><br/>
      </div><br/>
   </div>
</section>
   




<!-- Core JavaScript Files -->
  <script src="resources/volumn/js/jquery.min.js"></script>
  <script src="resources/volumn/js/bootstrap.min.js"></script>
  <script src="resources/volumn/js/jquery.sticky.js"></script>
  <script src="resources/volumn/js/slippry.min.js"></script>
  <script src="resources/volumn/js/jquery.flexslider-min.js"></script>
  <script src="resources/volumn/js/morphext.min.js"></script>
  <script src="resources/volumn/js/jquery.mb.YTPlayer.js"></script>
  <script src="resources/volumn/js/jquery.easing.min.js"></script>
  <script src="resources/volumn/js/jquery.scrollTo.js"></script>
  <script src="resources/volumn/js/jquery.appear.js"></script>
  <script src="resources/volumn/js/stellar.js"></script>
  <script src="resources/volumn/js/wow.min.js"></script>
  <script src="resources/volumn/js/owl.carousel.min.js"></script>
  <script src="resources/volumn/js/nivo-lightbox.min.js"></script>
  <script src="resources/volumn/js/jquery.nicescroll.min.js"></script>
  <script src="resources/volumn/js/custom.js"></script>
  <script src="resources/volumn/contactform/contactform.js"></script>
<!-- 구글 맵 -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDf0YT_ifom64iJnlKsQ7XYfONTzQcNGvg&libraries=places&callback=initMap"
         async defer></script>
</body>
</html>