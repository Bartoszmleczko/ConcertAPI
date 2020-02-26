<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="pl">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Bartosz Mleczko</title>


    <link href="${pageContext.request.contextPath}/resources/css/bootstrap/css/bootstrap.min.css" rel="stylesheet">


    <link href="${pageContext.request.contextPath}/resources/css/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">


    <link href="${pageContext.request.contextPath}/resources/css/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css">


    <link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" type="text/css">

  </head>
  
    <body id="page-top">




<div class="jumbotron text-center bg-dark blue rounded shadow-lg p-3" style="color:#FFFFFF;">
  <h1>E-Concert.pl</h1> 
  <p><b>Zarezerwuj bilety na koncerty ulubionych artystów już teraz. Odkryj nowe zespoły w Twojej okolicy. I to wszystko już w tym momencie. </b></p> 
</div>









    <div class="container">
    <div class="row form-group card mt-5 rounded shadow-lg p-3 login-form">

			<form:form action="validateLogin" modelAttribute="customer" method="POST">
		

    <label for="inputEmail3" class="col-sm-2 col-form-label">Login</label>
<form:errors path="email" cssClass="error" />
      <form:input path="email" type="text" class="form-control" id="inputEmail3"/>



    <label for="inputPassword3" class="col-sm-2 col-form-label">Hasło</label>
<form:errors path="password" cssClass="error" />
      <form:input path="password" type="password" class="form-control" id="inputPassword3"/>


      <input type="submit" class="btn btn-secondary mt-2 center btn-lg" value="Zaloguj się">
    </form:form>

		</div>
		
		
		
		
		
	</div>




    <script src="${pageContext.request.contextPath}/resources/css/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.bundle.min.js"></script>


    <script src="${pageContext.request.contextPath}/resources/css/jquery-easing/jquery.easing.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/magnific-popup/jquery.magnific-popup.min.js"></script>


    <script src="${pageContext.request.contextPath}/resources/js/jqBootstrapValidation.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/contact_me.js"></script>


    <script src="${pageContext.request.contextPath}/resources/js/freelancer.min.js"></script>
    <footer class="page-footer font-small black bg-dark " style="color:#FFFFFF; margin-top:268px;">
 
  <!-- Copyright -->
  <div class="footer-copyright text-center py-3 bg-dark " style="color:#FFFFFF; margin-bottom:-50px;">
    <p> Autor: Bartosz Mleczko</p>
  </div>
  <!-- Copyright -->

</footer>
  </body>

</html>