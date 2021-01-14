<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
 <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
   
<meta charset="UTF-8">
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand">Eni - Enchères</a> 
    </div></nav>
<form method="POST" action="Login">
  <div class="form-group">
    <label for="exampleIdentifiant">Identifiant</label>
    <input name="identifiant" type="email" class="form-control" id="exampleInputIdentifiant" aria-describedby="identifiant" placeholder="Entrer votre identifiant">
    <small id="identifiant" class="form-text text-muted"></small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Mot de passe</label>
    <input name="motDePasse" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Se souvenir de moi</label>
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Mot de passe oublié ?</label>
  </div>
  <input class="btn btn-primary" type="submit" value="Connection" >
   <a class="btn btn-primary" href="/ProjetEnchèresEni/inscription" role="button">Inscritpion</a>
</form>
