<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Eventos Risk Adventure</title><!-- título-->
    <meta charset="utf-8"><!--juego caracteres del lengiaje-->
    <meta name="keywords" content="Eventos, team building, incentive day, incentivos, despedida, aniversario, empresas, equipos, empleados, jefes"><!-- palabras clave-->
    <meta name="description" content="En Risk Adventure preparamos las mejores experiencias y eventos de empresa de todo tipo, Incentivos, Team Building, Cenas y comidas de empresa con actividades..."><!-- descripción-->
    <meta name="author" content="Raúl Montero, Pilar Bermejo, Lidia Martínez"><!-- autores-->
    <meta name="viewport" content="width=device-width, initial-scale=1"><!-- escla visualización-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script><!--cdn para los iconos fontawesome-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script><!-- cdn para librería jquery-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script><!--cdn para framework bootstrap-->
    <link rel="stylesheet" href="../css/eventoss.css" type="text/css"><!--Enlace externo a CSS-->
    <link rel="icon" type="image/png" href="../imagenes/favicon_risk2.png"><!--Favicon RISK-->
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
        <!-- parte central eventos-->
        <section class="row">
            <!-- imagen eventos team building-->
            <div class="col-md-7 col-xs-12 col-xm-12 eventosempresa">
                <img src="../imagenes/eventos_teambuilding.jpg" alt="team building eventos empresa">
            </div>

            <!-- texto team building-->
            <div class="col-md-5 col-xs-12 col-xm-12 " id="boton_packs">
                <div class="evento">Team Building</div>
                <div class="texto3">¿Necesitas que los compañeros hagan un equipo de verdad?
                    ¿Quieres alcanzar los objetivos de la empresa antes de lo previsto? 
                    ¿Prefieres la solución antes del problema?
                    Ponte en contacto con nosotros y elaboraremos una experiencia a medida...
                </div>
            </div>
        </section>
        <!-- botones ver más y contacto-->
        <section class="row">
            <div class="col-md-12 col-xs-12" id="boton_listo">
                <a href="contacto">
                    <div class="boton_pack" id="contact"> CONTÁCTANOS</div>
                </a>
            </div>
            <!-- imagen partner escapada rural-->
            <div class="col-md-3 col-xs-12 col-xm-12" id="teamb">
                <img src="../imagenes/footer_escapada_rural.jpg" alt="partner escapada rural eventos empresa">
            </div>
            <!-- imagen partner decathlon -->
            <div class="col-md-2 col-xs-12 col-xm-12" id="decathlon">
                <img src="../imagenes/footer_decathlon.png" alt="incentive day eventos empresa"
                    title="imagen decathlon eventos empresa">
            </div>
        </section>
        <section class="row">

            <!-- imagen eventos incentive day -->
            <div class="col-md-7 col-xs-12 col-xm-12 eventosempresa">
                <img src="../imagenes/eventos_incentiveday.jpg" alt="incentive day eventos empresa"
                    title="imagen incentive day eventos empresa">
            </div>

            <!-- texto incentive day -->
            <div class="col-md-5 col-xs-12 col-xm-12 " id="boton_packs">
                <div class="evento">Incentive Day</div>
                <div class="texto3">La motivación de tus empleados es fundamental para que tu empresa vaya viento en
                    popa y consigas las metas que
                    os habéis propuesto alcanzar. Debes mantener el interés, la implicación y el compromiso de tu equipo
                    de trabajo.
                    Por eso te organizamos un día para poner todo esto en práctica, reforzarlo y llevarlo a cabo en el
                    día a día en la empresa....
                </div>
            </div>
            
        </section>
        <!-- botones ver más y contacto-->
        <section class="row">
            <div class="col-md-12" id="boton_evento">
                <a href="contacto">
                    <div class="boton_pack" id="contact"> CONTÁCTANOS</div>
                </a>
            </div>
           <!-- imagen partner merrell-->
           <div class="col-md-3 col-xs-12 col-xm-12" id="merrell">
                <img src="../imagenes/merrell.svg" alt="partner merrell eventos empresa">
            </div>
            <!-- imagen partner the north face -->
            <div class="col-md-2 col-xs-12 col-xm-12" id="north">
                <img src="../imagenes/thenorthface.jpg" alt="incentive day eventos empresa">
            </div>
        </section>
        <section class="row">
            <!-- imagen eventos empresa  -->
            <div class="col-md-7 col-xs-12 col-xm-12 eventosempresa">
                <img src="../imagenes/eventos_empresa.jpg" alt="eventos empresa">
            </div>

            <!-- texto eventos empresa  -->
            <div class="col-md-5 col-xs-12 col-xm-12 " id="boton_packs">
                <div class="evento">Eventos de Empresa</div>
                <div class="texto3">Conectamos tus necesidades con nuestras ideas, entendemos que todos somos diferentes y que existe un tipo de mensaje para cada persona.
                   Nuestra experiencia con cientos de clientes nos avalan. Jornadas para los mas intrépidos, actividades de aventura y team building con la posibilidad de diseñar un evento totalmente personalizado.
                   ¿Te atreves?.
                </div>
            </div>
        </section>
        <!-- botones ver más y contacto-->
        <section class="row">
            <div class="col-md-12" id="boton_incentive">
                <a href="contacto">
                    <div class="boton_pack" id="contact"> CONTÁCTANOS</div>
                </a>
            </div>
            <!-- imagen partner la sportiva -->
            <div class="col-md-7 col-xs-12 col-xm-12" id="sportiva">
                <img src="../imagenes/la_sportiva.jpg" alt="eventos empresa">
            </div>
             <!-- imagen partner restaurant -->
             <div class="col-md-2 col-xs-12 col-xm-12" id="grill">
                <img src="../imagenes/logo_grill.png" alt="incentive day eventos empresa">
            </div>
        </section>
        <!-- efecto bolitas----COMÚN-->
        <hr>
        <section class="row">
            <div class="col-md-12" id="bolitas">
                <div id="bola1" class="bola"></div>
                <div id="bola2" class="bola"></div>
                <div id="bola3" class="bola"></div>
                <div id="bola4" class="bola"></div>
                <div id="bola5" class="bola"></div>
                <div id="bola6" class="bola"></div>
                <div id="bola7" class="bola"></div>
                <div id="bola8" class="bola"></div>
                <div id="bola9" class="bola"></div>
                <div id="bola10" class="bola"></div>
                <div id="bola11" class="bola"></div>
                <div id="bola12" class="bola"></div>
                <div id="bola13" class="bola"></div>
                <div id="bola14" class="bola"></div>
                <div id="bola15" class="bola"></div>
                <div id="bola16" class="bola"></div>
                <div id="bola17" class="bola"></div>
                <div id="bola18" class="bola"></div>
                <div id="bola19" class="bola"></div>
                <div id="bola20" class="bola"></div>
                <div id="bola21" class="bola"></div>
                <div id="bola22" class="bola"></div>
                <div id="bola23" class="bola"></div>
                <div id="bola24" class="bola"></div>
                <div id="bola24" class="bola"></div>
                <div id="bola25" class="bola"></div>
                <div id="bola26" class="bola"></div>
            </div>
        </section>


        <!-- FOOTER-----COMÚN-->
        <footer class="row">
            <!-- Logo risk adventure negativo-->
            <div class="col-md-8 col-xs-8"  id="adventure"><img src="../imagenes/footer_logo.png"></div>
            <!-- sección de contáctanos-->
            <div class="col-md-2 col-xs-2  " id="texto_footer">
                <p>CONTÁCTANOS</p>
            </div>
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
            <div class="col-md-12 col-xs-12 " id="privacidad"> <a href="aviso_legal" id="aviso_legal">Aviso
                    Legal</a> | <a href="politica_privacidad" id="politica_privacidad">Política de privacidad</a> |
                <a href="cookies" id="cookies"> Cookies</a>
            </div>
        </footer>
        <script type="text/javascript" src="../js/eventos.js"></script>
        <!--Enlace externo a archivo JS-->
    </div>
</body>

</html>