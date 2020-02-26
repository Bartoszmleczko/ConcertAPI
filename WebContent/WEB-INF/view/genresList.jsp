
<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

<title> CRM </title>

<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/css/login.css" >
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap/css/bootstrap.min.css" rel="stylesheet">


    <link href="${pageContext.request.contextPath}/resources/css/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/css/style.css" >

    <link href="${pageContext.request.contextPath}/resources/css/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css">
</head>




<body class="formularz">
<div id="wrapper">
	<div id="header">
	<h2>CRM - Customer Relationship Manager</h2>
	</div>
</div>

<div id="container">

			<div id="content">
			<form:form action="genresList" method="post">
			<input type="submit" value="Wyszukaj wg gatunku" 
			class="add-button"
			/>
			<select name="genreDrop" class="btn btn-secondary dropdown-toggle dropdown" >
			<c:forEach items="${genresList}" var="element">		
		<option selected = "selected" value="${element.genre_id}"  >${element.genre_name}</option>		
</c:forEach>	
</select>
</form:form>
			<table>
			
			<tr>

				<th>Nazwa Koncertu</th>
				<th>Zespoły</th>
				<th>Data</th>
				<th>Gatunek</th>
			</tr>
				<c:forEach var="concert" items="${genreList.concerts}">
				<c:url var="updateLink" value="/customer/genresTicketForm">
				<c:param name="concertId2" value="${concert.id}"></c:param>
				</c:url>
				<tr>
				
				<td>${concert.concert_name}</td>
				<td>
				<c:forEach var="band" items="${concert.bands}">		
				${band.name},
				</c:forEach>
				</td>
				<td>${concert.date.date}</td>
				<td>${concert.genre.genre_name}</td>	
				<td><a href="${updateLink}">Kup bilet</a></td>
				</tr>
				
				
				
				
				</c:forEach>
			
			</table>
			 
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