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

<title>HOME</title>
</head>
<body>
<!-- Materialize SCRIPT -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

  <nav class="light-blue darken-2">
    <div class="nav-wrapper container">
      <a href="index.jsp" class="brand-logo">Home</a>
      <a href="JSPs/InicioSesion.jsp" >
      <IMG alt="inicioSesion" style="float: right; border-radius: 30%;
      width: 100px; height: 45px; margin-top: 10px; margin-left: 1%;" 
      src="https://lh3.googleusercontent.com/proxy/b-LQ7Uorx6vNwwBDtD7B2K3Qrq5DjW_mwF8tsdjDBsYfSset8sEiHzhcxPOOehR3ve3WOVH0UJjVcuHTrYecwWcK1Dfq-tx6WRN4aCjDFG8P5HjjQ5hRMp6Skc0pc3B0GAw" /></a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
      </ul>
    </div>
  </nav>
  
<div class="container">

<h2>Bienvenido</h2>

        <article class = "articleHardware">
            <h3> Tienda De Hardware </h3>
        </article>
        <aside class="asideVideo">
            <iframe id="video"
            src="https://www.youtube.com/embed/bnct-W1jpOo" style=" float: left; " height="350" width="500"></iframe> 
             <h4> Hardware es la parte física de un ordenador o sistema informático. Está formado por los componentes eléctricos, electrónicos, electromecánicos y mecánicos, tales como circuitos de cables y luz, placas, memorias, discos duros, dispositivos periféricos y cualquier otro material en estado físico que sea necesario para hacer que el equipo funcione. </h4>
        </aside>
		<br>
	<form class="col s12" action="indexControlador" method="POST" >
      		<div class="center">
    			<button class="btn waves-effect waves-light green" type="submit" name="mostrarTabla" value="tabla">MOSTRAR CATALOGO</button>
   			</div>
   			<table>
	  <thead>
		<tr>
			<th>Producto</th>
			<th>Categoria</th>
			<th>Empresa</th>
		</tr>
	</thead>
	<tbody>
		
		<c:forEach var="pr" items="${productos}" varStatus="loop">
		<tr>
			<td>${pr.nombre}</td>
            <td>${categorias[loop.index].nombre}</td>
            <td>${empresas[loop.index].nombre}</td>
         </tr>
		</c:forEach>
		
				
	</tbody>
	</table>
    	</form>
	
</div>  

<footer class="page-footer blue darken-4">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h4 class="white-text">Universidad Politécnica Salesiana</h4>
                <h5 class="labelContacto"> PEDRO ORELLANA </h5>
                <h6 class="labelContacto">Correo: <a href="mailto:porellanaj@est.ups.edu.ec"> porellanaj@est.ups.edu.ec </a>  Telefono: <a href="tel:+59398550859"> 0998550859 </a> </h6>
                <h5 class="labelContacto"> DANEIEL PERALTA </h5>
                <h6 class="labelContacto">Correo: <a href="mailto:peraltadaniel069@gmail.com"> peraltadaniel069@gmail.com </a>  Telefono: <a href="tel:+59395296639"> 0995296639 </a> </h6>
                <h5 class="labelContacto"> DAVID CORNEJO </h5>
                <h6 class="labelContacto">Correo: <a href="mailto:luisdavidcorbra24@gmail.com"> luisdavidcorbra24@gmail.com </a>  Telefono: <a href="tel:+59388372173"> 0988372173 </a> </h6>
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
            © 2020, Universidad Politécnica Salesiana
            </div>
          </div>
</footer>
</html>