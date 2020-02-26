
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
		
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top new-height">
    <div class="container">
      <a class="navbar-brand" href="mainPage">Strona Główna</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/customer/genresList">
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="genresConcerts" style="color:#ffffff;">Gatunki</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="datesConcerts" style="color:#ffffff;">Daty</a>
          </li>
         <li class="nav-item">
            <a class="nav-link" href="venuesConcerts"style="color:#ffffff;">Miejsca</a>
          </li>
         <li class="nav-item">
            <a class="nav-link" href="login" style="color:#ffffff;">Wyloguj się</a>
          </li>
        </ul>
      </div>
      
         <div class="btn-group">
  <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Twoje bilety
  </button>
  <div class="dropdown-menu dropdown-menu-right">
  
  
  <c:forEach items="${ticketList}" var="ticket">
  
      <button class="dropdown-item" type="button">${ticket.ticket_number} | ${ticket.ticket_price}zł | ${ticket.ticSectorName} |
     <b> ${ticket.concert.band.band_name} </b>|${ticket.concert.concert_name}
      
      </button>
  
  </c:forEach>
  
    <a class="btn btn-secondary" role="button" href="deleteTickets">Wyślij zamówienie</a>
  </div>
</div>
    
      
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container  rounded shadow-lg" style="background:#3E4DFF;" >
  			<form:form action="saveTicket" modelAttribute="person">

    <div class="row mt-5 " >
      <div class="col-lg-12 text-center " >
      		<div class="genreDivs rounded mt-5" >
      		

          		<h1 class="mt-5 label label-primary" >
        			${concert.band.band_name}
        		</h1>    		
      			<h2>
      				${concert.date.date}
      			</h2>
        		<h2>
      				${concert.venue.venue_name} | ${concert.genre.genre_name}

      				${vcap}

      			</h2>  
      		 		
      		 	<h3>

      				${venue.max_capacity} wolnych miejsc
 	
      		 	
      		 	</h3>	
      		 		
      		 		
      		 		
      		</div>
      </div>
    </div>
	
	
	
	    <div class="row">
      <div class="col-lg-6 text-center mt-5 mb-5 genreDivs rounded shadow-lg p-3 ml-5">
      <label style="font-size: 24px; color:white;">Wybierz sektor</label>
			<select name="sectorsDrop" class="btn btn-secondary dropdown-toggle dropdown btn-lg" >
 								<c:forEach items="${venue.sectors}" var="element">		
									<option selected = "selected" value="${element.sector_id}"  >${element.sector_name} | ${element.sector_price}zł</option>		
								</c:forEach>	
						</select>	
      </div>

            <div class="col-lg-3 text-center mt-5 mb-5 input-group genreDivs rounded shadow-lg p-3">
			<input placeholder="Ile biletów?"  class="form-control input-lg " name="howManyTicks"  min="10" max="100"/>	
      </div>

    </div>
	
	    <div class="row">
	    <div class="col-lg-2"></div>
    
      <div class="col-lg-7 text-center form-custom input-group-lg genreDivs rounded shadow-lg p-3 ">

			<form:hidden path="person_id"/>
		<label><form:errors path="firstName" cssClass="error" /></label>	
			<form:input path="firstName" class="form-control form-custom input-lg" placeholder="Imię"/>
			<form:errors path="lastName" cssClass="error" />
			<form:input path="lastName" class="form-control form-custom input-lg" placeholder="Nazwisko"/>
			<form:errors path="email" cssClass="error" />
			<form:input path="email" class="form-control form-custom input-lg" placeholder="email@"/>
			<form:form modelAttribute="concert">

			      				
<form:hidden path="concert_id"/>

<form:form modelAttribute="venue">
<form:hidden path="venue_id"/>
			<input  type="submit" value="Save" class="btn-primary btn form-custom btn-lg"	/>
</form:form>		
</form:form>

      </div>
    </div>

</form:form>
  </div>
<footer class="page-footer font-small black bg-dark" style="color:#ffffff; margin-top:60px;">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3 bg-dark">
    <p> Autor: Bartosz Mleczko</p>
  </div>
  <!-- Copyright -->

</footer>
    <script src="${pageContext.request.contextPath}/resources/css/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.bundle.min.js"></script>


    <script src="${pageContext.request.contextPath}/resources/css/jquery-easing/jquery.easing.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/magnific-popup/jquery.magnific-popup.min.js"></script>


    <script src="${pageContext.request.contextPath}/resources/js/jqBootstrapValidation.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/contact_me.js"></script>


    <script src="${pageContext.request.contextPath}/resources/js/freelancer.min.js"></script>

  </body>

</html>