<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PapoteCar | Liste des trajets existants</title>
</head>
<body>

<h1>Trajets PapoteCar</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Heure départ</th>
				<th>Heure arrivée</th>
				<th>Lieu départ</th>
				<th>Lieu arrivée</th>
				<th>Nombre de places</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ trips }" var="trip">
				<tr>
					<td>${ trip.heureDepart }</td>
					<td>${ trip.heureArrivee }</td>
					<td>${ trip.lieuDepart }</td>
					<td>${ trip.lieuArrivee }</td>
					<td>${ trip.nbPlaces }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="revision" class="btn btn-secondary" style="margin-left:1em;"><- Retour à la création de trajets</a>
</body>
</html>