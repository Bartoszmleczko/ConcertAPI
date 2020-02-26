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
		
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="mainPage">Start Bootstrap</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#Metal">Metal</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#Pop">Pop</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#Rap">Rap</a>
          </li>
                    <li class="nav-item">
            <a class="nav-link" href="#Rock">Rock</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  
  
    <div class="container text-center">
    
		
 			<form:form action="saveDate" modelAttribute="date1" method="post" cssClass="input-group mt-5 ml-5  ">
 			<form:hidden path="date_id"/>
<table>

<tbody>
<tr>
<td><label>Data</label></td>
<td><form:input path="date"></form:input></td>
</tr>

<tr>
<td><label></label></td>
<td><input  type="submit" value="Save" class="save"	/></td>
</tr>

</tbody>



</table>
 			
 			</form:form>
 			
 			
 			
 			
 			
 			
 			</div>   
    
    

    


    <script src="${pageContext.request.contextPath}/resources/css/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.bundle.min.js"></script>


    <script src="${pageContext.request.contextPath}/resources/css/jquery-easing/jquery.easing.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/magnific-popup/jquery.magnific-popup.min.js"></script>


    <script src="${pageContext.request.contextPath}/resources/js/jqBootstrapValidation.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/contact_me.js"></script>


    <script src="${pageContext.request.contextPath}/resources/js/freelancer.min.js"></script>

  </body>

</html>