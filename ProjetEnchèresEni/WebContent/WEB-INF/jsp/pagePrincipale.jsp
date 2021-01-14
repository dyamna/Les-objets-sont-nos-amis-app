
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<!-- vro/page principale-- -->

<!DOCTYPE html>
<title>Espace Personnel</title>
<html>
<body>
	

	<%@include file="/WEB-INF/jsp/navbarre.jsp"%>


	<div class="row justify-content-center">

		<div class="col-md-6">
			<div class="card">
				<header class="card-header">
					<c:if test="${!empty sessionScope.sessionUtilisateur}">
						<h4 class="float-right btn btn-outline-primary mt-1">${sessionScope.sessionUtilisateur.pseudo}
							Connecté</h4>
					</c:if>
					<c:if test="${empty sessionScope.sessionUtilisateur}">
						<h4 class="float-right btn btn-outline-primary mt-1">Vous
							n'êtes pas connecté</h4>
					</c:if>

				</header>



 <div class="welcome-text">
 <h3 class="text-center"> Liste des Enchères</h3>
  
  <form>
  <div>
  	<label for="word-search">Filtre:</label>
    <input type="search" id="Recherche" name="q"
    placeholder="Le nom de l'article contient" size="30">
    
  </div>
</form>


<select name="category" id="category-select">
    <option value="category-choice">--Choisissez une catégorie:--</option>
    <option value="Informatique">Informatique</option>
    <option value="Ameublement">Ameublement</option>
    <option value="Ameublement">Ameublement</option>
    <option value="Sport & Loisirs">Sport & Loisirs</option>
 
</select>

<button>Rechercher</button>


</body>
</html>