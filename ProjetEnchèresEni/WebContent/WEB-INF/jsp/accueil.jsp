<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Eni - Enchères</title>
</head>
<body>
<header>

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand">Eni - Enchères</a>
    <form class="d-flex">
      
      <li class="nav-item"><a class="nav-link"
				href="InscriptionServlet"> S'inscrire - Se connecter <span class="sr-only"></span> </a></li>         
    </form>
  </div>
</nav>

</header>

 <div class="welcome-text">
 <h2> Liste des Enchères</h2>
  
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