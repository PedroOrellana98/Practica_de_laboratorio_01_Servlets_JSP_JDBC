<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Materialize CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<title>Iniciar Sesión</title>
</head>
<body>
<!-- Materialize SCRIPT -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

  <nav class="light-blue darken-2">
    <div class="nav-wrapper container">
      <a href="./Home.jsp" class="brand-logo">Home</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="./InicioSesion.jsp">Iniciar Sesión</a></li>
        <li><a href="./RegistrarU.jsp">Registrarse</a></li>
      </ul>
    </div>
  </nav>
  
<div class="container">

	
	
	
	<h3>Inicie sesión</h3>
	<h5>Ingrese su correo y su contraseña</h5>
	
	<div class="row">

      <div class="col s4">
        <!-- Promo Content 1 goes here -->
      </div>
      <div class="col s4">
        <div class="row">
    	<!-- <form class="col s12" action="/Practica-1/AgregarNumero?ced=${p2 }" method="POST"> -->
    	<form class="col s12" action="Login" method="POST">
    		<div class="row">
        		<div class="input-field col s12">
          			<input id="email" name = "correo" type="email" class="validate">
          			<label for="email">Correo</label>
        		</div>
      		</div>
      		 <div class="row">
        		<div class="input-field col s12">
          			<input id="password" name = "clave" type="password" class="validate">
          			<label for="password">Contraseña</label>
        		</div>
      		</div>
    	</form>
    </div>
    <div class="center">
    	<button class="btn waves-effect waves-light green" type="submit" name="action">Iniciar sesión</button>
    </div>
	
</div>
      </div>
      <div class="col s4">
        <!-- Promo Content 3 goes here -->
      </div>

    </div>

  <br>
</body>

<footer class="page-footer blue darken-4">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h4 class="white-text">Universidad Politécnica Salesiana</h4>
                <h5 class="white-text">Práctica de laboratorio 01: Servlets, JSP y JDBC</h5>
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
            © 2020 Copyright Text
            </div>
          </div>
</footer>
</html>