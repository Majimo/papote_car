<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PapoteCar | Créer un trajet</title>
</head>
<body>
	<div class="container">
		<div class="wrapper" style="margin-top: 10px;">
			<form method="post" action="revision" name="Trip_Form"
				class="form-signin" onsubmit="return verifLieu()">
				<h3 class="form-signin-heading">Ajouter un trajet</h3>
				<hr class="colorgraph">
				<br> <label>Heure de départ :</label> <input type="text"
					class="form-control" name="heureDepart" placeholder="00:00"
					required autofocus /> <label>Heure d'arrivée :</label> <input
					type="text" class="form-control" name="heureArrivee"
					placeholder="00:00" required /> <label>Ville de départ :</label> <input
					type="text" class="form-control" name="lieuDepart" id="lieuDepart"
					placeholder="Ville de départ" required /> <label>Ville
					d'arrivée :</label> <input type="text" class="form-control"
					name="lieuArrivee" id="lieuArrivee" placeholder="Ville d'arrivée"
					required /> <label>Nombre de places :</label> <input type="number"
					class="form-control" name="nbPlaces" min="1" max="4" required>

				<button class="btn btn-lg btn-primary btn-block" name="send"
					style="margin-top: 1em;" value="send" type="submit">Envoyer</button>
			</form>

			<p id="erreur" style="color: red; font-weight: bold; margin-top: 1em"></p>
		</div>
	</div>
</body>

<script type="text/javascript">
	function verifLieu() {
		if (document.getElementById("lieuDepart").value.length < 2 || document.getElementById("lieuDepart").value.length > 30) {
			document.getElementById("erreur").innerHTML = "La ville de départ doit faire un maximum de 30 caractères";
			return false;
		} else if (document.getElementById("lieuArrivee").value.length < 2 || document.getElementById("lieuArrivee").value.length > 30) {
			document.getElementById("erreur").innerHTML = "La ville d'arrivée doit faire un maximum de 30 caractères";
			return false;
		} else {
			return true;
		}
	}
</script>

</html>