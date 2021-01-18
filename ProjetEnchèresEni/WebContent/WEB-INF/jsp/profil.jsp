
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<!-- page principale-- -->

<!DOCTYPE html>
<title>Mon Profil</title>
<html>
<body>
	

	<%@include file="/WEB-INF/jsp/navbarre.jsp"%>
	
	<div class="container">

	<div class="row">
		<div class="col-xs-6 col-xs-9 col-md-9">
			<div class="well well-md">
			
			
				
<form method="GET" action="profil">


	<br> 
	<br>
	<ul class="list-group">
  <li class="list-group-item d-flex justify-content-between align-items-center">
    Pseudo
    <span class="badge bg-primary" name= "Pseudo">${Pseudo}</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    Nom
    <span class="badge bg-primary" name= "Nom"> ${Nom}</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    Prénom
    <span class="badge bg-primary" name= "Prenom">Laura</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    E-mail
    <span class="badge bg-primary" name= "Email">laura@solios@gmail.com</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    Téléphone
    <span class="badge bg-primary" name= "Telephone">0678435600</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    Rue
    <span class="badge bg-primary" name= "Rue">345 rue du pont</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    Code Postal
    <span class="badge bg-primary" name= "CodePostal">33000</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center">
    Ville
    <span class="badge bg-primary" name= "Ville">Bordeaux</span>
  </li>
</ul>

  <div class="d-flex justify-content-center">

    <div class="btn-toolbar mt-5">

     <a class="btn btn-outline-secondary btn-lg shadow mx-3" role="button" href="%">Modifier</a>

    <a class="btn btn-outline-secondary btn-lg shadow mx-3" role="button" href="/ProjetEnchèresEni/">Supprimer</a>

    </div>

    </div>
</div>
</div>
</div>

</form>
</body>
</html>

