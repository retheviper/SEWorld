<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<title>SE World - Welcome</title>
<link href="resources/assets/libs/jsgrid/dist/jsgrid-theme.min.css"
	rel="stylesheet">
<link href="resources/assets/libs/jsgrid/dist/jsgrid.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">
<!-- 벡터맵 css지도 -->
<link
	href="resources/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.css"
	rel="stylesheet" />
<!-- Custom CSS 새로 -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">

<!-- 메인 스타일 -->
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700"
	rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="resources/regna/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="resources/regna/lib/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link href="resources/regna/lib/animate/animate.min.css"
	rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="resources/regna/css/style.css" rel="stylesheet">

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

@media ( max-width : 768px) {
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
	background: #fff url("resources/regna/img/preloader.svg") no-repeat
		center center;
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

@media ( max-width : 768px) {
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

@media ( max-width : 768px) {
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
	background: url(resources/assets/images/land1.jpg) top center;
	background-size: cover;
	position: relative;
}

@media ( min-width : 1024px) {
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
	text-align: center;
	float: right;
	margin-left: 50px;
}

#hero h1 {
	margin: 30px 0 10px 0;
	font-size: 48px;
	font-weight: 700;
	line-height: 56px;
	text-transform: uppercase;
	color: #fff;
}

@media ( max-width : 768px) {
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

@media ( max-width : 768px) {
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

.nav-menu>li {
	float: left;
}

.nav-menu li:hover>ul, .nav-menu li.sfHover>ul {
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

@media ( max-width : 768px) {
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

.nav-menu>li {
	margin-left: 10px;
}

.nav-menu>li>a:before {
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

.nav-menu a:hover:before, .nav-menu li:hover>a:before, .nav-menu .menu-active>a:before
	{
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

@media ( max-width : 768px) {
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

@media ( max-width : 768px) {
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

/* 구글맵 추가 하지 마세요
--------------------------------*/
/* search box
--------------------------------*/

</style>
<script>


</script>
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
		<li class="menu-active"><a
			href="${pageContext.servletContext.contextPath}">Home</a></li>
		<li class="menu-has-children"><a href="./#exhibitions">Exhibition</a>
			<ul>
				<li><a href="exhibitionList">Exhibition List</a></li>
				<li><a href="googleView">GoogleMap</a></li>
				<li><a href="jvectorMap">VectorMap</a></li>
			</ul>
		<li class="menu-has-children"><a href="./#reviews">User's Voice</a>
			<ul>
				<li><a href="reviews">Review</a></li>
				<li><a href="questions">Question</a></li>
				<li><a href="writeArticle">Write Article</a></li>
			</ul> <c:if test="${empty sessionScope.loginId}">
				<li class="menu-has-children"><a href="profile">Member</a>
					<ul>
						<li><a href="login">Log in</a></li>
						<li><a href="signup">Sign up</a></li>
					</ul>
			</c:if> <c:if test="${not empty sessionScope.loginId}">
				<li class="menu-has-children"><a href="profile">${sessionScope.loginId}
						님</a>
					<ul>
						<li><a href="logout">Log out</a></li>
						<li><a href="profile">Profile</a></li>
						<li><a href="calendar">calendar</a></li>
					</ul>
			</c:if>
		<li><a href="howtouse">How to Use</a></li>
	</ul>
	</nav>
	<!-- #nav-menu-container -->
</div>
</header>	<!-- #header -->

	<!--==========================
    Hero Section
  ============================-->
	<section id="hero">
		<div class="hero-container">
			<h2>
				WE &nbsp;<span class="typed"></span>
			</h2>
			<p>Welcome to SEWorld</p>

			<div class="list-unstyled list-social">
				<a href="#"><i class="fab fa-facebook"></i></a> <a href="#"><i
					class="fab fa-twitter"></i></a> <a href="#"><i
					class="fab fa-instagram"></i></a> <a href="#"><i
					class="fab fa-google-plus"></i></a>
			</div>
		</div>
	</section>
	<!-- #hero -->







	<!-- ============================================================== -->
	<!-- End Topbar header -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- Left Sidebar - style you can find in sidebar.scss  -->
	<!-- ============================================================== -->

	<!-- ============================================================== -->
	<!-- End Left Sidebar - style you can find in sidebar.scss  -->
	<!-- ============================================================== -->
	<section id="about">
		<div class="container">
			<div class="row about-container">

				<div class="col-lg-6 content order-lg-1 order-2">
					<h2 class="title">Few Words About Us</h2>
					<p>We can handle a variety of languages including Oracle database, Java, and JavaScript. As you can see on this page, we can build web applications using bootstrap and JavaScript libraries, plug-ins and external APIs.</p>

					<div class="icon-box wow fadeInUp">
						<div class="icon">
							<i class="fa fa-shopping-bag"></i>
						</div>
						<h4 class="title">
							<a href="resources/regna/">Optimize Your Business</a>
						</h4>
						<p class="description">We have the skills to build a web site that's right for various tasks easily and quickly. It also focuses on a more user-friendly architecture.</p>
					</div>

					<div class="icon-box wow fadeInUp" data-wow-delay="0.2s">
						<div class="icon">
							<i class="fa fa-photo"></i>
						</div>
						<h4 class="title">
							<a href="resources/regna/">Multi-device affinity</a>
						</h4>
						<p class="description">You can expect to build a responsive website suitable for the latest trends and for a wide variety of devices.</p>
					</div>

					<div class="icon-box wow fadeInUp" data-wow-delay="0.4s">
						<div class="icon">
							<i class="fa fa-bar-chart"></i>
						</div>
						<h4 class="title">
							<a href="resources/regna/">Feature Optimization</a>
						</h4>
						<p class="description">You can tailor features such as bulletin boards and door forms for information delivery and exchange to suit your needs.</p>
					</div>

				</div>

				<div class="col-lg-6 background order-lg-2 order-1 wow fadeInRight">
					<video autoplay loop muted playsinline
						src="https://youtu.be/Db7M5tTv9b8"></video>
				</div>
			</div>

		</div>
	</section>
	<!-- #about -->

	<!-- 백터맵--> 
      <section id="facts">
      
      <div class="container-fluid wow fadeIn">
    
     <span data-toggle="counter-up">5955</span> Exhibitions are available
        <div class="section-header">
				<h3 class="section-title" style="float: left;">World Map</h3>
			</div>
			<div id="world-map-markers" style="height: 700px;"></div>
       
     </div><!-- wow fadeIn -->



	</section>
	<!-- #facts -->

	<!-- 전시회목록 -->
	<section id="exhibitions">
		<div class="container wow fadeIn">
			<div class="section-header">
				<h3 class="section-title">Lively Updated Exhibitions</h3>
				<p class="section-description">최근 전시회들</p>
			</div>
			<div class="row">
				<div class="col-lg-4 col-md-4 wow fadeInUp" data-wow-delay="0.2s" style="height:400;">
					<div class="card">
						<div id="carouselExampleIndicators3" class="carousel slide"
							data-ride="carousel" style="height:400;">
							<ol class="carousel-indicators">
								<li data-target="#carouselExampleIndicators3" data-slide-to="0"
									class="active"></li>
								<li data-target="#carouselExampleIndicators3" data-slide-to="1"></li>
								<li data-target="#carouselExampleIndicators3" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner" role="listbox">
								<div class="carousel-item active">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[0].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img01.jpg" alt="First slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[0].exhibitionTitleKor}</h3>
										<p>${recentExhibition[0].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[1].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img02.jpg" alt="Second slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[1].exhibitionTitleKor}</h3>
										<p>${recentExhibition[1].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[2].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img03.jpg" alt="Third slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[2].exhibitionTitleKor}</h3>
										<p>${recentExhibition[2].exhibitionTitleEng}</p>
									</div>
								</div>
							</div>

						</div>
					</div>
					<!-- card -->
				</div>
				<div class="col-lg-4 col-md-4 wow fadeInUp" data-wow-delay="0.4s">
					<div class="card">
						<div id="carouselExampleIndicators2" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carouselExampleIndicators2" data-slide-to="0"
									class="active"></li>
								<li data-target="#carouselExampleIndicators2" data-slide-to="1"></li>
								<li data-target="#carouselExampleIndicators2" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner" role="listbox">
								<div class="carousel-item active">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[3].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img04.jpg" alt="First slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[3].exhibitionTitleKor}</h3>
										<p>${recentExhibition[3].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[4].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img05.jpg" alt="Second slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[4].exhibitionTitleKor}</h3>
										<p>${recentExhibition[4].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[5].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img06.jpg" alt="Third slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[5].exhibitionTitleKor}</h3>
										<p>${recentExhibition[5].exhibitionTitleEng}</p>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>


				<div class="col-lg-4 col-md-4 wow fadeInUp" data-wow-delay="0.6s">
					<div class="card">
						<div id="carouselExampleIndicators1" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carouselExampleIndicators1" data-slide-to="0"
									class="active"></li>
								<li data-target="#carouselExampleIndicators1" data-slide-to="1"></li>
								<li data-target="#carouselExampleIndicators1" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner" role="listbox">
								<div class="carousel-item active">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[6].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img07.jpg" alt="First slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[6].exhibitionTitleKor}</h3>
										<p>${recentExhibition[6].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[7].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img08.jpg" alt="Second slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[7].exhibitionTitleKor}</h3>
										<p>${recentExhibition[7].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[8].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img09.jpg" alt="Third slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[8].exhibitionTitleKor}</h3>
										<p>${recentExhibition[8].exhibitionTitleEng}</p>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			<%-- 	<div class="col-lg-6 col-md-6 wow fadeInUp" data-wow-delay="0.4s">
					<div class="card">
						<div id="carouselExampleIndicators4" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carouselExampleIndicators4" data-slide-to="0"
									class="active"></li>
								<li data-target="#carouselExampleIndicators4" data-slide-to="1"></li>
								<li data-target="#carouselExampleIndicators4" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner" role="listbox">
								<div class="carousel-item active">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[9].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img10.jpg" alt="First slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[9].exhibitionTitleKor}</h3>
										<p>${recentExhibition[9].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[10].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img11.jpg" alt="Second slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[10].exhibitionTitleKor}</h3>
										<p>${recentExhibition[10].exhibitionTitleEng}</p>
									</div>
								</div>
								<div class="carousel-item">
									<a href="exhibitionDetail?exhibitionId=${recentExhibition[11].exhibitionId}"><img class="resources/regna/img-fluid"
										src="resources/assets/images/big/img12.jpg" alt="Third slide"></a>
									<div class="carousel-caption d-none d-md-block">
										<h3 class="text-white">${recentExhibition[11].exhibitionTitleKor}</h3>
										<p>${recentExhibition[11].exhibitionTitleEng}</p>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div> --%>

			</div>
			<!-- row -->

		</div>
	</section>
	<!-- #services -->


	<!-- 전시회목록 end-->


	<section id="reviews">
		<div class="container wow fadeIn">
			<div class="section-header">
				<h3 class="section-title">Recent reviews</h3>
				<p class="section-description">생생한 후기</p>
			</div>
			<div class="row">
				<c:if test="${not empty recentReviews[0]}">
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.2s">
						<div class="card">
							<img class="card-img-top img-responsive"
								src="resources/assets/images/big/img4.jpg" alt="Card image cap">
							<div class="card-body">
								<div class="d-flex no-block align-items-center m-b-15">
									<span><i class="ti-calendar"></i>&nbsp;&nbsp;${recentReviews[0].updatedDate}</span>
									<div class="ml-auto">
										<a href="readArticle?boardId=${recentReviews[0].boardId}" class="link"><i
											class="ti-comments"></i>&nbsp;&nbsp;${replyListCount[recentReviews[0].boardId]}
											Comments</a>
									</div>
								</div>
								<h3 class="font-normal">${recentReviews[0].title}</h3>
								<p class="m-b-0 m-t-10">${fn:substring(recentReviews[0].content, 0, 10)}</p>
								<button
									class="btn btn-success btn-rounded waves-effect waves-light m-t-20"
									onclick="location.href='readArticle?boardId=${recentReviews[0].boardId}'">Read
									more</button>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${not empty recentReviews[1]}">
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.4s">
						<div class="card">
							<img class="card-img-top img-responsive"
								src="resources/assets/images/big/img5.jpg" alt="Card image cap">
							<div class="card-body">
								<div class="d-flex no-block align-items-center m-b-15">
									<span><i class="ti-calendar"></i>&nbsp;&nbsp;${recentReviews[1].updatedDate}</span>
									<div class="ml-auto">
										<a href="readArticle?boardId=${recentReviews[1].boardId}" class="link"><i
											class="ti-comments"></i>&nbsp;&nbsp;${replyListCount[recentReviews[1].boardId]}
											Comments</a>
									</div>
								</div>
								<h3 class="font-normal">${recentReviews[1].title}</h3>
								<p class="m-b-0 m-t-10">${fn:substring(recentReviews[1].content, 0, 10)}</p>
								<button
									class="btn btn-success btn-rounded waves-effect waves-light m-t-20"
									onclick="location.href='readArticle?boardId=${recentReviews[1].boardId}'">Read
									more</button>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${not empty recentReviews[2]}">
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.6s">
						<div class="card">
							<img class="card-img-top img-responsive"
								src="resources/assets/images/big/img6.jpg" alt="Card image cap">
							<div class="card-body">
								<div class="d-flex no-block align-items-center m-b-15">
									<span><i class="ti-calendar"></i>&nbsp;&nbsp;${recentReviews[2].updatedDate}</span>
									<div class="ml-auto">
										<a href="readArticle?boardId=${recentReviews[2].boardId}" class="link"><i
											class="ti-comments"></i>&nbsp;&nbsp;${replyListCount[recentReviews[2].boardId]}
											Comments</a>
									</div>
								</div>
								<h3 class="font-normal">${recentReviews[2].title}</h3>
								<p class="m-b-0 m-t-10">${fn:substring(recentReviews[2].content, 0, 10)}</p>
								<button
									class="btn btn-success btn-rounded waves-effect waves-light m-t-20"
									onclick="location.href='readArticle?boardId=${recentReviews[2].boardId}'">Read
									more</button>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${not empty recentReviews[3]}">
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.2s">
						<div class="card">
							<img class="card-img-top img-responsive"
								src="resources/assets/images/big/img3.jpg" alt="Card image cap">
							<div class="card-body">
								<div class="d-flex no-block align-items-center m-b-15">
									<span><i class="ti-calendar"></i>&nbsp;&nbsp;${recentReviews[3].updatedDate}</span>
									<div class="ml-auto">
										<a href="readArticle?boardId=${recentReviews[3].boardId}" class="link"><i
											class="ti-comments"></i>&nbsp;&nbsp;${replyListCount[recentReviews[3].boardId]}
											Comments</a>
									</div>
								</div>
								<h3 class="font-normal">${recentReviews[3].title}</h3>
								<p class="m-b-0 m-t-10">${fn:substring(recentReviews[3].content, 0, 10)}</p>
								<button
									class="btn btn-success btn-rounded waves-effect waves-light m-t-20"
									onclick="location.href='readArticle?boardId=${recentReviews[3].boardId}'">Read
									more</button>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${not empty recentReviews[4]}">
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.4s">
						<div class="card">
							<img class="card-img-top img-responsive"
								src="resources/assets/images/big/img2.jpg" alt="Card image cap">
							<div class="card-body">
								<div class="d-flex no-block align-items-center m-b-15">
									<span><i class="ti-calendar"></i>&nbsp;&nbsp;${recentReviews[4].updatedDate}</span>
									<div class="ml-auto">
										<a href="readArticle?boardId=${recentReviews[4].boardId}" class="link"><i
											class="ti-comments"></i>&nbsp;&nbsp;${replyListCount[recentReviews[4].boardId]}
											Comments</a>
									</div>
								</div>
								<h3 class="font-normal">${recentReviews[4].title}</h3>
								<p class="m-b-0 m-t-10">${fn:substring(recentReviews[4].content, 0, 10)}</p>
								<button
									class="btn btn-success btn-rounded waves-effect waves-light m-t-20"
									onclick="location.href='readArticle?boardId=${recentReviews[0].boardId}'">Read
									more</button>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${not empty recentReviews[5]}">
					<div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.6s">
						<div class="card">
							<img class="card-img-top img-responsive"
								src="resources/assets/images/big/img1.jpg" alt="Card image cap">
							<div class="card-body">
								<div class="d-flex no-block align-items-center m-b-15">
									<span><i class="ti-calendar"></i>&nbsp;&nbsp;${recentReviews[5].updatedDate}</span>
									<div class="ml-auto">
										<a href="readArticle?boardId=${recentReviews[5].boardId}" class="link"><i
											class="ti-comments"></i>&nbsp;&nbsp;${replyListCount[recentReviews[5].boardId]}
											Comments</a>
									</div>
								</div>
								<h3 class="font-normal">${recentReviews[5].title}</h3>
								<p class="m-b-0 m-t-10">${fn:substring(recentReviews[5].content, 0, 10)}</p>
								<button
									class="btn btn-success btn-rounded waves-effect waves-light m-t-20"
									onclick="location.href='readArticle?boardId=${recentReviews[5].boardId}'">Read
									more</button>
							</div>
						</div>
					</div>
				</c:if>
			</div>
			<!-- row -->

		</div>
	</section>
	<!-- #services -->

	<!--==========================
    Call To Action Section
    ============================-->
	<section id="call-to-action">
		<div class="container wow fadeIn">
			<div class="row">
				<div class="col-lg-9 text-center text-lg-left">
					<h3 class="cta-title">Free Register</h3>
					<p class="cta-text">무료 회원등록을 통해 전체 서비스를 이용 수 있습니다. 지금 간단하게 등록하세요.</p>
				</div>
				<div class="col-lg-3 cta-btn-container text-center">
					<a class="cta-btn align-middle" href="signup">Go</a>
				</div>
			</div>

		</div>
	</section>
	<!-- #call-to-action -->
	
	
	
	<!-- ============================================================== -->
	<!-- Container fluid  -->
	<!-- ============================================================== -->
	
	<!-- ============================================================== -->
	<!-- footer -->
	<!-- ============================================================== -->
	<footer id="footer">
		<div class="footer-top">
			<div class="container"></div>
		</div>

		<div class="container">
			<div class="copyright">
				&copy; Copyright <strong>SE WORLD</strong>.
			</div>

		</div>
	</footer>
	<!-- #footer -->

	<a href="#" class="back-to-top"><i class="fas fa-angle-double-up"></i></a>
	<!-- ============================================================== -->
	<!-- End footer -->
	<!-- ============================================================== -->
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
	<script
		src="resources/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js"></script>
	<script src="resources/assets/extra-libs/sparkline/sparkline.js"></script>
	<!--Wave Effects -->
	<script src="resources/dist/js/waves.js"></script>
	<!--Menu sidebar -->
	<script src="resources/dist/js/sidebarmenu.js"></script>
	<!--Custom JavaScript -->
	<script src="resources/dist/js/custom.min.js"></script>
	<!-- This Page JS -->
	<script
		src="resources/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.min.js"></script>
	<script
		src="resources/assets/extra-libs/jvector/jquery-jvectormap-world-mill-en.js"></script>
	<script
		src="resources/assets/extra-libs/jvector/jquery-jvectormap-in-mill.js"></script>
	<script
		src="resources/assets/extra-libs/jvector/jquery-jvectormap-us-aea-en.js"></script>
	<script
		src="resources/assets/extra-libs/jvector/jquery-jvectormap-uk-mill-en.js"></script>
	<script
		src="resources/assets/extra-libs/jvector/jquery-jvectormap-au-mill.js"></script>
	<script src="resources/assets/extra-libs/jvector/jvectormap.custom.js"></script>
	<!-- 메인용 javascript -->
	<script src="resources/regna/lib/jquery/jquery-migrate.min.js"></script>
	<script src="resources/regna/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="resources/regna/lib/easing/easing.min.js"></script>
	<script src="resources/regna/lib/wow/wow.min.js"></script>

	<script src="resources/regna/lib/waypoints/waypoints.min.js"></script>
	<script src="resources/regna/lib/counterup/counterup.min.js"></script>
	<script src="resources/regna/lib/superfish/hoverIntent.js"></script>
	<script src="resources/regna/lib/superfish/superfish.min.js"></script>
	<script src="resources/dist/typed.js"></script>
	<script src="resources/regna/js/main.js"></script>
	<script>
		jQuery(document)
				.ready(
						function($) {

							// Header fixed and Back to top button

							// Mobile Navigation
							if ($('#nav-menu-container').length) {
								var $mobile_nav = $('#nav-menu-container')
										.clone().prop({
											id : 'mobile-nav'
										});
								$mobile_nav.find('> ul').attr({
									'class' : '',
									'id' : ''
								});
								$('body').append($mobile_nav);
								$('body')
										.prepend(
												'<button type="button" id="mobile-nav-toggle"><i class="fa fa-bars"></i></button>');
								$('body').append(
										'<div id="mobile-body-overly"></div>');
								$('#mobile-nav')
										.find('.menu-has-children')
										.prepend(
												'<i class="fa fa-chevron-down"></i>');

								$(document)
										.on(
												'click',
												'.menu-has-children i',
												function(e) {
													$(this).next().toggleClass(
															'menu-item-active');
													$(this).nextAll('ul').eq(0)
															.slideToggle();
													$(this)
															.toggleClass(
																	"fa-chevron-up fa-chevron-down");
												});

								$(document)
										.on(
												'click',
												'#mobile-nav-toggle',
												function(e) {
													$('body')
															.toggleClass(
																	'mobile-nav-active');
													$('#mobile-nav-toggle i')
															.toggleClass(
																	'fa-times fa-bars');
													$('#mobile-body-overly')
															.toggle();
												});

								$(document)
										.click(
												function(e) {
													var container = $("#mobile-nav, #mobile-nav-toggle");
													if (!container.is(e.target)
															&& container
																	.has(e.target).length === 0) {
														if ($('body')
																.hasClass(
																		'mobile-nav-active')) {
															$('body')
																	.removeClass(
																			'mobile-nav-active');
															$(
																	'#mobile-nav-toggle i')
																	.toggleClass(
																			'fa-times fa-bars');
															$(
																	'#mobile-body-overly')
																	.fadeOut();
														}
													}
												});
							} else if ($("#mobile-nav, #mobile-nav-toggle").length) {
								$("#mobile-nav, #mobile-nav-toggle").hide();
							}
							// Smoth scroll on page hash links

							/*타자 쳐지는 효과 만들기 */
							var typed = $(".typed");

							$(function() {
								typed.typed({
									strings : [ " ARE GLOBALLY UNLIMITED.",
											"SHOW YOU TONS OF EXHIBITIONS.",
											"PROVIDE USER-FRIENDLY MAPS." ],
									typeSpeed : 100,
									loop : true,
								});
							});

						});
	</script>
	<!-- 구글맵 넣지 마세요 javascript -->
	
</body>

</html>