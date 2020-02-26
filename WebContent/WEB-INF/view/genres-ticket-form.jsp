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
    
    <link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/css/style.css" >

  </head>
  
    <body id="page-top">
		
			<nav class="navbar navbar-expand-lg bg-secondary fixed-top text-uppercase" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="#page-top">E-Concert.pl</a>
		</div>
    </nav>
		
	<section class="zakup"  id="register">
		<div class="container">
	
	 <div class="row">
    <div class="col-sm col-md col-lg">
		
    </div>
    <div class="col-sm col-md col-lg">
	<div class="btn-group">
	<form:form modelAttribute="${theConcert}" >
  <button type="button" class="btn btn-primary btn-lp" disabled>${theConcert.concert_name} </button>
  <button type="button" class="btn btn-primary btn-lp" disabled>${theConcert.date.date}</button>
  <button type="button" class="btn btn-primary btn-lp" disabled>${theConcert.genre.genre_name}</button>
  </form:form>
  
</div>

	<div class="btn-group">
			<form:form  method="post" modelAttribute="${sectors}"  >

			<select name="sectorDrop" class="btn btn-secondary dropdown-toggle dropdown" >
			<c:forEach items="${sectors}" var="element">		
		<option selected = "selected" value="${element}"  >${element.sector_name}</option>		
</c:forEach>	
</select>
</form:form>


	<div class="dropdown dropdown-margin">
  <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Ilość biletów
  <span class="caret"></span></button>
  <ul class="dropdown-menu">
    <li><a >1</a></li>
    <li><a >2</a></li>
    <li><a >3</a></li>
  </ul>
</div>


	</div>
    <form:form name="sentMessage" id="contactForm" novalidate="novalidate" action="saveTicket" modelAttribute="${person}">
              <div class="control-group groupie">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">

                  <input class="form-control" id="name" type="text" placeholder="${person.firstName}" required="required" data-validation-required-message="Podaj imie">
				  
                  <p class="help-block text-danger"></p>
                </div>
              </div>
				 <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <input class="form-control" id="phone" type="text" placeholder="${person.lastName}" required="required" data-validation-required-message="Podaj email">
                  <p class="help-block text-danger"></p>
                </div>
              </div>		  
				 <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <input  class="form-control" id="phone" type="text" placeholder="Email" required="required" data-validation-required-message="Podaj numer telefonu">
                  <p class="help-block text-danger"></p>
                </div>
              </div>				  

			  
              <div class="control-group groupie">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <input class="form-control" id="phone" type="tel" placeholder="${person.phone_number}" required="required" data-validation-required-message="Podaj numer telefonu">
                  <p class="help-block text-danger"></p>
                </div>
              </div>

				<c:url var="updateLink" value="/customer/saveTicket">
				<c:param name="person" value="${person.person_id}"></c:param>
				</c:url>
              <br>
              <div id="success"></div>
              <div class="form-group">

                			<input type="button" value="Add Customer" onclick = "window.location.href='${updateLink}'; return false;"
			class="add-button"
			/>
              </div>
            </form:form>
    </div>
    <div class="col-sm col-md col-lg">

    </div>
  </div>
</div>

	</section>

<div class="container">
  <div class="row descr">
    <div class="col-sm col-md col-lg">
       <img src="${pageContext.request.contextPath}/resources/img/z20920593Q,Metallica.jpg" alt="Gig">
    </div>
    <div class="col-sm col-md col-lg ">
     <p>
		Metallica – amerykański zespół metalowy, który powstał w 1981 r. w Los Angeles. W jego pierwszy skład weszli Lars Urlich, James Hetfield, Dave Mustaine i Ron McGovney. Mustaine oraz McGovney zostali wkrótce zastąpieni przez Kirka Hammetta i Cliffa Burtona, którzy pracowali już nad debiutancką płytą Metallici, „Kill ‘Em All” (1983). Sukces pierwszego albumu powtórzył drugi, „Ride The Lightening”. Kolejny z kolei, „Master Of Puppets”, został okrzyknięty jednym z największych osiągnięć muzyki metalowej w historii. Wydaniu płyty towarzyszyła trasa koncertowa Damage Inc. Tour, w trakcie której muzycy ulegli wypadkowi samochodowemu. Zginął w nim basista Cliff Burton. Skład Metallici zasilił Jason Newsted, który pracował przy albumie „… And Justice for All”. Płyta po kilku tygodniach pokryła się platyną. Wkrótce potem Metallica nagrała jeden ze swoich najpopularniejszych utworów, „One”. W 1991 r. grupa wydała album, który sprzedał się w liczbie 15 milionów egzemplarzy tylko w Stanach Zjednoczonych, czyli „The Black Album”. Znalazły się na nim utwory: „Nothnig Else Matters”, „The Unforgiven”, „Enter Sandman”. Pięć lat później ukazał się „Load”, który zaskoczył fanów swoją łagodną stylistyką. W 1999 r. powstał album oraz DVD „S&M” z koncertu z orkiestrą symfoniczną. Metallica od lat pozostaje w czołówce najlepszych zespołów metalowych wszechczasów.
		</p>
    </div>

  </div>
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