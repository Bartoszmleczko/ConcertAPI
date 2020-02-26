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
		
 		
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
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
            <a class="nav-link" href="venuesConcerts" style="color:#ffffff;">Miejsca</a>
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
  <div class="dropdown-menu dropdown-menu-right dropdown-div">
  
  
  <c:forEach items="${ticketList}" var="ticket">
  <div class="btn-group">
  						<c:url var="deleteLink" value="/customer/deleteSingleTicket">
				<c:param name="ticketId" value="${ticket.ticket_id}"></c:param>
				</c:url>
      <button class="dropdown-item dropdown-shop btn-lg" type="button" >${ticket.ticket_number} | ${ticket.ticket_price}zł | ${ticket.ticSectorName} |
     <b> ${ticket.concert.band.band_name} </b>|${ticket.concert.concert_name}
      
      </button>
      <a class="dropdown item btn btn-primary btn-sm" role="button" href="${deleteLink}">
      Usuń bilet
      </a>
  </div>
  </c:forEach>
  
    <a class="btn btn-secondary" role="button" href="deleteTickets">Wyślij zamówienie</a>
  </div>
</div>
    </div>

  </nav>
    <a href="deleteTickets" role="button" class="btn btn-primary btn-block fixed-top mt-5 btn-lg">Wyślij zamówienie</a>
  <!-- Page Content -->
  <div class="container">
    <div class="row">
      <div class="col-lg-12 text-center">
      

      					<h1 class="text-center text-uppercase text-secondary mb-0">Twoje bilety</h1>
      					<c:forEach items="${tickets}" var="ticket">
      					<div class="genreDivs col-lg-12" >
      					
      					
      					 <hr class="star-dark mb-5 ">

      					<div class="row">
      					<div class="col-lg-8 text-center concert_div shadow-lg p-3 mb-5 rounded">
								<img src="${pageContext.request.contextPath}/resources/img/gwiazdy/${ticket.concert.band.band_img}" class="img-responsive" width=100% />
								</div>
      					
      									<c:url var="updateLink" value="/customer/deleteSingleTicket">
											<c:param name="concertId2" value="${ticket.ticket_id}"></c:param>
										</c:url>
				
				
				<div class="col-lg-4 text-center concert_div shadow-lg p-3 mb-5 rounded">
  <table>
  <tr>
    <th><b>${ticket.concert.band.band_name}</b></th>
  </tr>

  <tr>
    <td> Trasa: <b>${ticket.concert.concert_name}</b></td>
  </tr>

  <tr>
    <td>Data:<b> ${ticket.concert.date.date}</b></td>
  </tr>
  
    <tr>
    <td>Gatunek:<b> ${ticket.concert.genre.genre_name}</b></td>
  </tr>
   <tr>
    <td>Miejsce:<b> ${ticket.concert.venue.venue_name}</b></td>
  </tr>
     <tr>
    <td> 	Ilość biletów: ${ticket.ticket_number}</td>
  </tr>
  
  
  
  
     <tr>
    <td> 		<a href="${updateLink}" role="button" class="btn btn-primary btn-block"> Zakup bilet
		</a></td>
  </tr>
     <tr>
    <td> 		<a href="${updateLink}" role="button" class="btn btn-primary btn-block"> Usuń bilet
		</a></td>
  </tr>
</table>	
		
      					      		</div>
      					 </div>

      					
      					
      				</div>	
      					</c:forEach>
  			
      					
      </div>
    </div>
  </div>

<footer class="page-footer font-small black bg-dark fixed-bottom" style="color:#ffffff;">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3 bg-dark fixed-bottom">
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