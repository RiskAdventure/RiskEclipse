<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>



<!DOCTYPE html>
<html>
	<head>
	<title>Panel Administración | VER RESERVAS</title>
	    <meta charset="UTF-8">
	    <!-- Link to CSS file -->
	    <link href="<c:url value="/css/admin.css" />" rel="stylesheet">
	    <!--Link to Fontawesome-->
	    <script src="https://kit.fontawesome.com/fc00ef1987.js" crossorigin="anonymous"></script>
	</head>

<body>

	
	<a class="navbar-brand" href="index"><img src="../imagenes/header_logo_peque2.png"/></a>
	<div class="row" id="icon">
              <div id="iconos" class="col-md-12 col-xs-12 ">
				
                <i class="fas fa-user-cog"></i>${usuario.username}
                <a href="/riskadventure/logout"><i class="fas fa-sign-out-alt" id="logout" title="logout"></i></a>

              </div>
    <h1>PANEL ADMINISTRADOR</h1>
    
    	 <header>
	      <a href="/riskadventure/admin"><i class="fas fa-arrow-left"></i> Volver</a>
	    </header>
  
    <div class="container">
    
    <div class="activos-section">
        <h2>Listado de Reservas de todos los usuarios</h2>
        

        <p>${mensajedelete}</p>
        <p>${mensajeinsert}</p>
        <p>${mensajeupdate }</p>
        
        <br>
 
        
        <table>
            
           
           <c:choose>
				        <c:when test="${listReservas!=null && listReservas.size()!=0}">
					        <table border="2">
					        	<th>Id Reserva</th>
					        	<th>Id Evento</th>
					        	<th>Username</th>
					        	<th>Precio Venta</th>
					        	<th>Observaciones</th>
					        	<th>Cantidad</th>
					        	<th>Eliminar</th>
					        	<c:forEach var="ele" items="${listReservas }">
					        		<tr>
					        			<td>${ele.idReserva}</td>
					        			<td>${ele.evento.idEvento}</td>
					        			<td>${ele.usuario.username}</td>
					        			<td>${ele.precioVenta}</td>
					        			<td>${ele.observaciones}</td>
					        			<td>${ele.cantidad}</td>
					        			<td><a class="trash" href="/riskadventure/eliminareserva/${ele.idReserva}">Eliminar</a></td>
					        			
					        		</tr>					        		
					        	</c:forEach>					        	
					        </table><br>
					
				        </c:when>

			        </c:choose>
           
        </table>
        
        
        </div>
    </div>  
</body>
</html>