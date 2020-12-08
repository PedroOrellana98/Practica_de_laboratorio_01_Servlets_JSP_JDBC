<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<title>Insertar</title>
</head>
<body>
<!-- Materialize SCRIPT -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

<nav class="cyan darken-2">
    <div class="nav-wrapper container">
      <form action="Login" method="GET">
				<a href="Login">Administrador</a>
		</form>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
      </ul>
    </div>
  </nav>
  
  <div class="container">
	  <h3>Agregar Nuevo Producto: </h3>
	  <form action="insertarProducto" method="POST">
			
			<label for="nombre">Nombre del Producto: </label> 
			<input name="nombre" type="text" /><BR />
					
			<label for="sel">Categoria del producto: 1- SOBREMESA; 2- LAPTOP </label> 
			<input name="sel" type="text" /><BR />
			
			<label for="req">Requerimiento del Producto: 1- DAVID CORNEJO; 2- PEDRO ORELLANA; 3- DANIEL PERALTA; 4- JUAN VASQUEZ; 5- PABLO CALLE: 6- DIEGO ORTEGA</label> 
			<input name="req" type="text" /><BR />
			
			<button class="btn waves-effect waves-light green" type="submit" name="botonAgregar" value="agregar">AGREGAR</button>
	
	  </form>
  </div>

</body>
<footer class="page-footer cyan darken-4">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h4 class="white-text">Universidad Polit�cnica Salesiana</h4>
                <h5 class="white-text">Pr�ctica de laboratorio 01: Servlets, JSP y JDBC</h5>
                <p class="grey-text text-lighten-4">Integrantes:</p>
                <p class="grey-text text-lighten-4">David Cornejo</p>
                <p class="grey-text text-lighten-4">Pedro Orellana</p>
                <p class="grey-text text-lighten-4">Daniel Peralta</p>
              </div>
              <div class="col l4 offset-l2 s12">
                <!--<h5 class="white-text">Links</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 1</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 2</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 3</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>
                </ul>-->
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            � 2020 Universidad Polit�cnica Salesiana
            </div>
          </div>
</footer>
</html>