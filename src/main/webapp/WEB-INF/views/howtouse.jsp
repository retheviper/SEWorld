<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html dir="ltr">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="resources/assets/images/logo-icon.png">
<title>SE World - How to use</title>
<!-- Custom CSS -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<link href="resources/assets/libs/jsgrid/dist/jsgrid-theme.min.css"
	rel="stylesheet">
<link href="resources/assets/libs/jsgrid/dist/jsgrid.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">
\
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
</head>
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
</header>
<body>
	<div class="main-wrapper">
		<!-- ============================================================== -->
		<!-- Preloader - style you can find in spinners.css -->
		<!-- ============================================================== -->
		<div class="preloader">
			<div class="lds-ripple">
				<div class="lds-pos"></div>
				<div class="lds-pos"></div>
			</div>
		</div>
		<!-- ============================================================== -->
		<!-- Preloader - style you can find in spinners.css -->
		<!-- ============================================================== -->
		<section id="hero">
		<div class="hero-container"></div>
		</section>
		<section id="about">
		<div class="container" id="scroll">
			<div class="row about-container">

				<div class="col-lg-6 content order-lg-1 order-2">
					<h2 class="title">How to use</h2>
					<p>SE World는 다양한 전시회 관련 정보를 제공하고, 사용자들이 전시회에 관한 의견을 자유롭게 나눌 수 있는 공간을 목표로 하여 제작되었습니다.
					사이트 내의 모든 정보와 기능은 무료 회원가입을 통해 자유롭게 접근할 수 있습니다. 지금 등록하세요.</p>

					<div class="icon-box wow fadeInUp">
						<div class="icon">
							<i class="fa fa-shopping-bag"></i>
						</div>
						<h4 class="title">
							<a href="resources/regna/">Exhibition Info</a>
						</h4>
						<p class="description">최근까지 수집된 각종 전시회 정보를 게시판 형태로 제공하고 있습니다. 목록에서는 상세보기 메뉴를 통해 전시회에 관한 더욱 상세한 정보를 얻거나 나만의 즐겨찾기에 저장할 수 있고, 한줄평 기능을 통해 전시회를 평가할 수 있습니다. 지금 내가 관심을 가진 전시회에 누가 어떤 평을 남겼는지 알아보세요.</p>
					</div>

					<div class="icon-box wow fadeInUp" data-wow-delay="0.2s">
						<div class="icon">
							<i class="fa fa-photo"></i>
						</div>
						<h4 class="title">
							<a href="resources/regna/">User's Voice</a>
						</h4>
						<p class="description">유저 게시판에서는 특정 전시회를 주제로 리뷰를 남기거나 유저 상호간에 질답이 가능합니다. 또한 게시물을 남긴 유저를 친구로 추가하거나 게시물에 대한 평가를 별점으로 남길 수 있죠. 나와 같은 관심사를 가진 친구를 찾아볼까요?</p>
					</div>

					<div class="icon-box wow fadeInUp" data-wow-delay="0.4s">
						<div class="icon">
							<i class="fa fa-bar-chart"></i>
						</div>
						<h4 class="title">
							<a href="resources/regna/">User Menu</a>
						</h4>
						<p class="description">유저 메뉴에서는 내가 쓴 게시물이나 즐겨찾기에 추가한 전시회를 모아볼 수 있습니다. 캘린더를 통해 전시회 일정에 대한 정보를 기록할 수도 있죠. 관심이 가는 전시회가 언제부터였는지 캘린더에 추가해볼까요?</p>
					</div>

				</div>

				<div class="col-lg-6 background order-lg-2 order-1 wow fadeInRight">
					<video autoplay loop muted playsinline
						src="https://youtu.be/Db7M5tTv9b8"></video>
				</div>
			</div>

		</div>
		</section>


	</div>
	<!-- 여기까지 wrapper -->
	<!-- ============================================================== -->
	<!-- All Required js -->
	<!-- ============================================================== -->
	<script src="resources/assets/libs/jquery/dist/jquery.min.js"></script>
	<script src="resources/custom/autoScroll.js"></script>
	<!-- Bootstrap tether Core JavaScript -->
	<script src="resources/assets/libs/popper.js/dist/umd/popper.min.js"></script>
	<script src="resources/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- ============================================================== -->
	<!-- This page plugin js -->
	<!-- ============================================================== -->
	<script>
		$('[data-toggle="tooltip"]').tooltip();
		$(".preloader").fadeOut();
	</script>
</body>

</html>