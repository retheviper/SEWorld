<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<link rel="icon" type="image/png" sizes="any" href="resources/assets/images/logo2.png">
<title>SE World - User Profile</title>
<link href="resources/assets/libs/jsgrid/dist/jsgrid-theme.min.css" rel="stylesheet">
<link href="resources/assets/libs/jsgrid/dist/jsgrid.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">
<!-- 벡터맵 css지도 -->
<link href="resources/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.css" rel="stylesheet" />
<!-- Custom CSS 새로 -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">
<!-- 메인 스타일 -->
<!-- Google Fonts -->
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
<!-- Bootstrap CSS File -->
<link href="resources/regna/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Libraries CSS Files -->
<link href="resources/regna/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/regna/lib/animate/animate.min.css" rel="stylesheet">
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
  background: url(resources/assets/images/owl.jpg) top center;
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
  <!-- #header -->

  <!--==========================
    Hero Section
  ============================-->

  <section id="hero">
    <div class="hero-container"
      style="height: 92px; color: #c9b680; padding: 30px;"></div>
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
  <div class="newpage" style="background-color: #f7edd4" id="scroll">
    <!-- ============================================================== -->
    <!-- Bread crumb and right sidebar toggle -->
    <!-- ============================================================== -->
    <div class="page-breadcrumb">
      <div class="row">
        <div class="col-5 align-self-center">
        <h3 class="title">&nbsp;</h3>
          <h4 class="page-title">Profile</h4>
          <div class="d-flex align-items-center">
            <nav aria-label="breadcrumb">
              <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="#">Home</a></li>
                <li class="breadcrumb-item active" aria-current="page">Profile</li>
              </ol>
            </nav>
          </div>
        </div>
      </div>
    </div>

    <!-- 컨테이너 플루이드 -->
    <div class="container-fluid">
      <!-- ============================================================== -->
      <!-- Start Page Content -->
      <!-- ============================================================== -->
      <!-- Row -->
      <div class="row">
        <!-- Column -->
        <div class="col-lg-4 col-xlg-3 col-md-5">
          <div class="card">
            <div class="card-body">
              <div class="m-t-30" style="text-align:center">
                <img src="resources/assets/images/users/5.jpg" class="rounded-circle" width="150" />
                <h4 class="card-title m-t-10">${member.memberName}</h4>
                <h6 id="memberId" class="card-subtitle">${member.memberId}</h6>
                <input id="loginId" type="hidden" value="${sessionScope.loginId}">
                <div id="followshipCount" class="row text-center justify-content-md-center"></div>
                <c:if test="${sessionScope.loginId ne member.memberId}">
                  <div id="followshipButton"></div>
                </c:if>
              </div>
            </div>
            <div>
              <hr>
            </div>
            
            <!-- <div class="card-body"> <small class="text-muted">Email address </small>
              <h6>scit@gmail.com</h6> <small class="text-muted p-t-30 db">Phone</small>
              <h6>+91 654 784 547</h6> <small class="text-muted p-t-30 db">Address</small>
              <h6>서울시 삼성동 coex</h6>
              <small class="text-muted p-t-30 db">Social Profile</small>
              <br/>
              <button class="btn btn-circle btn-secondary"><i class="fab fa-facebook-f"></i></button>
              <button class="btn btn-circle btn-secondary"><i class="fab fa-twitter"></i></button>
              <button class="btn btn-circle btn-secondary"><i class="fab fa-youtube"></i></button>
            </div> -->
            
            <div class="row text-center justify-content-md-center">
              <div class="col-4">
                <a href="p?mid=${member.memberId}&ptype=w" class="link">
                  <i class="icon-heart"></i>
                  <font class="font-medium">가고싶어요 ${memberDetail.wishingCount}</font>
                </a>
              </div>
              <div class="col-4">
                <a href="p?mid=${member.memberId}&ptype=c" class="link">
                  <i class="icon-pencil"></i>
                  <font class="font-medium">코멘트 ${memberDetail.commentCount}</font>
                </a>
              </div>
              <div class="col-4">
                <a href="p?mid=${member.memberId}&ptype=r" class="link">
                  <i class="icon-book-open"></i>
                  <font class="font-medium">리뷰 ${memberDetail.reviewCount}</font>
                </a>
              </div>
            </div>
          </div>
        </div>
        <!-- Column -->
        <!-- Column -->
        <div class="col-lg-8 col-xlg-9 col-md-7">
          <div class="card">
            <!-- Tabs -->
            <ul class="nav nav-pills custom-pills" id="pills-tab" role="tablist">
              <li class="nav-item">
                <a class="nav-link active" id="pills-timeline-tab" data-toggle="pill" href="#current-month" role="tab" aria-controls="pills-timeline" aria-selected="true">Timeline</a>
              </li>
            </ul>
            <!-- Tabs -->
            <div class="tab-content" id="pills-tabContent">
              <div class="tab-pane fade show active" id="current-month" role="tabpanel" aria-labelledby="pills-timeline-tab">
                <div class="card-body">
                  <div class="profiletimeline m-t-0">
                    <!-- <div class="sl-item">
                      <div class="sl-left"> <img src="resources/assets/images/users/1.jpg" alt="user" class="rounded-circle" /> </div>
                      <div class="sl-right">
                        <div><a href="javascript:void(0)" class="link">하하호호히히후</a> <span class="sl-date">2018/09/02</span>
                          <p>new activity : <a href="javascript:void(0)"> Uploaded new article</a></p>
                          <div class="row">
                            <div class="col-lg-3 col-md-6 m-b-20"><img src="resources/assets/images/big/img1.jpg" class="img-fluid rounded" /></div>
                            <div class="col-md-9 col-xs-12">
                              <p> 글 내용 글내용 </p> </div>
                            </div>
                          <div class="like-comm"> <a href="javascript:void(0)" class="link m-r-10">2 comment</a> <a href="javascript:void(0)" class="link m-r-10"><i class="fa fa-heart text-danger"></i> 4 likes</a> </div>
                        </div>
                      </div>
                    </div>
                    <hr> -->

                    <!-- Wishing -->
                    <c:if test="${not empty timelineList}">
                      <c:forEach var="timeline" items="${timelineList}">
                        <div class="sl-item">
                          <div class="sl-left">
                            <img src="resources/assets/images/users/1.jpg" alt="user" class="rounded-circle" />
                          </div>
                          <div class="sl-right">
                            <c:if test="${timeline.wishingCreatedDate != null}">
                              <div>
                                <a href="javascript:void(0)" class="link">Wishing </a>
                                <span class="sl-date">${timeline.wishingCreatedDate}</span>
                                <div class="row">
                                  <div class="col-lg-3 col-md-6 m-b-20">
                                    <img src="resources/assets/images/big/img1.jpg" class="img-fluid rounded" />
                                  </div>
                                  <div class="col-md-9 col-xs-12">
                                    <table border="1">
                                      <tr>
                                        <td>전시회명</td>
                                        <td>${timeline.exhibitionTitleKor}</td>
                                      </tr>
                                      <tr>
                                        <td>개최기간</td>
                                        <td>${timeline.openingTerm}</td>
                                      </tr>
                                      <tr>
                                        <td>개최국가</td>
                                        <td>${timeline.openingCountry}</td>
                                      </tr>
                                      <tr>
                                        <td>개최도시</td>
                                        <td>${timeline.openingCity}</td>
                                      </tr>
                                    </table>
                                  </div>
                                </div>
                                <div class="like-comm">
                                  <a href="javascript:void(0)" class="link m-r-10">
                                    <i class="fa fa-heart text-danger"></i> Likes
                                  </a>
                                </div>
                              </div>
                            </c:if>

                            <!-- Comment -->
                            <c:if test="${timeline.commentCreatedDate != null}">
                              <div>
                                <a href="javascript:void(0)" class="link">Comment</a>
                                <span class="sl-date">${timeline.commentCreatedDate}</span>
                                <div class="row">
                                  <div class="col-lg-3 col-md-6 m-b-20">
                                    <img src="resources/assets/images/big/img1.jpg" class="img-fluid rounded" />
                                  </div>
                                  <div class="col-md-9 col-xs-12">
                                    <table border="1">
                                      <tr>
                                        <td>전시회명</td>
                                        <td>${timeline.exhibitionTitleKor}</td>
                                      </tr>
                                      <tr>
                                        <td>개최기간</td>
                                        <td>${timeline.openingTerm}</td>
                                      </tr>
                                      <tr>
                                        <td>개최국가</td>
                                        <td>${timeline.openingCountry}</td>
                                      </tr>
                                      <tr>
                                        <td>개최도시</td>
                                        <td>${timeline.openingCity}</td>
                                      </tr>
                                    </table>
                                  </div>
                                </div>
                                <div class="like-comm">별점: ${timeline.commentRating}점</div>
                                <div class="like-comm">코멘트: ${timeline.commentContent}</div>
                              </div>
                            </c:if>

                            <!-- Review -->
                            <c:if test="${timeline.boardCreatedDate != null}">
                              <div>
                                <a href="javascript:void(0)" class="link">Review </a>
                                <span class="sl-date">${timeline.boardCreatedDate}</span>
                                <div class="row">
                                  <div class="col-lg-3 col-md-6 m-b-20">
                                    <img src="resources/assets/images/big/img1.jpg" class="img-fluid rounded" />
                                  </div>
                                  <div class="col-md-9 col-xs-12">
                                    <table border="1">
                                      <tr>
                                        <td>전시회명</td>
                                        <td>${timeline.exhibitionTitleKor}</td>
                                      </tr>
                                      <tr>
                                        <td>개최기간</td>
                                        <td>${timeline.openingTerm}</td>
                                      </tr>
                                      <tr>
                                        <td>개최국가</td>
                                        <td>${timeline.openingCountry}</td>
                                      </tr>
                                      <tr>
                                        <td>개최도시</td>
                                        <td>${timeline.openingCity}</td>
                                      </tr>
                                    </table>
                                  </div>
                                </div>
                                <div class="like-comm">제목: ${timeline.boardTitle}</div>
                                <div class="like-comm">내용: ${timeline.boardContent}</div>
                              </div>
                            </c:if>
                          </div>
                          <hr>
                        </div>
                      </c:forEach>
                    </c:if>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- Column -->
         <h3 class="title">&nbsp;</h3>
      </div>
      <!-- Row -->
    </div>
    <!-- 컨테이너 플루이드 -->
  </div>
  <!-- page wrapper -->

  <!-- ============================================================== -->
  <!-- Page wrapper  -->
  <!-- ============================================================== -->

  <!-- ============================================================== -->
  <!-- Bread crumb and right sidebar toggle -->
  <!-- ============================================================== -->

  <!-- ============================================================== -->
  <!-- End Bread crumb and right sidebar toggle -->
  <!-- ============================================================== -->
  <!-- ============================================================== -->
  <!-- Container fluid  -->
  <!-- ============================================================== -->

  <!-- ============================================================== -->
  <!-- ============================================================== -->
  <!-- End Container fluid  -->
  <!-- ============================================================== -->
  <!-- 페이지 레퍼 div있던 자리 -->
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
  <script src="resources/custom/autoScroll.js"></script>
  <script>
    jQuery(document).ready(function($) {
      // Header fixed and Back to top button
      // Mobile Navigation
      if ($('#nav-menu-container').length) {
        var $mobile_nav = $('#nav-menu-container').clone().prop({
          id : 'mobile-nav'
        });
        $mobile_nav.find('> ul').attr({
          'class' : '',
          'id' : ''
        });
        $('body').append($mobile_nav);
        $('body').prepend('<button type="button" id="mobile-nav-toggle"><i class="fa fa-bars"></i></button>');
        $('body').append('<div id="mobile-body-overly"></div>');
        $('#mobile-nav').find('.menu-has-children').prepend('<i class="fa fa-chevron-down"></i>');
        $(document).on('click', '.menu-has-children i', function(e) {
          $(this).next().toggleClass('menu-item-active');
          $(this).nextAll('ul').eq(0).slideToggle();
          $(this).toggleClass("fa-chevron-up fa-chevron-down");
        });
        $(document).on('click', '#mobile-nav-toggle', function(e) {
          $('body').toggleClass('mobile-nav-active');
          $('#mobile-nav-toggle i').toggleClass('fa-times fa-bars');
          $('#mobile-body-overly').toggle();
        });
        $(document).click(function(e) {
          var container = $("#mobile-nav, #mobile-nav-toggle");
          if (!container.is(e.target) && container.has(e.target).length === 0) {
            if ($('body').hasClass('mobile-nav-active')) {
              $('body').removeClass('mobile-nav-active');
              $('#mobile-nav-toggle i').toggleClass('fa-times fa-bars');
              $('#mobile-body-overly').fadeOut();
            }
          }
        });
      } else if (
        $("#mobile-nav, #mobile-nav-toggle").length) {
          $("#mobile-nav, #mobile-nav-toggle").hide();
        }
        // Smoth scroll on page hash links
        initFollowship();
    });

    /* followship*/
    function initFollowship() {
      initFollowshipCount();
      initFollowshipButton();
    }
    function initFollowshipCount() {
      var memberId = $('#memberId').html();
      $.ajax({
        method : 'POST',
        url : 'getFollowshipCount',
        data : 'mid=' + memberId,
        success : printFollowshipCount
      });
    }
    function printFollowshipCount(resp) {
      var result = '';
      result += '<div class="col-4"><a href="javascript:void(0)" class="link"><i class="icon-people"></i> <font class="font-medium">팔로워 '
          + resp.followerCount + '</font></a></div>';
      result += '<div class="col-4"><a href="javascript:void(0)" class="link"><i class="icon-people"></i> <font class="font-medium">팔로잉 '
          + resp.followingCount + '</font></a></div>';
      $('#followshipCount').html(result);
    }
    function initFollowshipButton() {
      var memberId = $('#memberId').html();
      $.ajax({
        method : 'POST',
        url : 'getFollowshipButton',
        data : 'mid=' + memberId,
        success : printFollowshipButton
      });
    }
    function printFollowshipButton(resp) {
      var loginId = $('#loginId').val();
      var memberId = $('#memberId').html();
      var result = '';
      if (resp.createdDate == null && loginId != memberId) {
        result += '<button id="follow" type="button"><i class="fa fa-plus-square-o"></i><font class="font-medium">follow</font></button>';
      } else if (resp.createdDate != null && loginId != memberId) {
        result += '<button id="unfollow" type="button"><i class="fa fa-minus-square-o"></i><font class="font-medium">unfollow</font></button>';
      }
      $('#followshipButton').html(result);
      $('#follow').on('click', insertFollowship);
      $('#unfollow').on('click', deleteFollowship);
    }
    function insertFollowship() {
      var memberId = $('#memberId').html();
      $.ajax({
        method : 'POST',
        url : 'follow',
        data : 'mid=' + memberId,
        success : initFollowship
      });
    }
    function deleteFollowship() {
      var memberId = $('#memberId').html();
      $.ajax({
        method : 'POST',
        url : 'unfollow',
        data : 'mid=' + memberId,
        success : initFollowship
      });
    }
  </script>
</body>
</html>