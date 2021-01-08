<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta name="viewport" content="width=device-width, initial-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap CSS -->

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">



<title>Inscription</title>

</head>

<body>

<header>

<nav class="navbar navbar-light bg-light">

  <div class="container-fluid">

    <a class="navbar-brand">Eni - Enchères</a>

  </div>

</nav>

</header>



<main role="main" class="flex-fill">



<div class="welcome-text py-4">

 <h2 class="text-center"> Mon profil</h2>

</div>



<div class="container">

<form method="POST" action="inscription">

  <div class="row">

    <div class="col">

      <label for="Pseudo">Pseudo :</label>

      <input type="text" class="form-control" id="Pseudo" placeholder="Votre pseudonyme">

    </div>

    <div class="col">

    <label for="Nom">Nom :</label>

      <input type="text" class="form-control" id="Nom" placeholder="Votre nom">

    </div>

  </div>

  <div class="row">

    <div class="col">

      <label for="Prenom">Prénom :</label>

      <input type="text" class="form-control" id="Prenom" placeholder="Votre prénom">

    </div>

    <div class="col">

      <label for="Email">E-mail :</label>

      <input type="text" class="form-control" id="Email" placeholder="Votre e-mail">

    </div>

  </div>

  <div class="row">

    <div class="col">

      <label for="Telephone">Téléphone :</label>

      <input type="text" class="form-control" id="Telephone" placeholder="Votre téléphone">

    </div>

    <div class="col">

      <label for="Rue">Rue :</label>

      <input type="text" class="form-control" id="Rue" placeholder="Rue">

    </div>

  </div>

  <div class="row">

    <div class="col">

      <label for="CP">Code postal :</label>

      <input type="text" class="form-control" id="CP" placeholder="Code postal">

    </div>

    <div class="col">

      <label for="Ville">Ville :</label>

      <input type="text" class="form-control" id="Ville" placeholder="Ville">

    </div>

  </div>

  <div class="row">

    <div class="col">

      <label for="MDP">Mot de passe :</label>

      <input type="text" class="form-control" id="MDP" placeholder="Mot de passe">

    </div>

    <div class="col">

      <label for="Confirm">Confirmation :</label>

      <input type="text" class="form-control" id"Confirm" placeholder="Confirmer le mot de passe">

    </div>

  </div>

      <div class="d-flex justify-content-center">

    <div class="btn-toolbar mt-5">

    <input class="btn btn-outline-secondary btn-lg shadow mx-3" type="submit" value="Créer">

    <input class="btn btn-outline-secondary btn-lg shadow mx-3" type="reset" value="Annuler">

    </div>

    </div>

 </form>

</main>

</body>

</html>