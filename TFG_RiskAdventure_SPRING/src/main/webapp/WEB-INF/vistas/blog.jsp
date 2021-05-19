<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Blog Risk Adventure</title><!-- título-->
    <meta charset="utf-8"> <!--juego caracteres del lengiaje-->
    <meta name="keywords" content="blog, artículos, multiaventura, material deportivo, alojamientos, gastronomía, restaurantes, recomendaciones, aventura"><!-- palabras clave-->
    <meta name="description" content="Blog donde te contamos todas las experiencias de aventura, te recomendamos material deportivo, te hablamos de gastronomía y alojamiento para poder completar tu pack de multiaventura"><!-- descripción-->
    <meta name="author" content="Raúl Montero, Pilar Bermejo, Lidia Martínez"><!-- autores-->
    <meta name="viewport" content="width=device-width, initial-scale=1"><!-- escla visualización-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script> <!--cdn para los iconos fontawesome-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script><!-- cdn para librería jquery-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script><!--cdn para framework bootstrap-->
    <link rel="stylesheet" href="../css/blog.css" type="text/css"> <!--Enlace externo a CSS-->
    <link rel="icon" type="image/png" href="../imagenes/favicon_risk2.png" sizes="64x64"><!--Favicon RISK-->
  </head>
  <body>

    <!-- va todo el documento dentro de una caja con clase container que mediante Bootstrap nos permitirá hacer
     nuestra página responsive y que se adapte a diferentes tamaños de pantalla. Para ello nos serviremos también
      de las media queries @-->
      <div class="container">
                                                      <!-- HEADER----COMUN-->
        <!-- iconos-->
        <header>
          <div class="row" id="icon">
              <div id="iconos" class="col-md-12 col-xs-12 ">
                <a href="carrito"><i class="fa fa-shopping-cart" id="carrito" title="carrito"></i></a>
                <a href="login"><i class="fas fa-user" id="login" title="login"></i></a>
                <i class="fas fa-search" id="buscar" title="buscar"></i>
              </div>
          </div>
          
         <!-- menu ------------NAV INTEGRADO EN EL HEADER---COMÚN-->
          <div class="row" id="nav"> 
            <nav class="navbar navbar-default" role="navigation" id="menu">
                  <!-- El logotipo y el icono que despliega el menú se agrupan
                      para mostrarlos mejor en los dispositivos móviles -->
                  <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target=".navbar-ex1-collapse">
                      <span class="sr-only">Desplegar navegación</span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index"><img src="../imagenes/header_logo_peque.png"/></a>
                  </div>
                  <!-- Agrupar los enlaces de navegación, los formularios y cualquier
                  otro elemento que se pueda ocultar al minimizar la barra -->
                  <div class="collapse navbar-collapse navbar-ex1-collapse navbar-right">
                    <ul class="nav navbar-nav">
                      <li><a id="home" href="index">HOME</a></li>
                      <li><a id="experiencias" href="experiencias">EXPERIENCIAS</a></li>
                      <li><a id="eventos" href="eventos">EVENTOS EMPRESA</a></li>
                      <li><a id="packs" href="packs">PACKS & GRUPOS</a></li>
                      <li><a id="sobre" href="nosotros">NOSOTROS</a></li>
                      <li><a id="blog" href="blog">BLOG</a></li>
                      <li><a id="contacto" href="contacto">CONTACTO</a></li>
                    </ul>
                  </div>
            </nav>
          </div>
        </header>                                                  
                                                       <!-- SECTION-->
                                                       
         <!-- parte INFERIOR enlace blog-->
         <section class="row" >
        <!-- imagen blog-->
            
            <!-- texto enlace a blog-->
            <div class="col-md-12 col-xs-12 col-xm-12 " id="textoblog" > 
                <div id="tituloblog">Que te vamos a contar aquí...</div>
                <div id="texto3">Vamos a hablarte de <b>experiencias, de anécdotas, de proveedores, de seguridad, de calidad, de turismo,...</b> de todo lo que puede acompañar a tu actividad.
                    Todas las experiencias tienen algo que contar. En nuestra secciones del Blog, te hablaremos sobre nuestras experiencias de <b>Tierra, Agua y Aire</b>. Vamos a hablarte de 
                    cada uno de los servicios que ofrecen nuestras Empresas de Multiaventura, también vamos a hablarte de los productos que te ofrecen nuestros partners para que tus escapadas
                    y experiencias sean <b>100% cómodidad y seguridad</b>. <br>
                    Nuestros expertos te darán recomendaciones de como afrontar mejor las aventuras y disfrutar en todo momento de lo que estás haciendo, sin que tengas que preocuparte de otra 
                    cosa que no sea <b>adentrarte en la aventura y poner a prueba todos los sentidos</b>.
                    También, preocupados por tu seguridad te darán recomendaciones de las cosas que debes y no debes hacer, porque nuestra precoupación es que las experiencias que detallamos
                    sean seguras siempre.<br>
                    Podrás ponerte en contacto con nuestro Centro de Atención al Aventurero para consultar cualquier duda que tengas o si quieres que hablemos de algo especial en el blog, o que te 
                    demos más información,...puedes hacernos cualquier consulta.
                    También daremos <b>"Charlas de Expertos"</b> todos los meses de las que te avisaremos en el blog para que puedas estar pendiente, si te suscribes, te mandaremos un recordatorio.
                </div>
            </div>
            <section class="row" id="imagenes2" >
                <div class="col-md-3" id="blog1">
                    <img src="../imagenes/material_escalada.jpg""></img>
                    <a href="vermasblog.php"><p>Material adecuado de escalada</p></a>
                    
                </div>
                <div class="col-md-3" id="blog2">
                    <img src="../imagenes/calzado_senderismo.jpg""></img>
                    <a href="vermasblog.php"><p>Mejor calzado de Senderismo</p></a>
                </div>
                <div class="col-md-3" id="blog3">
                    <img src="../imagenes/mountain_bikes.jpg""></img>
                    <a href="vermasblog.php"><p>Selección Bicicletas de Montaña 2020</p></a>
                </div>
                <div class="col-md-3" id="blog4">
                    <img src="../imagenes/5amigos.jpg"></img>
                    <a href="vermasblog.php"><p>5 aventureros, 5 compañeros...</p></a>
                </div>
                
            </section> 

             <!-- botón central inferior blog-->
             <section class="row" >
                <div class="col-md-12 col-xs-12 col-xm-12 " id="boton_blog" > 
                <a href="vermasblog"><div  class="boton_blog_centro"> VER MÁS ARTÍCULOS</div></a>
                </div>
            </section>
        

      
        
       <!-- FOOTER-----COMÚN-->
        <footer class="row" >
            <!-- Logo risk adventure negativo-->
            <div class="col-md-8 col-xs-8"  id="adventure"><img src="../imagenes/footer_logo.png"></div>
            <!-- sección de contáctanos-->
            <div class="col-md-2 col-xs-2  " id="texto_footer"><p>CONTÁCTANOS</p></div>
            <div class="col-md-4 col-xs-4 " id="contacto_footer">
            <div id="dire">
                <p class="texto_contacto">Dirección :</p>
                <p>123 Avenida de Bolonia, Madrid</p>
              </div>
              <div id="email">
                <p class="texto_contacto">Email :</p>
                <p>info@riskadventureclub.com</p>
              </div>
              <div>
                <p class="texto_contacto">Teléfono :</p>
                <p>(+34)677 899 900</p>
              </div>
            </div>
          <!-- Logos publicitarios-->  
          <div class="col-md-12 col-xs-12" id="publi">
              <a href="https://eu.oneill.com/"><img src="../imagenes/footer_oneill.png" id="oneill"/></a>
              <a href="https://www.columbia.com/"><img src="../imagenes/footer_columbias.jpg" id="columbia"/></a>
              <a href="https://www.escapadarural.com/"><img src="../imagenes/footer_escapada_rural.jpg" id="escapada"/></a>
              <a href="https://www.lasportiva.com/es"><img src="../imagenes/footer_la_esportiva.jpg" id="esportiva"/></a>
              <a href="https://www.decathlon.es/es/"><img src="../imagenes/footer_decathlon.png" id="decathlon"/></a>
              <a href="http://www.bardis.com/"><img src="../imagenes/footer_restaurante.jpg" id="restaurante"/></a>
          </div>
          <!-- iconos redes sociales y texto copyright-->
          <div class="col-md-12 col-xs-12" id="redes">
              <p>Síguenos en:</p>
              <a href="https://m.facebook.com/adventurerisk/"><i class="fab fa-facebook-f" id="face" title="facebook"></i></a>
              <a href="https://www.instagram.com/riskadventure/"><i class="fab fa-instagram" title="instagram"></i></a>
              <a href="https://cutt.ly/UvIKPOG"><i class="fab fa-whatsapp" title="whatsapp"></i></a>
              <a href="https://twitter.com/adventurerisk"><i class="fab fa-twitter" title="twitter"></i></a>
              <p>2020 © Copyright</p>
          </div>
          <hr>
                                    <!-- efecto bolitas---COMÚN-->  
          
          <!--enlaces a aviso legal, política de privacidad y cookies--> 
          <div class="col-md-12 col-xs-12 " id="privacidad"> <a href="aviso_legal" id="aviso_legal">Aviso Legal</a> | <a href="politica_privacidad" id="politica_privacidad">Política de privacidad</a> | <a href="cookies" id="cookies"> Cookies</a></div>
        </footer>
      <script type="text/javascript" src="../js/blog.js"></script> <!--Enlace externo a archivo JS-->
    </div> 
  </body>
</html>