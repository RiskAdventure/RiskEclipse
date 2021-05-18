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
    <link rel="stylesheet" href="../css/masblog.css" type="text/css"> <!--Enlace externo a CSS-->
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
                <a href="carrito.php"><i class="fa fa-shopping-cart" id="carrito" title="carrito"></i></a>
                <a href="login.php"><i class="fas fa-user" id="login" title="login"></i></a>
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
                    <a class="navbar-brand" href="index.php"><img src="../imagenes/header_logo_peque.png"/></a>
                  </div>
                  <!-- Agrupar los enlaces de navegación, los formularios y cualquier
                  otro elemento que se pueda ocultar al minimizar la barra -->
                  <div class="collapse navbar-collapse navbar-ex1-collapse navbar-right">
                    <ul class="nav navbar-nav">
                      <li><a id="home" href="index.php">HOME</a></li>
                      <li><a id="experiencias" href="experiencias.php">EXPERIENCIAS</a></li>
                      <li><a id="eventos" href="eventos.php">EVENTOS EMPRESA</a></li>
                      <li><a id="packs" href="packs.php">PACKS & GRUPOS</a></li>
                      <li><a id="sobre" href="nosotros.php">NOSOTROS</a></li>
                      <li><a id="blog" href="blog.php">BLOG</a></li>
                      <li><a id="contacto" href="contacto.php">CONTACTO</a></li>
                    </ul>
                  </div>
            </nav>
          </div>
        </header>                                                  
                                                       <!-- SECTION-->
        <section class="row justify-content-center">                                               
         <!-- Mas artículos del blog-->

            <section class="row" id="masblog" >
                <div class="col-md-12" id="blog1">
                    <p>Material adecuado de escalada</p>
                    <img src="../imagenes/masmaterial_escalada.jpg" alt="Artículo blog escalada"></img>
                    <div id="texto3">En la actualidad, para muchas personas, la escalada deportiva es el punto de partida hacia la montaña técnica. <br>
                    Este deporte de aventura supone un riesgo, ya que en cierto modo desafía a la gravedad. Llegar a la cima ya sea en una montaña o en un rocódromo nos hará vivir experiencias emocionantes, sin embargo, para ello deberemos ir bien equipados. <br>
                    <b>Pies de gato</b><br>
                    Este es el tipo de calzado que nos permitirá mantenernos sujetos a la roca. Debemos de saber que es necesario que 
                    se ajusten perfectamente a nuestro pie sin que nos llegue a apretar demasiado. <br>
                    <b>Cuerdas para escalada</b><br>
                    Cada tipo de cuerda tiene un uso, para los principiantes se recomienda una cuerda que tenga un diámetro de entre 
                    10 y 10.5 mm. Es importante que la cuerda se pueda estirar, si escalamos en roca, se recomiendan unos 50 metros ya 
                    que por la fricción y porque estaremos en una etapa de iniciación es probable que la cuerda se desgaste más rápidamente. <br>
                    <b>Arnés</b> <br>
                    Es un elemento esencial de seguridad, sin embargo, además sirve para llevar y transportar nuestro material. Por parte 
                    de Risk Adventure, recomendamos la Black Diamond Momentum para hombre y la BD Primrose para mujer, ya que son muy asequibles en cuanto al precio y bastante cómodas. <br>
                    <b>Mosquetones</b><br>
                    Para practicar escalada, necesitaremos un mosquetón para poder realizar los descensos. Uno de los tipos más usados 
                    es el X de forma oval, sobre todo para los que se están iniciando.<br>
                    <b>Casco de escalada</b><br>
                    El casco es el instrumento más básico, nos protege tanto de caídas de piedras como en el caso de golpes. En Risk 
                    Adventure, recomendamos el casco Black Diamond Half Dome, ajustable y con mucha ventilación. <br>

                    Recuerda llevar un buen grupo para tener al mejor compañero de sujección, no dejes de pasar por nuestras<a href=packs.php> actividades en grupo.</a>
                                     

                        </div>   
                </div>
                <hr>
                <div class="col-md-12" id="blog2">
                    <p>Mejor calzado de Senderismo</p>
                    <img src="../imagenes/mascalzado_senderismo.jpg" alt="Artículo blog senderismo"></img>
                    <div id="texto3">Es importante analizar que factores son importantes a la hora de elegir las mejores zapatillas de trekking. <br>
                        Una de las cosas que debemos tener en cuenta a la hora de comprar una zapatilla de trekking es elegir con buen criterio 
                        el tipo de suela. Esta debería estar hecha por materiales más o menos rígidos, para reforzar su agarre.<br>
                        Una de las ventajas de las zapatillas de trekking es que normalmente son más ligeras y confortables que las botas de montaña,
                        pero a su vez, pierden algo de sujeción en la zona del tobillo. <br>
                        Desde <b>Risk Adventure</b>, recomendamos que el arco de la zapatilla, es decir, la parte superior, sea de nubuck, cuero, malla o 
                        materiales sintéticos y que, sobre todo, para que sea impermeable, se le añada una membrana como Gore-Tex. <br>
                        <b>¿Cómo sabemos si debemos elegir zapatilla de trekking o bota de montaña?</b><br>
                        En senderismo ligero, con poco desnivel, con buenas condiciones climatológicas es recomendable usar zapatillas de trekking, 
                        sin embargo, en caminatas largas, condiciones meteorológicas adversas, terreno irregular de montaña, mochila con peso, será preferible el uso de botas de montaña.  <br>
                        Algunos de los modelos que recomendamos son las Timberland Euro Sprint, unas zapatillas de trekking para todas las rutas de 
                        montaña, la Sportiva TX4 Mid GTX, la cual es muy versátil que nos servirá tanto para practicar senderismo como para la alta 
                        montaña y las Merrell Moab 2 Mid Gore-Tex diseñadas con doble suela, la cual le aporta muchas características técnicas, al 
                        no ser ni muy cálidas ni demasiado frías se pueden adaptar a cualquier estación.<br>
                        Y si no te apetece hacer una ruta, podrás elegir entre nuestras <a href="aire.php">actividades de Aire</a> o nuestras <a href="agua.php">actividades de Agua</a>

                    </div>
                </div>
                <hr>
                <div class="col-md-12" id="blog3">
                    <p>Selección Bicicletas de Montaña 2020</p>
                    <img src="../imagenes/masmountain_bikes.jpg" alt="Artículo blog bicicletas"></img>
                    <div id="texto3">Hoy en día, hay dos elementos que generan cierta incertidumbre entre quienes buscan su primera bicicleta de montaña. La primera cuestión es el tipo de suspensión. Esto nos llevará a realizarnos la pregunta de si es preferible una suspensión rígida o una bicicleta que proporcione una doble suspensión.<br> 
                        Por otra parte, ¿es mejor una bicicleta donde el tamaño de las ruedas sea de mayor diámetro?<br>
                        Las bicicletas de montaña que se caracterizan por tener un sistema de amortiguación más rígido están pensadas para ir a una gran velocidad por zonas sin asfaltar y sin grandes desniveles. <br>
                        Suelen ser <b>bastante ligeras</b> y con respecto al precio, también suelen ser más baratas, ya que su fabricación es muy sencilla, al no tener suspensión trasera hace que nos ahorremos bastantes dolores de cabeza en averías y mantenimiento. <br>
                        Sin embargo, para hacer sendas técnicas, grandes desniveles y rutas largas no son aconsejables. <br>
                        Si hablamos de las bicicletas con doble amortiguación, hablamos de confortabilidad. <br>
                        Estas bicicletas están hechas para absorber las <b>irregularidades del terreno</b>, son mucho más cómodas, pero por el contrario, su peso es mayor en comparación al de una bicicleta rígida. <br>
                        Por otra parte, nos encontramos con la elección del tipo de rueda. <br>
                        Hace unos años dudábamos en montar en ruedas de 26” o 29”. Sin embargo, se ha ido dejando paso al tamaño 29” o incluso de 27,5’’.<br>
                        <b>¿Qué nos aportan?</b><br>
                        Una rueda más pequeña nos facilitará una mayor aceleración, sin embargo, si optamos por una rueda más grande, nos proporcionará mayor estabilidad sobre terrenos abruptos. <br>
                        Podrás disfrutar de esta u otras actividades en nuestras<a href="tierra.php"> actividades de Tierra</a>.
                    </div>
                </div>
                <hr>
                <div class="col-md-12" id="blog4">
                    <p>5 aventureros, 5 amigos...</p>
                    <img src="../imagenes/5amigosblog.jpg" alt="Artículo blog amigos"></img>
                    <div id="texto3"><b>5 aventureros</b> fueron suficientes para hacer crecer un sueño, algo que volaba en la imaginación...sin un destino fijo, ... unos trabajos del FP y un proyecto fin de grado fueron suficientes para hacerlo realidad.<br>
                        Nació con <b>dos aventureras y un pirata del sur</b>, nuestro querido <b>Javi</b>, la alegría, la aventura y la sabiduría.<br>
                        <b>Lili</b>, nuestra joven aventurera, con un expíritu brillante y un empeño sin igual.<br>
                        Y <b>Pilu</b>, servidora, la cabeza pensante aventurera y entusiasta de un proyecto que después de llevar años en mente, se hacía realidad.<br>
                        Con <b>Vero</b> nuestra aventurera detective, construimos el plan de viabilidad de la empresa,... gran plan, la base principal y soporte de toda aventura.<br>
                        Y <b>Raúl</b>, última pieza de este puzzle, aventurero en ejecución de este plan que empezaba a tomar forma con su tremenda dedicación.<br>
                        Cada uno aportando su granito de arena hacíamos un sueño realidad, entusiasmados construyéndolo poco a poco y cada vez teniendo más ganas de que viera la luz,... y con la ilusión de que no se quede simplemente en un proyecto.<br>
                        Nuestros nombres, abreviados tienen 4 letras como RISK, por eso nos arriesgamos y nos lanzamos a la aventura.<br>
                        <b>¿Tendremos Risk Adventure para largo?</b><br><br>

                    </div>
                </div>
                <hr>
                
            </section>        
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
          <div class="col-md-12 col-xs-12 " id="privacidad"> <a href="aviso_legal.php" id="aviso_legal">Aviso Legal</a> | <a href="politica_privacidad.php" id="politica_privacidad">Política de privacidad</a> | <a href="cookies.php" id="cookies"> Cookies</a></div>
        </footer>
      <script type="text/javascript" src="../js/blog.js"></script> <!--Enlace externo a archivo JS-->
    </div> 
  </body>
</html>