/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-06-27 13:35:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.ProductDao;
import Model.Product;
import java.util.List;
import Model.Seller;

public final class seller_002dmanage_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Model.Product");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Dao.ProductDao");
    _jspx_imports_classes.add("Model.Seller");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--A Design by W3layouts\n");
      out.write("   Author: W3layout\n");
      out.write("   Author URL: http://w3layouts.com\n");
      out.write("   License: Creative Commons Attribution 3.0 Unported\n");
      out.write("   License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("   -->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("   <head>\n");
      out.write("      <title>Toys Shop an Ecommerce Category Bootstrap Responsive Web Template | Home :: w3layouts</title>\n");
      out.write("      <!--meta tags -->\n");
      out.write("      <meta charset=\"UTF-8\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("      <meta name=\"keywords\" content=\"Toys Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("         Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("      <script>\n");
      out.write("         addEventListener(\"load\", function () {\n");
      out.write("         	setTimeout(hideURLbar, 0);\n");
      out.write("         }, false);\n");
      out.write("         \n");
      out.write("         function hideURLbar() {\n");
      out.write("         	window.scrollTo(0, 1);\n");
      out.write("         }\n");
      out.write("      </script>\n");
      out.write("      <!--//meta tags ends here-->\n");
      out.write("      <!--booststrap-->\n");
      out.write("      <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("      <!--//booststrap end-->\n");
      out.write("      <!-- font-awesome icons -->\n");
      out.write("      <link href=\"css/fontawesome-all.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("      <!-- //font-awesome icons -->\n");
      out.write("      <!--Shoping cart-->\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/shop.css\" type=\"text/css\" />\n");
      out.write("      <!--//Shoping cart-->\n");
      out.write("      <!--checkout-->\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/checkout.css\">\n");
      out.write("      <!--//checkout-->\n");
      out.write("      <!--stylesheets-->\n");
      out.write("      <link href=\"css/style.css\" rel='stylesheet' type='text/css' media=\"all\">\n");
      out.write("      <!--//stylesheets-->\n");
      out.write("      <link href=\"//fonts.googleapis.com/css?family=Sunflower:500,700\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"//fonts.googleapis.com/css?family=Open+Sans:400,600,700\" rel=\"stylesheet\">\n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("     ");

   Seller s = null;
   if(session.getAttribute("data")!=null){
	   s = (Seller)session.getAttribute("data");
   }
   else{
	   response.sendRedirect("seller-login.jsp");
   }
   
      out.write("\n");
      out.write("      <!--headder-->\n");
      out.write("      <div class=\"header-outs\" id=\"home\">\n");
      out.write("         <div class=\"header-bar\">\n");
      out.write("            <div class=\"info-top-grid\">\n");
      out.write("               <div class=\"info-contact-agile\">\n");
      out.write("                  <ul>\n");
      out.write("                     <li>\n");
      out.write("                        <span class=\"fas fa-phone-volume\"></span>\n");
      out.write("                        <p>+(000)123 4565 32</p>\n");
      out.write("                     </li>\n");
      out.write("                     <li>\n");
      out.write("                        <span class=\"fas fa-envelope\"></span>\n");
      out.write("                        <p><a href=\"mailto:info@example.com\">info@example1.com</a></p>\n");
      out.write("                     </li>\n");
      out.write("                     <li>\n");
      out.write("                     </li>\n");
      out.write("                  </ul>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("               <div class=\"hedder-up row\">\n");
      out.write("                  <div class=\"col-lg-3 col-md-3 logo-head\">\n");
      out.write("                     <h1><a class=\"navbar-brand\" href=\"index.html\">Toys-Shop</a></h1>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-lg-5 col-md-6 search-right\">\n");
      out.write("                     <form class=\"form-inline my-lg-0\">\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\">\n");
      out.write("                        <button class=\"btn\" type=\"submit\">Search</button>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-lg-4 col-md-3 right-side-cart\">\n");
      out.write("                     <div class=\"cart-icons\">\n");
      out.write("                        <ul>\n");
      out.write("                           <li>\n");
      out.write("                              <span class=\"far fa-heart\"></span>\n");
      out.write("                           </li>\n");
      out.write("                           <li>\n");
      out.write("                              <button type=\"button\" data-toggle=\"modal\" data-target=\"#exampleModal\"> <span class=\"far fa-user\"></span></button>\n");
      out.write("                           </li>\n");
      out.write("                           <li class=\"toyscart toyscart2 cart cart box_1\">\n");
      out.write("                              <form action=\"#\" method=\"post\" class=\"last\">\n");
      out.write("                                 <input type=\"hidden\" name=\"cmd\" value=\"_cart\">\n");
      out.write("                                 <input type=\"hidden\" name=\"display\" value=\"1\">\n");
      out.write("                                 <button class=\"top_toys_cart\" type=\"submit\" name=\"submit\" value=\"\">\n");
      out.write("                                 <span class=\"fas fa-cart-arrow-down\"></span>\n");
      out.write("                                 </button>\n");
      out.write("                              </form>\n");
      out.write("                           </li>\n");
      out.write("                        </ul>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("               <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("               <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("               </button>\n");
      out.write("               <div class=\"collapse navbar-collapse justify-content-center\" id=\"navbarSupportedContent\">\n");
      out.write("                  <ul class=\"navbar-nav \">\n");
      out.write("                     <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"seller-home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                     </li>\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                        <a href=\"about.html\" class=\"nav-link\">About</a>\n");
      out.write("                     </li>\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                        <a href=\"service.html\" class=\"nav-link\">Service</a>\n");
      out.write("                     </li>\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                        <a href=\"shop.html\" class=\"nav-link\">Shop Now</a>\n");
      out.write("                     </li>\n");
      out.write("                     <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        Product\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                           <a class=\"nav-link\" href=\"seller-upload-product.jsp\">Upload Product</a>\n");
      out.write("                           <a class=\"nav-link \" href=\"seller-manage-product.jsp\">Manage Product</a>\n");
      out.write("                        </div>\n");
      out.write("                     </li>\n");
      out.write("                     <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown1\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        ");
      out.print(s.getName() );
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                           <a class=\"nav-link\" href=\"seller-profile.jsp\">Profile</a>\n");
      out.write("                           <a class=\"nav-link \" href=\"seller-change-password.jsp\">Change Password</a>\n");
      out.write("                           <a class=\"nav-link \" href=\"seller-logout.jsp\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                     </li>\n");
      out.write("                  </ul>\n");
      out.write("               </div>\n");
      out.write("            </nav>\n");
      out.write("         </div>\n");
      out.write("		  </div>\n");
      out.write("         <!--//headder-->\n");
      out.write("         <!-- banner -->\n");
      out.write("         <div class=\"inner_page-banner one-img\">\n");
      out.write("         </div>\n");
      out.write("         <!-- short -->\n");
      out.write("         <div class=\"using-border py-3\">\n");
      out.write("            <div class=\"inner_breadcrumb  ml-4\">\n");
      out.write("               <ul class=\"short_ls\">\n");
      out.write("                  <li>\n");
      out.write("                     <a href=\"seller-home.jsp\">Home</a>\n");
      out.write("                     <span>/ /</span>\n");
      out.write("                  </li>\n");
      out.write("                  <li>Manage Products</li>\n");
      out.write("               </ul>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         <!-- //short-->\n");
      out.write("         <!--Checkout-->  \n");
      out.write("         <!-- //banner -->\n");
      out.write("         <!-- top Products -->\n");
      out.write("         <section class=\"checkout py-lg-4 py-md-3 py-sm-3 py-3\">\n");
      out.write("            <div class=\"container py-lg-5 py-md-4 py-sm-4 py-3\">\n");
      out.write("               <div class=\"shop_inner_inf\">\n");
      out.write("                  <div class=\"privacy about\">\n");
      out.write("                     <h3>Manage Product</h3>\n");
      out.write("                     <div class=\"checkout-right\">\n");
      out.write("                        <table class=\"timetable_sub\">\n");
      out.write("                           <thead>\n");
      out.write("                              <tr>\n");
      out.write("                                 <th>Product</th>\n");
      out.write("                                 <th>Product Name</th>\n");
      out.write("                                 <th>Price</th>\n");
      out.write("                                 <th>Edit</th>\n");
      out.write("                                 <th>Remove</th>\n");
      out.write("                              </tr>\n");
      out.write("                           </thead>\n");
      out.write("                           <tbody>\n");
      out.write("                           \n");
      out.write("                           ");
List<Product> list = ProductDao.getProductsBySid(s.getId()); 
      out.write("\n");
      out.write("                           ");
for(Product p:list){ 
      out.write("\n");
      out.write("                              <tr class=\"rem1\">\n");
      out.write("                                 <td class=\"invert-image\"><a href=\"single.html\"><img src=\"img/");
      out.print(p.getImage() );
      out.write("\" alt=\" \" height=\"100px\" width=\"px100\" class=\"img-responsive\"></a></td>\n");
      out.write("                                 <td class=\"invert\">");
      out.print(p.getPname() );
      out.write("</td>\n");
      out.write("                                 <td class=\"invert\">");
      out.print(p.getPprice() );
      out.write("</td>\n");
      out.write("                               	  <td>\n");
      out.write("                                    <a href=\"edit-product.jsp?id=");
      out.print(p.getPid());
      out.write("\">Edit</a>\n");
      out.write("                                 </td>\n");
      out.write("                                 <td>\n");
      out.write("                                    <a href=\"seller-remove-product.jsp?id=");
      out.print(p.getPid());
      out.write("\">Remove</a>\n");
      out.write("                                 </td>\n");
      out.write("                              </tr>\n");
      out.write("                             ");
} 
      out.write("\n");
      out.write("                           </tbody>\n");
      out.write("                        </table>\n");
      out.write("                     </div>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <!-- //top products -->\n");
      out.write("            </div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("   \n");
      out.write("      <!--//subscribe-->\n");
      out.write("      <!-- footer -->\n");
      out.write("      <footer class=\"py-lg-4 py-md-3 py-sm-3 py-3 text-center\">\n");
      out.write("         <div class=\"copy-agile-right\">\n");
      out.write("            <p> \n");
      out.write("               © 2018 Toys-Shop. All Rights Reserved | Design by <a href=\"http://www.W3Layouts.com\" target=\"_blank\">W3Layouts</a>\n");
      out.write("            </p>\n");
      out.write("         </div>\n");
      out.write("      </footer>\n");
      out.write("      <!-- //footer -->\n");
      out.write("      <!-- Modal 1-->\n");
      out.write("      <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("         <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("               <div class=\"modal-header\">\n");
      out.write("                  <h5 class=\"modal-title\" id=\"exampleModalLabel\">Login</h5>\n");
      out.write("                  <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                  <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                  </button>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"modal-body\">\n");
      out.write("                  <div class=\"register-form\">\n");
      out.write("                     <form action=\"#\" method=\"post\">\n");
      out.write("                        <div class=\"fields-grid\">\n");
      out.write("                           <div class=\"styled-input\">\n");
      out.write("                              <input type=\"text\" placeholder=\"Your Name\" name=\"Your Name\" required=\"\">\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"styled-input\">\n");
      out.write("                              <input type=\"email\" placeholder=\"Your Email\" name=\"Your Email\" required=\"\">\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"styled-input\">\n");
      out.write("                              <input type=\"password\" placeholder=\"password\" name=\"password\" required=\"\">\n");
      out.write("                           </div>\n");
      out.write("                           <button type=\"submit\" class=\"btn subscrib-btnn\">Login</button>\n");
      out.write("                        </div>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"modal-footer\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- //Modal 1-->\n");
      out.write("      <!--js working-->\n");
      out.write("      <script src='js/jquery-2.2.3.min.js'></script>\n");
      out.write("      <!--//js working-->\n");
      out.write("      <!-- cart-js -->	\n");
      out.write("      <script src=\"js/minicart.js\"></script>\n");
      out.write("      <script>\n");
      out.write("         toys.render();\n");
      out.write("         \n");
      out.write("         toys.cart.on('toys_checkout', function (evt) {\n");
      out.write("         	var items, len, i;\n");
      out.write("         \n");
      out.write("         	if (this.subtotal() > 0) {\n");
      out.write("         		items = this.items();\n");
      out.write("         \n");
      out.write("         		for (i = 0, len = items.length; i < len; i++) {}\n");
      out.write("         	}\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <!--// cart-js -->\n");
      out.write("      <!--quantity-->\n");
      out.write("      <script>\n");
      out.write("         $('.value-plus').on('click', function () {\n");
      out.write("         	var divUpd = $(this).parent().find('.value'),\n");
      out.write("         		newVal = parseInt(divUpd.text(), 10) + 1;\n");
      out.write("         	divUpd.text(newVal);\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("         $('.value-minus').on('click', function () {\n");
      out.write("         	var divUpd = $(this).parent().find('.value'),\n");
      out.write("         		newVal = parseInt(divUpd.text(), 10) - 1;\n");
      out.write("         	if (newVal >= 1) divUpd.text(newVal);\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <!--quantity-->\n");
      out.write("      <!--closed-->\n");
      out.write("      <script>\n");
      out.write("         $(document).ready(function (c) {\n");
      out.write("         	$('.close1').on('click', function (c) {\n");
      out.write("         		$('.rem1').fadeOut('slow', function (c) {\n");
      out.write("         			$('.rem1').remove();\n");
      out.write("         		});\n");
      out.write("         	});\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("         $(document).ready(function (c) {\n");
      out.write("         	$('.close2').on('click', function (c) {\n");
      out.write("         		$('.rem2').fadeOut('slow', function (c) {\n");
      out.write("         			$('.rem2').remove();\n");
      out.write("         		});\n");
      out.write("         	});\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("         $(document).ready(function (c) {\n");
      out.write("         	$('.close3').on('click', function (c) {\n");
      out.write("         		$('.rem3').fadeOut('slow', function (c) {\n");
      out.write("         			$('.rem3').remove();\n");
      out.write("         		});\n");
      out.write("         	});\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <!--//closed-->\n");
      out.write("      <!-- start-smoth-scrolling -->\n");
      out.write("      <script src=\"js/move-top.js\"></script>\n");
      out.write("      <script src=\"js/easing.js\"></script>\n");
      out.write("      <script>\n");
      out.write("         jQuery(document).ready(function ($) {\n");
      out.write("         	$(\".scroll\").click(function (event) {\n");
      out.write("         		event.preventDefault();\n");
      out.write("         		$('html,body').animate({\n");
      out.write("         			scrollTop: $(this.hash).offset().top\n");
      out.write("         		}, 900);\n");
      out.write("         	});\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <!-- start-smoth-scrolling -->\n");
      out.write("      <!-- here stars scrolling icon -->\n");
      out.write("      <script>\n");
      out.write("         $(document).ready(function () {\n");
      out.write("         \n");
      out.write("         	var defaults = {\n");
      out.write("         		containerID: 'toTop', // fading element id\n");
      out.write("         		containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("         		scrollSpeed: 1200,\n");
      out.write("         		easingType: 'linear'\n");
      out.write("         	};\n");
      out.write("         	$().UItoTop({\n");
      out.write("         		easingType: 'easeOutQuart'\n");
      out.write("         	});\n");
      out.write("         \n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <!-- //here ends scrolling icon -->\n");
      out.write("      <!--bootstrap working-->\n");
      out.write("      <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("      <!-- //bootstrap working-->\n");
      out.write("   </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
