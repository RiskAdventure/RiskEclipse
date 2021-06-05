<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Añadir Reservas de Usuario</title>
	    <meta charset="UTF-8">   
	    <!-- Link to CSS file -->
	    <link href="<c:url value="/css/admin.css" />" rel="stylesheet">
	    <link href="<c:url value="/css/form.css" />" rel="stylesheet">
	    <!--Link to Fontawesome-->
	    <script src="https://kit.fontawesome.com/fc00ef1987.js" crossorigin="anonymous"></script>
	</head>

<body>
		
		
    	<h1>PANEL DE RESERVA</h1>
    	
	    <header>
	        <a href="/riskadventure/admin"><i class="fas fa-arrow-left"></i> Volver</a>
	    </header>
	    
	    <div>
	        <h2>Confirma la cantidad de asistentes y pulse RESERVAR  </h2>
	        <h3>Serás dirigido al panel de reservas para que puedas visualizarla</h3>
	       <form action="/riskadventure/insertaReserva" id="new-event" method="post">
        	
        	<label for="eid">Id de la Reserva:</label><br>
  			<input type="number" id="eid" name="idReserva" value="${reserva.idReserva}"><br><br>
        	<label for="eid">Id de la Oferta:</label><br>
  			<input type="number" id="eid" name="idReserva" value="${reserva.evento.idEvento}"><br><br>
        	
        	<label for="ename">Username:</label><br>
  			<input type="text" id="ename" name="nombre" value="${reserva.usuario.username}"><br><br>
  			
  			<label for="edate">Precio Venta:</label><br>
  			<input type="date" id="edate" name="efechaInicio" value="${evento.fechaInicio}"><br><br>
  			
  			<label for="edescription">Observaciones:</label><br>
  			<textarea id="edescription" name="descripcion" value="${reserva.}">${evento.descripcion}</textarea> <br><br>
  			  			
  			<label for="eduration">Cantidad:</label><br>
  			<input type="number" id="eduration" name="duracion" value="${evento.duracion}"><br><br>
  			
  					
  			<br><br>
  			
  			
 			<button type="submit">RESERVAR <i class="far fa-check-square"></i></button>
        </form>
	       
	       
	       
	       
	       
	       
	       
	       
	        <!--   <table>
	            <tr>
	                <th>id</th>
	                <th>Nombre</th>
	                <th>Descripción</th>
	                <th>Fecha de inicio</th>
	                <th>Duración</th>
	                <th>Dirección</th>
	                <th>Estado</th>
	                <th>Destacado</th>
	                <th>Aforo máximo</th>
	                <th>Asistencia mínima</th>
	                <th>Precio</th>
	            </tr>
		        <tr>
		            <td>${evento.idEvento}</td>
		            <td>${evento.nombre}</td>
		            <td>${evento.descripcion}</td>
		            <td>${evento.fechaInicio}</td>
		            <td>${evento.duracion} hora/s</td>
		            <td>${evento.direccion}</td>
		            <td>${evento.estado}</td>
		            <td>${evento.destacado}</td>
		            <td>${evento.aforoMaximo}</td>
		            <td>${evento.minimoAsistencia}</td>
		            <td>${evento.precio} €</td>
		        </tr>
	        </table>
	        -->
	        <p>${mensaje}</p>
	        
	    </div>
	</body>
</html>