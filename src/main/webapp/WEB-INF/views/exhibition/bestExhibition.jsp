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
<title>SE World - Best Exhibition</title>

<!-- Custom CSS -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">
<!-- 벡터맵 css지도 -->
<link
	href="resources/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.css"
	rel="stylesheet" />
<!-- Custom CSS 새로 -->
<link href="resources/dist/css/style.min.css" rel="stylesheet">
<link
	href="resources/assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.css"
	rel="stylesheet">
<!-- This Page CSS -->
<link rel="stylesheet" type="text/css"
	href="resources/assets/libs/select2/dist/css/select2.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<style>
.dropdown.dropdown-lg .dropdown-menu {
	margin-top: -1px;
	padding: 6px 20px;
}

.input-group-btn .btn-group {
	display: flex !important;
}

.btn-group .btn {
	border-radius: 0;
	margin-left: -1px;
}

.btn-group .btn:last-child {
	border-top-right-radius: 4px;
	border-bottom-right-radius: 4px;
}

.btn-group .form-horizontal .btn[type="submit"] {
	border-top-left-radius: 4px;
	border-bottom-left-radius: 4px;
}

.form-horizontal .form-group {
	margin-left: 0;
	margin-right: 0;
}

.form-group .form-control:last-child {
	border-top-left-radius: 4px;
	border-bottom-left-radius: 4px;
}

@media screen and (min-width: 768px) {
	#adv-search {
		width: 500px;
		margin: 0 auto;
	}
	.dropdown.dropdown-lg {
		position: static !important;
	}
	.dropdown.dropdown-lg .dropdown-menu {
		min-width: 500px;
	}
}
</style>
<script type="text/javascript"
	src="resources/exhibitionCountrySelect.js"></script>
</head>

<body>
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
	<!-- Main wrapper - style you can find in pages.scss -->
	<!-- ============================================================== -->
	<div id="main-wrapper">
		<!-- ============================================================== -->
		<!-- Topbar header - style you can find in pages.scss -->
		<!-- ============================================================== -->
		<header class="topbar">
			<nav class="navbar top-navbar navbar-expand-md navbar-dark">
				<div class="navbar-header">
					<!-- This is for the sidebar toggle which is visible on mobile only -->
					<a class="nav-toggler waves-effect waves-light d-block d-md-none"
						href="javascript:void(0)"><i class="ti-menu ti-close"></i></a>
					<!-- ============================================================== -->
					<!-- Logo -->
					<!-- ============================================================== -->
					<a class="navbar-brand" href="./"> <!-- Logo icon --> <b
						class="logo-icon"> <!--You can put here icon as well // <i class="wi wi-sunset"></i> //-->
							<!-- Dark Logo icon --> <img
							src="resources/assets/images/logo2.png"
							style="width: 60px; height: 50px; margin: auto;" alt="homepage"
							class="dark-logo" /> <!-- Light Logo icon --> <img
							src="resources/assets/images/logo2.png"
							style="width: 60px; height: 50px; margin: auto;" alt="homepage"
							class="light-logo" />
					</b>
					</a>
					<!-- ============================================================== -->
					<!-- End Logo -->
					<!-- ============================================================== -->
					<!-- ============================================================== -->
					<!-- Toggle which is visible on mobile only -->
					<!-- ============================================================== -->
					<a class="topbartoggler d-block d-md-none waves-effect waves-light"
						href="javascript:void(0)" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation"><i class="ti-more"></i></a>
				</div>
				<!-- ============================================================== -->
				<!-- End Logo -->
				<!-- ============================================================== -->
				<div class="navbar-collapse collapse" id="navbarSupportedContent">
					<!-- ============================================================== -->
					<!-- toggle and nav items -->
					<!-- ============================================================== -->
					<ul class="navbar-nav float-left mr-auto">
						<li class="nav-item d-none d-md-block"><a
							class="nav-link sidebartoggler waves-effect waves-light"
							href="javascript:void(0)" data-sidebartype="mini-sidebar"><i
								class="mdi mdi-menu font-24"></i></a></li>
						<!-- ============================================================== -->
						<!-- mega menu -->
						<!-- ============================================================== -->
						<li class="nav-item dropdown mega-dropdown"><a
							class="nav-link dropdown-toggle waves-effect waves-dark" href=""
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								<span class="d-none d-md-block">Personal Update<i
									class="fa fa-angle-down"></i></span> <span class="d-block d-md-none"><i
									class="mdi mdi-dialpad font-24"></i></span>
						</a>
							<div class="dropdown-menu animated bounceInDown">
								<div class="mega-dropdown-menu row">

									<div class="col-lg-3 m-b-30">
										<h4 class="m-b-20">최근 좋아요 한 전시회</h4>
										<!-- Accordian -->
										<div id="accordion">
											<div class="card m-b-5">
												<div class="card-header" id="headingOne">
													<h5 class="mb-0">
														<button class="btn btn-link" data-toggle="collapse"
															data-target="#collapseOne" aria-expanded="true"
															aria-controls="collapseOne">첫번째 전시회 제목</button>
													</h5>
												</div>
												<div id="collapseOne" class="collapse show"
													aria-labelledby="headingOne" data-parent="#accordion">
													<div class="card-body">전시회 내용</div>
												</div>
											</div>
											<div class="card m-b-5">
												<div class="card-header" id="headingTwo">
													<h5 class="mb-0">
														<button class="btn btn-link collapsed"
															data-toggle="collapse" data-target="#collapseTwo"
															aria-expanded="false" aria-controls="collapseTwo">
															두번째 전시회제목</button>
													</h5>
												</div>
												<div id="collapseTwo" class="collapse"
													aria-labelledby="headingTwo" data-parent="#accordion">
													<div class="card-body">전시회 내용</div>
												</div>
											</div>
											<div class="card m-b-5">
												<div class="card-header" id="headingThree">
													<h5 class="mb-0">
														<button class="btn btn-link collapsed"
															data-toggle="collapse" data-target="#collapseThree"
															aria-expanded="false" aria-controls="collapseThree">
															C세번째 전시회 내용</button>
													</h5>
												</div>
												<div id="collapseThree" class="collapse"
													aria-labelledby="headingThree" data-parent="#accordion">
													<div class="card-body">세번째 전시회 내용</div>
												</div>
											</div>
										</div>
									</div>

									<div class="col-lg-3  m-b-30">
										<h4 class="m-b-20">Recent Comments</h4>
										<!-- Contact -->
										<div class="d-flex flex-row comment-row m-t-0">
											<div class="p-2">
												<img src="resources/assets/images/users/people.png"
													alt="user" width="50" class="rounded-circle">
											</div>
											<div class="comment-text w-100">
												<h6 class="font-medium">James Anderson</h6>
												<span class="m-b-15 d-block">좋은 후기 잘 읽었습니다^^ </span>
												<div class="comment-footer">
													<span class="text-muted float-right">April 14, 2016</span>

												</div>
											</div>
										</div>



										<!-- Contact -->
									</div>
									<div class="col-lg-3 col-xlg-4 m-b-30">
										<h4 class="m-b-20">My Schedule</h4>
										<!-- List style -->
										<ul class="list-style-none">
											<li><a href="javascript:void(0)"><i
													class="fa fa-check text-success"></i> 스케쥴1</a></li>
											<li><a href="javascript:void(0)"><i
													class="fa fa-check text-success"></i> 스케쥴2</a></li>
											<li><a href="javascript:void(0)"><i
													class="fa fa-check text-success"></i> 스케쥴3</a></li>
											<li><a href="javascript:void(0)"><i
													class="fa fa-check text-success"></i> 스케쥴4</a></li>
											<li><a href="javascript:void(0)"><i
													class="fa fa-check text-success"></i> 스케쥴5</a></li>
											<li><a href="#"
												class="btn btn-sm btn-success btn-rounded">My Calendar</a></li>
										</ul>
									</div>
								</div>
							</div></li>
						<!-- ============================================================== -->
						<!-- End mega menu -->
						<!-- ============================================================== -->
						<!-- show map -->
						<!-- ============================================================== -->


					</ul>
					<!-- ============================================================== -->
					<!-- Right side toggle and nav items -->
					<!-- ============================================================== -->
					<ul class="navbar-nav float-right">
						<!-- create new -->


						<!-- ============================================================== -->
						<!-- Messages -->
						<!-- ============================================================== -->
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle waves-effect waves-dark" href=""
							id="2" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i
								class="font-24 mdi mdi-comment-processing"></i>

						</a>
							<div
								class="dropdown-menu dropdown-menu-right mailbox animated bounceInDown"
								aria-labelledby="2">
								<span class="with-arrow"><span class="bg-white"></span></span>
								<ul class="list-style-none">
									<li>
										<div class="drop-title text-black bg-#f7b2c5">
											<h4 class="m-b-0 m-t-5">2 New</h4>
											<span class="font-light">Messages</span>
										</div>
									</li>
									<li>
										<div class="message-center message-body" style="height: 100%;">
											<!-- Message -->
											<a href="javascript:void(0)" class="message-item"> <span
												class="user-img"><i class="fas fa-user"></i> </span>
												<div class="mail-contnet">
													<h5 class="message-title">heemin</h5>
													<span class="mail-desc">안녕하세요 전시회 정보 문으드립니다.</span> <span
														class="time">9:30 AM</span>
												</div>
											</a>
											<!-- Message -->
											<a href="javascript:void(0)" class="message-item"> <span
												class="user-img"><i class="fas fa-user"></i> </span>
												<div class="mail-contnet">
													<h5 class="message-title">happy</h5>
													<span class="mail-desc">what sup </span><span class="time">9:10
														AM</span>
												</div>
											</a>


										</div>
									</li>
									<li><a class="nav-link text-center link"
										href="javascript:void(0);"> <b>모든 메세지 보기</b> <i
											class="fa fa-angle-right"></i>
									</a></li>
								</ul>
							</div></li>

						<!-- end+++++================== -->

						<!-- ============================================================== -->
						<!-- User profile and search -->
						<!-- ============================================================== -->
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle text-muted waves-effect waves-dark pro-pic"
							href="" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <img
								src="resources/assets/images/users/user.png" alt="user"
								class="rounded-circle" width="31">

						</a>
							<div
								class="dropdown-menu dropdown-menu-right user-dd animated bounceInDown"
								style="background-color: #f7d6b7;">
								<span class="with-arrow"><span class="bg-primary"></span></span>
								<div
									class="d-flex no-block align-items-center p-15 bg-primary text-white m-b-10">
									<div class="">

										<!-- 아이콘 유저 -->
										<i class="fas fa-user" width="60"></i>


									</div>
									<div class="m-l-10">
										<h4 class="m-b-0">유저네임</h4>
										<p class=" m-b-0">유저 이메일</p>
									</div>
								</div>
								<a class="dropdown-item" href="javascript:void(0)"><i
									class="ti-user m-r-5 m-l-5"></i> My Profile</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="javascript:void(0)"><i
									class="ti-calendar m-r-5 m-l-5"></i> My Calendar </a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="javascript:void(0)"><i
									class="ti-settings m-r-5 m-l-5"></i> Account Setting</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="javascript:void(0)"><i
									class="fa fa-power-off m-r-5 m-l-5"></i> Logout</a>

							</div></li>
						<!-- ============================================================== -->
						<!-- User profile and search -->
						<!-- ============================================================== -->
					</ul>
				</div>
			</nav>
		</header>
		<!-- ============================================================== -->
		<!-- End Topbar header -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<aside class="left-sidebar">
			<!-- Sidebar scroll-->
			<div class="scroll-sidebar">
				<!-- Sidebar navigation-->
				<nav class="sidebar-nav">
					<ul id="sidebarnav">
						<!-- User Profile-->
						<li>
							<!-- User Profile-->
							<div class="user-profile d-flex no-block dropdown m-t-20">
								<div class="user-pic">
									<img src="resources/assets/images/users/user.png" alt="users"
										class="rounded-circle" width="40" />
								</div>
								<div class="user-content hide-menu m-l-10">
									<a href="javascript:void(0)" class="" id="Userdd" role="button"
										data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false">
										<h5 class="m-b-0 user-name font-medium">
											유저네임 님 <i class="fa fa-angle-down"></i>
										</h5> <span class="op-5 user-email">유저 이메일</span>
									</a>
									<div class="dropdown-menu dropdown-menu-right"
										aria-labelledby="Userdd">
										<a class="dropdown-item" href="javascript:void(0)"><i
											class="ti-user m-r-5 m-l-5"></i> My Profile</a>
										<div class="dropdown-divider"></div>

										<a class="dropdown-item" href="javascript:void(0)"><i
											class="ti-calendar m-r-5 m-l-5"></i> My Calendar</a>
										<div class="dropdown-divider"></div>
										<a class="dropdown-item" href="javascript:void(0)"><i
											class="ti-settings m-r-5 m-l-5"></i> Account Setting</a>
										<div class="dropdown-divider"></div>
										<a class="dropdown-item" href="javascript:void(0)"><i
											class="fa fa-power-off m-r-5 m-l-5"></i> Logout</a>
									</div>
								</div>
							</div> <!-- End User Profile-->
						</li>
						<!-- User Profile-->
						<li class="sidebar-item"><a
							class="sidebar-link has-arrow waves-effect waves-dark"
							href="javascript:void(0)" aria-expanded="false"><i
								class="mdi mdi-view-dashboard"></i><span class="hide-menu">Exhibition
							</span></a>
							<ul aria-expanded="false" class="collapse  first-level">
								<li class="sidebar-item"><a href="exhibitionList"
									class="sidebar-link"><i class="mdi mdi-adjust"></i><span
										class="hide-menu"> List </span></a></li>
								<li class="sidebar-item"><a href="vector"
									class="sidebar-link"><i class="mdi mdi-adjust"></i><span
										class="hide-menu"> vectorMap </span></a></li>
								<li class="sidebar-item"><a href="bestList"
									class="sidebar-link"><i class="mdi mdi-adjust"></i><span
										class="hide-menu"> Best Exhb </span></a></li>
								<li class="sidebar-item"><a href="attendForm"
									class="sidebar-link"><i class="mdi mdi-adjust"></i><span
										class="hide-menu"> Attend </span></a></li>

							</ul></li>
						<li class="sidebar-item"><a
							class="sidebar-link has-arrow waves-effect waves-dark"
							href="javascript:void(0)" aria-expanded="false"><i
								class="mdi mdi-tune-vertical"></i><span class="hide-menu">Review,Q&A
							</span></a>
							<ul aria-expanded="false" class="collapse  first-level">
								<li class="sidebar-item"><a href="reviews"
									class="sidebar-link"><i class="mdi mdi-view-quilt"></i><span
										class="hide-menu"> User Review </span></a></li>
								<li class="sidebar-item"><a href="questions"
									class="sidebar-link"><i class="mdi mdi-view-parallel"></i><span
										class="hide-menu"> Question </span></a></li>
								<li class="sidebar-item"><a href="writeArticle"
									class="sidebar-link"><i class="mdi mdi-view-day"></i><span
										class="hide-menu"> WriteForm </span></a></li>
							</ul></li>
						<li class="sidebar-item"><a
							class="sidebar-link has-arrow waves-effect waves-dark"
							href="javascript:void(0)" aria-expanded="false"><i
								class="mdi mdi-content-copy"></i><span class="hide-menu">User
									Board</span></a>
							<ul aria-expanded="false" class="collapse  first-level">
								<li class="sidebar-item"><a href="#" class="sidebar-link"><i
										class="mdi mdi-format-align-left"></i><span class="hide-menu">
											My Exhibition</span></a></li>
								<li class="sidebar-item"><a href="#" class="sidebar-link"><i
										class="mdi mdi-format-align-right"></i><span class="hide-menu">
											Calendar </span></a></li>
							</ul></li>

					</ul>
				</nav>
				<!-- End Sidebar navigation -->
			</div>
			<!-- End Sidebar scroll-->
		</aside>
		<!-- ============================================================== -->
		<!-- End Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page wrapper  -->
		<!-- ============================================================== -->
		<div class="page-wrapper">
			<!-- ============================================================== -->
			<!-- Bread crumb and right sidebar toggle -->
			<!-- ============================================================== -->
			<div class="page-breadcrumb">
				<div class="row">
					<div class="col-5 align-self-center">
						<h4 class="page-title">Exhibitions</h4>
						<div class="d-flex align-items-center">
							<nav aria-label="breadcrumb">
								<ol class="breadcrumb">
									<li class="breadcrumb-item"><a href="#">Home</a></li>
									<li class="breadcrumb-item active" aria-current="page">Exhibitions</li>
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


			<!-- ============================================================== -->
			<!-- End PAge Content -->
			<!-- ============================================================== -->
			<!-- 다시 만든테이블 -->
			<div class="container-fluid">
				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-body">
								<p>
								<div class="table-responsive">
									<table id="alt_pagination"
										class="table table-striped table-bordered display"
										style="width: 100%">
										<thead>
											<tr>
												<th>영어이름</th>
												<th>한국제목</th>
												<th>도시</th>
												<th>시작일</th>
												<th>종료일</th>
											</tr>
										</thead>
										<tbody>
										</tbody>
										<tfoot>
											<tr>
												<th>영어이름</th>
												<th>한국제목</th>
												<th>도시</th>
												<th>Start date</th>
												<th>End Date</th>
											</tr>
										</tfoot>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 다시 만든테이블 -->

	</div>
	<!-- page wrapper -->

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
	<footer class="footer text-center"> SCIT Poject </footer>
	<!-- ============================================================== -->
	<!-- End footer -->
	<!-- ============================================================== -->
	</div>
	<!-- ============================================================== -->
	<!-- End Page wrapper  -->
	<!-- ============================================================== -->
	</div>
	<!-- ============================================================== -->
	<!-- End Wrapper -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- customizer Panel -->
	<!-- ============================================================== -->
	<a class="nav-link dropdown-toggle waves-effect waves-dark" href=""
		data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">

	</a>
	</aside>

	<div class="chat-windows"></div>
	<!-- ============================================================== -->
	<!-- All Jquery -->
	<!-- ============================================================== -->
	<script>
		// Basic grid
	</script>
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
	<!--This page JavaScript -->
	<script src="resources/assets/extra-libs/DataTables/datatables.min.js"></script>
	<script src="resources/dist/js/pages/datatable/datatable-basic.init.js"></script>
	<!-- This Page JS -->
	<!-- This Page JS -->
	<script src="resources/assets/libs/select2/dist/js/select2.full.min.js"></script>
	<script src="resources/assets/libs/select2/dist/js/select2.min.js"></script>
	<script src="resources/dist/js/pages/forms/select2/select2.init.js"></script>
</body>

</html>