<%@page import="Dao.WishListDao"%>
<%@page import="Dao.ProductDao"%>
<%@page import="Model.Product"%>
<%@page import="Model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--A Design by W3layouts
   Author: W3layout
   Author URL: http://w3layouts.com
   License: Creative Commons Attribution 3.0 Unported
   License URL: http://creativecommons.org/licenses/by/3.0/
   -->
<!DOCTYPE html>
<html lang="zxx">
<head>
<title>Khajina Shopping</title>
<!--meta tags -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords"
	content="Toys Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
         Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<!--//meta tags ends here-->
<!--booststrap-->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"
	media="all">
<!--//booststrap end-->
<!-- font-awesome icons -->
<link href="css/fontawesome-all.min.css" rel="stylesheet"
	type="text/css" media="all">
<!-- //font-awesome icons -->
<!--Shoping cart-->
<link rel="stylesheet" href="css/shop.css" type="text/css" />
<!--//Shoping cart-->
<link rel="stylesheet" type="text/css" href="css/jquery-ui1.css">
<link href="css/easy-responsive-tabs.css" rel='stylesheet'
	type='text/css' />
<link rel="stylesheet" href="css/flexslider.css" type="text/css"
	media="screen" />
<!--stylesheets-->
<link href="css/style.css" rel='stylesheet' type='text/css' media="all">
<!--//stylesheets-->
<link href="//fonts.googleapis.com/css?family=Sunflower:500,700"
	rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Open+Sans:400,600,700"
	rel="stylesheet">
</head>
<body>
	<%
	Customer c = null;
	if (session.getAttribute("data") != null) {
		c = (Customer) session.getAttribute("data");
	} else {
		response.sendRedirect("customer-login.jsp");
	}
	%>
	<!--headder-->
	<div class="header-outs" id="home">
		<div class="header-bar">
			<div class="info-top-grid">
				<div class="info-contact-agile">
					<ul>
						<li><span class="fas fa-phone-volume"></span>
							<p>+91 8200405262</p></li>
						<li><span class="fas fa-envelope"></span>
							<p>
								<a href="khajinastore723@gmail.com
                        ">khajinastore723@gmail.com</a>
							</p></li>
						<li></li>
					</ul>
				</div>
			</div>
			<div class="container-fluid">
				<div class="hedder-up row">
					<div class="col-lg-3 col-md-3 logo-head">
						<h1>
							<a class="navbar-brand" href="index.html">Khajina-Shopping</a>
						</h1>
					</div>
					<div class="col-lg-5 col-md-6 search-right">
						<form class="form-inline my-lg-0">
							<input class="form-control mr-sm-2" type="search"
								placeholder="Search">
							<button class="btn" type="submit">Search</button>
						</form>
					</div>
					<div class="col-lg-4 col-md-3 right-side-cart">
						<div class="cart-icons">
							<ul>
								<li><span class="far fa-heart"></span></li>
								<li>
									<button type="button" data-toggle="modal"
										data-target="#exampleModal">
										<span class="far fa-user"></span>
									</button>
								</li>
								<li class="toyscart toyscart2 cart cart box_1">
									<form action="#" method="post" class="last">
										<input type="hidden" name="cmd" value="_cart"> <input
											type="hidden" name="display" value="1">
										<button class="top_toys_cart" type="submit" name="submit"
											value="">
											<span class="fas fa-cart-arrow-down"></span>
										</button>
									</form>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<nav class="navbar navbar-expand-lg navbar-light">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-center"
					id="navbarSupportedContent">
					<ul class="navbar-nav ">
						<li class="nav-item active"><a class="nav-link"
							href="customer-home.jsp">Home <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Product </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="nav-link" href="wishlist.jsp">WishList</a> <a
									class="nav-link " href="customer-register.jsp">Cart</a>
							</div></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown1"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <%=c.getName()%>
						</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="nav-link" href="seller-login.jsp">Profile</a> <a
									class="nav-link " href="customer-login.jsp">Change Password</a>
								<a class="nav-link " href="admin-login.jsp">Logout</a>
							</div></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	<!--//headder-->
	<!-- banner -->
	<div class="inner_page-banner one-img"></div>
	<!--//banner -->
	<!-- short -->
	<div class="using-border py-3">
		<div class="inner_breadcrumb  ml-4">
			<ul class="short_ls">
				<li><a href="index.html">Home</a> <span>/ /</span></li>
				<li>Single Product</li>
			</ul>
		</div>
	</div>
	<!-- //short-->
	<!--//banner -->
	<!--/shop-->
	<section class="banner-bottom py-lg-5 py-3">
		<div class="container">
			<div class="inner-sec-shop pt-lg-4 pt-3">
				<div class="row">
					<%
					int id = Integer.parseInt(request.getParameter("id"));
					%>
					<%
					Product p = ProductDao.getProductsByPid(id);
					%>
					<div class="col-lg-4 single-right-left ">
						<div class="grid images_3_of_2">
							<div class="flexslider1">
								<ul class="slides">
									<li data-thumb="img/<%=p.getImage()%>">
										<div class="thumb-image">
											<img src="img/<%=p.getImage()%>" data-imagezoom="true"
												class="img-fluid" alt=" ">
										</div>
									</li>
								</ul>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-lg-8 single-right-left simpleCart_shelfItem">
						<h3><%=p.getPname()%></h3>
						<p>
							<span class="item_price"><%=p.getPprice()%></span>
						</p>

						<div class="description">
							<h5><%=p.getPdesc()%></h5>
							<%
							boolean flag = WishListDao.checkProductInWishList(p.getPid());
							%>
							<%
							if (flag == false) {
							%>
							<form action="WishListController" method="post">
								<input type="hidden" name="cusid" value="<%=c.getId()%>">
								<input type="hidden" name="pid" value="<%=p.getPid()%>">
								<input type="submit" name="action" value="Add To WishList">
							</form>
							<%
							}
							%>
							<form action="CartController" method="get">
								<input type="hidden" name="cusid" value="<%=c.getId()%>">
								<input type="hidden" name="pid" value="<%=p.getPid()%>">
								<input type="hidden" name="pname" value="<%=p.getPname()%>">
								<input type="hidden" name="pcategory"
									value="<%=p.getPcategory()%>"> <input type="hidden"
									name="pprice" value="<%=p.getPprice()%>"> <input
									type="submit" name="action" value="Add To Cart">
							</form>
						</div>

					</div>
					<div class="clearfix"></div>
					<!--/tabs-->
					<div class="responsive_tabs">
						<div id="horizontalTab">
							<ul class="resp-tabs-list">
								<li>Description</li>
								<li>Reviews</li>
								<li>Information</li>
							</ul>
							<div class="resp-tabs-container">
								<!--/tab_one-->
								<div class="tab1">
									<div class="single_page">
										<h6>Teddy bear</h6>
										<p>Introducing the latest and greatest toys that are sure
											to bring joy and excitement to kids of all ages! These
											innovative toys are packed with fun features and imaginative
											play possibilities.</p>
										<p class="para">These latest toys are designed to spark
											imagination, promote creativity, and provide hours of
											entertainment for kids of all ages. Whether it's exploring
											new worlds, coding robots, or becoming a superhero, these
											toys offer endless possibilities for fun and play. Get ready
											for an incredible playtime experience with these exciting and
											innovative toys!.</p>
									</div>
								</div>
								<!--//tab_one-->
								<div class="tab2">
									<div class="single_page">
										<div class="bootstrap-tab-text-grids">
											<div class="bootstrap-tab-text-grid">
												<div class="bootstrap-tab-text-grid-left">
													<img src="images/team1.jpg" alt=" " class="img-fluid">
												</div>
												<div class="bootstrap-tab-text-grid-right">
													<ul>
														<li><a href="#">Admin</a></li>
														<li><a href="#"><i class="fa fa-reply-all"
																aria-hidden="true"></i> Reply</a></li>
													</ul>
													<p>I recently purchased the Cozy Cuddles Teddy Bear for
														my 6-year-old daughter, and it has quickly become her
														favorite companion. This teddy bear has exceeded my
														expectations in terms of quality, comfort, and overall
														appeal..</p>
												</div>
												<div class="clearfix"></div>
											</div>
											<div class="add-review">
												<h4>add a review</h4>
												<form action="#" method="post">
													<div class="row">
														<div class="col-md-6">
															<input type="text" name="Name" required="">
														</div>
														<div class="col-md-6">
															<input type="email" name="Email" required="">
														</div>
													</div>
													<textarea name="Message" required=""></textarea>
													<input type="submit" value="SEND">
												</form>
											</div>
										</div>
									</div>
								</div>
								<div class="tab3">
									<div class="single_page">
										<h6>Teddy Bear(Blue)</h6>
										<p>Introducing the latest and greatest toys that are sure
											to bring joy and excitement to kids of all ages! These
											innovative toys are packed with fun features and imaginative
											play possibilities.</p>
										<p class="para">These latest toys are designed to spark
											imagination, promote creativity, and provide hours of
											entertainment for kids of all ages. Whether it's exploring
											new worlds, coding robots, or becoming a superhero, these
											toys offer endless possibilities for fun and play. Get ready
											for an incredible playtime experience with these exciting and
											innovative toys!.</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!--//tabs-->
				</div>
			</div>
		</div>
	</section>
	<!--subscribe-address-->
	<section class="subscribe">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-6 col-md-6 map-info-right px-0">
					<iframe
						src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978">
					</iframe>
				</div>
				<div class="col-lg-6 col-md-6 address-w3l-right text-center">
					<div class="address-gried ">
						<span class="far fa-map"></span>
						<p>
							212,Toys Shop Road<br> Teen Darwaja,Ahmedabad
						<p>
					</div>
					<div class="address-gried mt-3">
						<span class="fas fa-phone-volume"></span>
						<p>
							(+91)8200405262<br>(+91)8200405262
						</p>
					</div>
					<div class=" address-gried mt-3">
						<span class="far fa-envelope"></span>
						<p>
							<a href="khajinastore723@gmail.com">khajinastore723@gmail.com</a>
							<br> <a href="khajinastore723@gmail.com">khajinastore723@gmail.com</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--//subscribe-address-->
	<section class="sub-below-address py-lg-4 py-md-3 py-sm-3 py-3">
		<div class="container py-lg-5 py-md-5 py-sm-4 py-3">
			<h3 class="title clr text-center mb-lg-5 mb-md-4 mb-sm-4 mb-3">Get
				In Touch Us</h3>
			<div class="icons mt-4 text-center">
				<ul>
					<li><a href="#"><span class="fab fa-facebook-f"></span></a></li>
					<li><a href="#"><span class="fas fa-envelope"></span></a></li>
					<li><a href="#"><span class="fas fa-rss"></span></a></li>
					<li><a href="#"><span class="fab fa-vk"></span></a></li>
				</ul>
				<p class="my-3">You can subscribe our newsletter, which bring
					all the new update or when we have the latest new toys and product
				</p>
			</div>
			<div class="email-sub-agile">
				<form action="#" method="post">
					<div class="form-group sub-info-mail">
						<input type="email" class="form-control email-sub-agile"
							placeholder="Email">
					</div>
					<div class="text-center">
						<button type="submit" class="btn subscrib-btnn">Subscribe</button>
					</div>
				</form>
			</div>
		</div>
	</section>
	<!--//subscribe-->
	<!-- footer -->
	<footer class="py-lg-4 py-md-3 py-sm-3 py-3 text-center">
		<div class="copy-agile-right">
			<p>
				© 2023 Khajina-Shopping. All Rights Reserved | Design by <a
					href="http://localhost:8080/Khajina_Shopping" target="_blank">Khajina
					Shopping</a>
			</p>
		</div>
	</footer>
	<!-- //footer -->
	<!-- Modal 1-->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Login</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="register-form">
						<form action="#" method="post">
							<div class="fields-grid">
								<div class="styled-input">
									<input type="text" placeholder="Your Name" name="Your Name"
										required="">
								</div>
								<div class="styled-input">
									<input type="email" placeholder="Your Email" name="Your Email"
										required="">
								</div>
								<div class="styled-input">
									<input type="password" placeholder="password" name="password"
										required="">
								</div>
								<button type="submit" class="btn subscrib-btnn">Login</button>
							</div>
						</form>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	<!-- //Modal 1-->
	<!--js working-->
	<script src='js/jquery-2.2.3.min.js'></script>
	<!--//js working-->
	<!-- cart-js -->
	<script src="js/minicart.js"></script>
	<script>
		toys.render();

		toys.cart.on('toys_checkout', function(evt) {
			var items, len, i;

			if (this.subtotal() > 0) {
				items = this.items();

				for (i = 0, len = items.length; i < len; i++) {
				}
			}
		});
	</script>
	<!-- //cart-js -->
	<!--responsiveslides banner-->
	<script src="js/responsiveslides.min.js"></script>
	<script>
		// You can also use "$(window).load(function() {"
		$(function() {
			// Slideshow 4
			$("#slider4").responsiveSlides({
				auto : true,
				pager : false,
				nav : true,
				speed : 900,
				namespace : "callbacks",
				before : function() {
					$('.events').append("<li>before event fired.</li>");
				},
				after : function() {
					$('.events').append("<li>after event fired.</li>");
				}
			});

		});
	</script>
	<!--// responsiveslides banner-->
	<!--slider flexisel -->
	<script src="js/jquery.flexisel.js"></script>
	<script>
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems : 3,
				animationSpeed : 3000,
				autoPlay : true,
				autoPlaySpeed : 2000,
				pauseOnHover : true,
				enableResponsiveBreakpoints : true,
				responsiveBreakpoints : {
					portrait : {
						changePoint : 480,
						visibleItems : 1
					},
					landscape : {
						changePoint : 640,
						visibleItems : 2
					},
					tablet : {
						changePoint : 768,
						visibleItems : 2
					}
				}
			});

		});
	</script>
	<!-- //slider flexisel -->
	<!-- start-smoth-scrolling -->
	<script src="js/move-top.js"></script>
	<script src="js/easing.js"></script>
	<script>
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 900);
			});
		});
	</script>
	<!-- start-smoth-scrolling -->
	<!-- here stars scrolling icon -->
	<script>
		$(document).ready(function() {

			var defaults = {
				containerID : 'toTop', // fading element id
				containerHoverID : 'toTopHover', // fading element hover id
				scrollSpeed : 1200,
				easingType : 'linear'
			};
			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //here ends scrolling icon -->
	<!--bootstrap working-->
	<script src="js/bootstrap.min.js"></script>
	<!-- //bootstrap working-->
</body>
</html>