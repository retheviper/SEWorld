<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="any"
	href="resources/assets/images/logo2.png">
    <title>SE World 전세계 기술 전시</title>
    <link href="resources/assets/libs/jsgrid/dist/jsgrid-theme.min.css" rel="stylesheet">
    <link href="resources/assets/libs/jsgrid/dist/jsgrid.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="resources/dist/css/style.min.css" rel="stylesheet">
    <!-- 벡터맵 css지도 -->
     <link href="resources/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.css" rel="stylesheet" />
    <!-- Custom CSS 새로 -->
    <link href="resources/dist/css/style.min.css" rel="stylesheet">
    
    <!-- 탭 스타일 -->
    
    
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<style>
.back-to-top {
  position: fixed;
  display: none;
  background: rgba(0, 0, 0, 0.2);
  color: #fff;
  padding: 6px 12px 9px 12px;
  font-size: 16px;
  border-radius: 2px;
  right: 15px;
  bottom: 15px;
  transition: background 0.5s;
}

@media (max-width: 768px) {
  .back-to-top {
    bottom: 15px;
  }
}

.back-to-top:focus {
  background: rgba(0, 0, 0, 0.2);
  color: #fff;
  outline: none;
}

.back-to-top:hover {
  background: #2dc997;
  color: #fff;
}

/*--------------------------------------------------------------
# General
--------------------------------------------------------------*/
body {
  background: #fff;
  color: #666666;
  font-family: "Open Sans", sans-serif;
}

a {
  color: #2dc997;
}

a:hover, a:active, a:focus {
  color: #2dca98;
  outline: none;
  text-decoration: none;
}

p {
  padding: 0;
  margin: 0 0 30px 0;
}

h1, h2, h3, h4, h5, h6 {
  font-family: "Poppins", sans-serif;
  font-weight: 400;
  margin: 0 0 20px 0;
  padding: 0;
}

/* Prelaoder */
#preloader {
  position: fixed;
  left: 0;
  top: 0;
  z-index: 999;
  width: 100%;
  height: 100%;
  overflow: visible;
  background: #fff url("resources/regna/img/preloader.svg") no-repeat center center;
}

/* Back to top button */
.back-to-top {
  position: fixed;
  display: none;
  background: rgba(0, 0, 0, 0.2);
  color: #fff;
  padding: 6px 12px 9px 12px;
  font-size: 16px;
  border-radius: 2px;
  right: 15px;
  bottom: 15px;
  transition: background 0.5s;
}

@media (max-width: 768px) {
  .back-to-top {
    bottom: 15px;
  }
}

.back-to-top:focus {
  background: rgba(0, 0, 0, 0.2);
  color: #fff;
  outline: none;
}

.back-to-top:hover {
  background: #2dc997;
  color: #fff;
}

/*--------------------------------------------------------------
# Header
--------------------------------------------------------------*/
#header {
  padding: 30px 0;
  height: 92px;
  position: fixed;
  left: 0;
  top: 0;
  right: 0;
  transition: all 0.5s;
  z-index: 997;
}

#header #logo {
  float: left;
}

#header #logo h1 {
  font-size: 36px;
  margin: 0;
  padding: 6px 0;
  line-height: 1;
  font-family: "Poppins", sans-serif;
  font-weight: 700;
  letter-spacing: 3px;
  text-transform: uppercase;
}

#header #logo h1 a, #header #logo h1 a:hover {
  color: #fff;
}

#header #logo img {
  padding: 0;
  margin: 0;
}

@media (max-width: 768px) {
  #header #logo h1 {
    font-size: 26px;
  }
  #header #logo img {
    max-height: 40px;
  }
}

#header.header-fixed {
  background: rgba(52, 59, 64, 0.9);
  padding: 20px 0;
  height: 72px;
  transition: all 0.5s;
}

/*--------------------------------------------------------------
# Hero Section
--------------------------------------------------------------*/
#hero {
  width: 100%;
  height: 100vh;
  background: url(resources/assets/images/lion.jpg) top center;
  background-size: cover;
  position: relative;
}

@media (min-width: 1024px) {
  #hero {
    background-attachment: fixed;
  }
}

#hero:before {
  content: "";
  background: rgba(0, 0, 0, 0.6);
  position: absolute;
  bottom: 0;
  top: 0;
  left: 0;
  right: 0;
}

#hero .hero-container {
  position: absolute;
  bottom: 0;
  top: 0;
  left: 0;
  right: 0;
  display: flex;
  justify-content: center;
  align-items: right;
  flex-direction: column;
  text-align: left;
  float:right;
  margin-left : 50px;
}

#hero h1 {
  margin: 30px 0 10px 0;
  font-size: 48px;
  font-weight: 700;
  line-height: 56px;
  text-transform: uppercase;
  color: #fff;
}

@media (max-width: 768px) {
  #hero h1 {
    font-size: 28px;
    line-height: 36px;
  }
}

#hero h2 {
  color: #eee;
  margin-bottom: 50px;
  font-size: 24px;
}

@media (max-width: 768px) {
  #hero h2 {
    font-size: 18px;
    line-height: 24px;
    margin-bottom: 30px;
  }
}

#hero .btn-get-started {
  font-family: "Poppins", sans-serif;
  text-transform: uppercase;
  font-weight: 500;
  font-size: 16px;
  letter-spacing: 1px;
  display: inline-block;
  padding: 8px 28px;
  border-radius: 50px;
  transition: 0.5s;
  margin: 10px;
  border: 2px solid #fff;
  color: #fff;
}

#hero .btn-get-started:hover {
  background: #2dc997;
  border: 2px solid #2dc997;
}

/*--------------------------------------------------------------
# Navigation Menu
--------------------------------------------------------------*/
/* Nav Menu Essentials */
.nav-menu, .nav-menu * {
  margin: 0;
  padding: 0;
  list-style: none;
}

.nav-menu ul {
  position: absolute;
  display: none;
  top: 100%;
  left: 0;
  z-index: 99;
}

.nav-menu li {
  position: relative;
  white-space: nowrap;
}

.nav-menu > li {
  float: left;
}

.nav-menu li:hover > ul,
.nav-menu li.sfHover > ul {
  display: block;
}

.nav-menu ul ul {
  top: 0;
  left: 100%;
}

.nav-menu ul li {
  min-width: 180px;
}

/* Nav Menu Arrows */
.sf-arrows .sf-with-ul {
  padding-right: 30px;
}

.sf-arrows .sf-with-ul:after {
  content: "\f107";
  position: absolute;
  right: 15px;
  font-family: FontAwesome;
  font-style: normal;
  font-weight: normal;
}

.sf-arrows ul .sf-with-ul:after {
  content: "\f105";
}

/* Nav Meu Container */
#nav-menu-container {
  float: right;
  margin: 0;
}

@media (max-width: 768px) {
  #nav-menu-container {
    display: none;
  }
}

/* Nav Meu Styling */
.nav-menu a {
  padding: 0 8px 10px 8px;
  text-decoration: none;
  display: inline-block;
  color: #fff;
  font-family: "Poppins", sans-serif;
  font-weight: 400;
  text-transform: uppercase;
  font-size: 13px;
  outline: none;
}

.nav-menu > li {
  margin-left: 10px;
}

.nav-menu > li > a:before {
  content: "";
  position: absolute;
  width: 100%;
  height: 2px;
  bottom: 0;
  left: 0;
  background-color: #2dc997;
  visibility: hidden;
  -webkit-transform: scaleX(0);
  transform: scaleX(0);
  -webkit-transition: all 0.3s ease-in-out 0s;
  transition: all 0.3s ease-in-out 0s;
}

.nav-menu a:hover:before, .nav-menu li:hover > a:before, .nav-menu .menu-active > a:before {
  visibility: visible;
  -webkit-transform: scaleX(1);
  transform: scaleX(1);
}

.nav-menu ul {
  margin: 4px 0 0 0;
  border: 1px solid #e7e7e7;
}

.nav-menu ul li {
  background: #fff;
}

.nav-menu ul li:first-child {
  border-top: 0;
}

.nav-menu ul li a {
  padding: 10px;
  color: #333;
  transition: 0.3s;
  display: block;
  font-size: 13px;
  text-transform: none;
}

.nav-menu ul li a:hover {
  background: #2dc997;
  color: #fff;
}

.nav-menu ul ul {
  margin: 0;
}

/* Mobile Nav Toggle */
#mobile-nav-toggle {
  position: fixed;
  right: 0;
  top: 0;
  z-index: 999;
  margin: 20px 20px 0 0;
  border: 0;
  background: none;
  font-size: 24px;
  display: none;
  transition: all 0.4s;
  outline: none;
  cursor: pointer;
}

#mobile-nav-toggle i {
  color: #fff;
}

@media (max-width: 768px) {
  #mobile-nav-toggle {
    display: inline;
  }
}

/* Mobile Nav Toggle */
#mobile-nav-toggle {
  position: fixed;
  right: 0;
  top: 0;
  z-index: 999;
  margin: 20px 20px 0 0;
  border: 0;
  background: none;
  font-size: 24px;
  display: none;
  transition: all 0.4s;
  outline: none;
  cursor: pointer;
}

#mobile-nav-toggle i {
  color: #fff;
}

@media (max-width: 768px) {
  #mobile-nav-toggle {
    display: inline;
  }
}

/* Mobile Nav Styling */
#mobile-nav {
  position: fixed;
  top: 0;
  padding-top: 18px;
  bottom: 0;
  z-index: 998;
  background: rgba(52, 59, 64, 0.9);
  left: -260px;
  width: 260px;
  overflow-y: auto;
  transition: 0.4s;
}

#mobile-nav ul {
  padding: 0;
  margin: 0;
  list-style: none;
}

#mobile-nav ul li {
  position: relative;
}

#mobile-nav ul li a {
  color: #fff;
  font-size: 16px;
  overflow: hidden;
  padding: 10px 22px 10px 15px;
  position: relative;
  text-decoration: none;
  width: 100%;
  display: block;
  outline: none;
}

#mobile-nav ul li a:hover {
  color: #fff;
}

#mobile-nav ul li li {
  padding-left: 30px;
}

#mobile-nav ul .menu-has-children i {
  position: absolute;
  right: 0;
  z-index: 99;
  padding: 15px;
  cursor: pointer;
  color: #fff;
}

#mobile-nav ul .menu-has-children i.fa-chevron-up {
  color: #2dc997;
}

#mobile-nav ul .menu-item-active {
  color: #2dc997;
}

#mobile-body-overly {
  width: 100%;
  height: 100%;
  z-index: 997;
  top: 0;
  left: 0;
  position: fixed;
  background: rgba(52, 59, 64, 0.9);
  display: none;
}

/* Mobile Nav body classes */
body.mobile-nav-active {
  overflow: hidden;
}

body.mobile-nav-active #mobile-nav {
  left: 0;
}

body.mobile-nav-active #mobile-nav-toggle {
  color: #fff;
}

/*--------------------------------------------------------------
# Sections
--------------------------------------------------------------*/
/* Sections Header
--------------------------------*/
.section-header .section-title {
  font-size: 32px;
  color: #111;
  text-transform: uppercase;
  text-align: center;
  font-weight: 700;
  margin-bottom: 5px;
}

.section-header .section-description {
  text-align: center;
  padding-bottom: 40px;
  color: #999;
}



</style>

</head>

<body>
    <!-- ============================================================== -->
    <!-- Preloader - style you can find in spinners.css -->
    <!-- ============================================================== -->
    
    <!-- ============================================================== -->
    <!-- Main wrapper - style you can find in pages.scss -->
    <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Topbar header - style you can find in pages.scss -->
        <!-- ============================================================== -->
      <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="#hero"><img src="" alt="" title="" /></img></a>
        <!-- Uncomment below if you prefer to use a text logo -->
        <!--<h1><a href="resources/regna/#hero">Regna</a></h1>-->
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="resources/regna/#hero">Home</a></li>
          <li><a href="resources/regna/#about">Exhibition</a></li>
          <li><a href="resources/regna/#services">Review</a></li>
          <li><a href="resources/regna/#portfolio">Question</a></li>
          <li><a href="resources/regna/#team">Calendar</a></li>
          <li class="menu-has-children"><a href="resources/regna/">Drop Down</a>
            <ul>
              <li><a href="resources/regna/#">Drop Down 1</a></li>
              <li class="menu-has-children"><a href="resources/regna/#">Drop Down 2</a>
                <ul>
                  <li><a href="resources/regna/#">Deep Drop Down 1</a></li>
                  <li><a href="resources/regna/#">Deep Drop Down 2</a></li>
                  <li><a href="resources/regna/#">Deep Drop Down 3</a></li>
                  <li><a href="resources/regna/#">Deep Drop Down 4</a></li>
                  <li><a href="resources/regna/#">Deep Drop Down 5</a></li>
                </ul>
              </li>
              <li><a href="resources/regna/#">Drop Down 3</a></li>
              <li><a href="resources/regna/#">Drop Down 4</a></li>
              <li><a href="resources/regna/#">Drop Down 5</a></li>
            </ul>
          </li>
          <li><a href="resources/regna/#contact">Contact Us</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->

  <!--==========================
    Hero Section
  ============================-->
  <section id="hero">
    <div class="hero-container">
      <h2>WE &nbsp;<span class="typed"></span></h2>
        <p>Welcome to SEWorld</p>

        <div class="list-unstyled list-social">
          <a href="#"><i class="fab fa-facebook"></i></a>
          <a href="#"><i class="fab fa-twitter"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
          <a href="#"><i class="fab fa-google-plus"></i></a>
        </div>
    </div>
  </section><!-- #hero -->
     
     
     
     
     
     
     
        <!-- ============================================================== -->
        <!-- End Topbar header -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Left Sidebar - style you can find in sidebar.scss  -->
        <!-- ============================================================== -->
       
        <!-- ============================================================== -->
        <!-- End Left Sidebar - style you can find in sidebar.scss  -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Page wrapper  -->
        <!-- ============================================================== -->
        <div class="newpage" style="background-color : #eac0c0">
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-5 align-self-center">
                        <h4 class="page-title">Basic Table</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Board</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                    
                    
                    
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- End Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- Container fluid  -->
            <!-- ============================================================== -->
            <div class="container-fluid">
   
   
   
                <!-- ============================================================== -->
                <!-- Start Page Content -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-12">
                            <div class="card">
                            <div class="card-body">
                            <!-- 탭으로 구분하깅 -->
                             
		<!-- Nav tabs -->
<ul class="nav nav-tabs customtab" role="tablist">
    <li class="nav-item"> <a class="nav-link active" data-toggle="tab" href="#home2" role="tab"><span class="hidden-sm-up"><i class="ti-home"></i></span> <span class="hidden-xs-down">Home</span></a> </li>
    <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#profile2" role="tab"><span class="hidden-sm-up"><i class="ti-user"></i></span> <span class="hidden-xs-down">Profile</span></a> </li>
    <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#messages2" role="tab"><span class="hidden-sm-up"><i class="ti-email"></i></span> <span class="hidden-xs-down">Messages</span></a> </li>
</ul>
<!-- Tab panes -->
<div class="tab-content">
    <div class="tab-pane active" id="home2" role="tabpanel">
        <div class="p-20">
        
        <!-- 월드 맵 -->
           		
                                <h4 class="card-title">World Map</h4>
                                <div id="world-map-markers" style="height: 700px;"></div>
                           
    </div>
    
    <div class="tab-pane  p-20" id="profile2" role="tabpanel">
    <!-- 미국지도 -->
                                <h4 class="card-title">USA</h4>
                                <div id="usa" style="height: 700px;"></div>
    <!-- 미국지도 -->
    
    
    </div>
    <div class="tab-pane p-20" id="messages2" role="tabpanel">
    
                                <h4 class="card-title">India</h4>
                                <div id="india" style="height: 450px;"></div>
    </div>     
                        </div>
                            <!-- 탭으로 구분하깅 -->
                            
            </div>            
                            
                     
                      </div><!-- 카드 body -->
                        
        </div><!-- 카드 -->
                     
                    </div>
                </div>
                
                <!-- ============================================================== -->
                <!-- End PAge Content -->
                <!-- ============================================================== -->
                <!-- ============================================================== -->
                <!-- Right sidebar -->
                <!-- ============================================================== -->
                <!-- .right-sidebar -->
                <!-- ============================================================== -->
                <!-- End Right sidebar -->
                <!-- ============================================================== -->
            </div>
            <!-- ============================================================== -->
            <!-- End Container fluid  -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- footer -->
            <!-- ============================================================== -->
     <a href="#" class="back-to-top"><i class="fas fa-angle-double-up"></i></a>
            <footer class="footer text-center">
            SCIT 6조 Project
</footer>
            <!-- ============================================================== -->
            <!-- End footer -->
            <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- End Page wrapper  -->
        <!-- ============================================================== -->
<!-- 메인 레퍼 자꾸 엉켜서  지웠음..; -->
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
    <!-- customizer Panel -->
    <!-- ============================================================== -->
    <!-- aside -->
    <div class="chat-windows"></div>
    <!-- ============================================================== -->
    <!-- All Jquery -->
    <!-- ============================================================== -->
    <script src="resources/assets/libs/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap tether Core JavaScript -->
    <script src="resources/assets/libs/popper.js/dist/umd/popper.min.js"></script>
    <script src="resources/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- apps -->
    <script src="resources/dist/js/app.min.js"></script>
     <script src="resources/dist/js/app.init.iconbar.js"></script>
    <script src="resources/dist/js/app-style-switcher.js"></script>
    <!-- slimscrollbar scrollbar JavaScript -->
    <script src="resources/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js"></script>
    <script src="resources/assets/extra-libs/sparkline/sparkline.js"></script>
    <!--Wave Effects -->
    <script src="resources/dist/js/waves.js"></script>
    <!--Menu sidebar -->
    <script src="resources/dist/js/sidebarmenu.js"></script>
    <!--Custom JavaScript -->
    <script src="resources/dist/js/custom.min.js"></script>
    <!-- This Page JS -->
    <script src="resources/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.min.js"></script>
    <script src="resources/assets/extra-libs/jvector/jquery-jvectormap-world-mill-en.js"></script>
    <script src="resources/assets/extra-libs/jvector/jquery-jvectormap-in-mill.js"></script>
    <script src="resources/assets/extra-libs/jvector/jquery-jvectormap-us-aea-en.js"></script>
    <script src="resources/assets/extra-libs/jvector/jquery-jvectormap-uk-mill-en.js"></script>
    <script src="resources/assets/extra-libs/jvector/jquery-jvectormap-au-mill.js"></script>
    <script src="resources/assets/extra-libs/jvector/jvectormap.custom.js"></script>
     <script src="resources/dist/typed.js"></script>
    
    <script>
    jQuery(document).ready(function( $ ) {

    	  // Header fixed and Back to top button
    	  $(window).scroll(function() {
    	    if ($(this).scrollTop() > 100) {
    	      $('.back-to-top').fadeIn('slow');
    	      $('#header').addClass('header-fixed');
    	    } else {
    	      $('.back-to-top').fadeOut('slow');
    	      $('#header').removeClass('header-fixed');
    	    }
    	  });
    	  $('.back-to-top').click(function(){
    	    $('html, body').animate({scrollTop : 0},1500, 'easeInOutExpo');
    	    return false;
    	  });
    	
    	  
    	// Mobile Navigation
    	  if( $('#nav-menu-container').length ) {
    	    var $mobile_nav = $('#nav-menu-container').clone().prop({ id: 'mobile-nav'});
    	    $mobile_nav.find('> ul').attr({ 'class' : '', 'id' : '' });
    	    $('body').append( $mobile_nav );
    	    $('body').prepend( '<button type="button" id="mobile-nav-toggle"><i class="fa fa-bars"></i></button>' );
    	    $('body').append( '<div id="mobile-body-overly"></div>' );
    	    $('#mobile-nav').find('.menu-has-children').prepend('<i class="fa fa-chevron-down"></i>');

    	    $(document).on('click', '.menu-has-children i', function(e){
    	      $(this).next().toggleClass('menu-item-active');
    	      $(this).nextAll('ul').eq(0).slideToggle();
    	      $(this).toggleClass("fa-chevron-up fa-chevron-down");
    	    });

    	    $(document).on('click', '#mobile-nav-toggle', function(e){
    	      $('body').toggleClass('mobile-nav-active');
    	      $('#mobile-nav-toggle i').toggleClass('fa-times fa-bars');
    	      $('#mobile-body-overly').toggle();
    	    });

    	    $(document).click(function (e) {
    	      var container = $("#mobile-nav, #mobile-nav-toggle");
    	      if (!container.is(e.target) && container.has(e.target).length === 0) {
    	       if ( $('body').hasClass('mobile-nav-active') ) {
    	          $('body').removeClass('mobile-nav-active');
    	          $('#mobile-nav-toggle i').toggleClass('fa-times fa-bars');
    	          $('#mobile-body-overly').fadeOut();
    	        }
    	      }
    	    });
    	  } else if ( $("#mobile-nav, #mobile-nav-toggle").length ) {
    	    $("#mobile-nav, #mobile-nav-toggle").hide();
    	  }
    	  // Smoth scroll on page hash links
    	  $('a[href*="#"]:not([href="#"])').on('click', function() {
    	    if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {

    	      var target = $(this.hash);
    	      if (target.length) {
    	        var top_space = 0;

    	        if( $('#header').length ) {
    	          top_space = $('#header').outerHeight();

    	          if( ! $('#header').hasClass('header-fixed') ) {
    	            top_space = top_space - 20;
    	          }
    	        }

    	        $('html, body').animate({
    	          scrollTop: target.offset().top - top_space
    	        }, 1500, 'easeInOutExpo');

    	        if ( $(this).parents('.nav-menu').length ) {
    	          $('.nav-menu .menu-active').removeClass('menu-active');
    	          $(this).closest('li').addClass('menu-active');
    	        }

    	        if ( $('body').hasClass('mobile-nav-active') ) {
    	          $('body').removeClass('mobile-nav-active');
    	          $('#mobile-nav-toggle i').toggleClass('fa-times fa-bars');
    	          $('#mobile-body-overly').fadeOut();
    	        }
    	        return false;
    	      }
    	    }
    	  });
	  
    	  
    
    	 /*타자 쳐지는 효과 만들기 */
    	  var typed = $(".typed");

    	  $(function() {
    	    typed.typed({
    	      strings: [" ARE GLOBALLY UNLIMITED.", "SHOW YOU TONS OF EXHIBITIONS.", "PROVIDE USER-FRIENDLY MAPS."],
    	      typeSpeed: 100,
    	      loop: true,
    	    });
    	  });
    	  
    });
    
    
    </script>
</body>

</html>