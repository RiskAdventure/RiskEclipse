<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <!-- Link to CSS file -->
	    <link href="<c:url value="/css/admin.css" />" rel="stylesheet">
	    <!--Link to Fontawesome-->
	    <script src="https://kit.fontawesome.com/fc00ef1987.js" crossorigin="anonymous"></script>
	</head>

<body>
    <h1>PANEL ADMIN</h1>
  
    <div class="container">
    
    <div class="activos-section">
        <h2>Listado de Ofertas activas</h2>
        
        <a href="/riskadventure/create" class="buttonCTA last">Nueva oferta <i class="far fa-plus-square"></i></a>
        
        <br>
        
        <table>
            <tr>
                <th>id</th>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Opciones</th>
            </tr>
           
           <c:if test="${fn:length(listadoActivos) > 0}">
            
	           <c:forEach var="ele" items="${listadoActivos}" varStatus="estado">
	           
	           	<tr>
	                <td>${ele.idEvento}</td>
	                <td>${ele.nombre}</td>
	                <td>${ele.precio} €</td>
	                <td>
		                <a href="/riskadventure/editar/${ele.idEvento}"><i class="far fa-edit"></i> Editar</a>
		                <a href="/riskadventure/eliminar/${ele.idEvento}"><i class="far fa-trash-alt"></i> Eliminar</a>
	                </td>
	            </tr>
	            
	           </c:forEach>
           
           </c:if>
           
        </table>
        
        <p>${mensaje}</p>
        
        </div>
      
</body>
</html>