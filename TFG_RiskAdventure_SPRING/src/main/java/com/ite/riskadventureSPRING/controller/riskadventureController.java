 package com.ite.riskadventureSPRING.controller;


	
	import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


import com.ite.riskadventureSPRING.modelo.beans.Empresa;
import com.ite.riskadventureSPRING.modelo.beans.Evento;
import com.ite.riskadventureSPRING.modelo.beans.Experiencia;
import com.ite.riskadventureSPRING.modelo.beans.Perfile;
import com.ite.riskadventureSPRING.modelo.beans.Provincia;
import com.ite.riskadventureSPRING.modelo.beans.Reserva;
import com.ite.riskadventureSPRING.modelo.beans.Tipo;
import com.ite.riskadventureSPRING.modelo.beans.Usuario;

import com.ite.riskadventureSPRING.modelo.dao.IntEmpresaDao;
import com.ite.riskadventureSPRING.modelo.dao.IntEventoDao;
import com.ite.riskadventureSPRING.modelo.dao.IntExperienciaDao;
import com.ite.riskadventureSPRING.modelo.dao.IntPerfilDao;
import com.ite.riskadventureSPRING.modelo.dao.IntProvinciaDao;
import com.ite.riskadventureSPRING.modelo.dao.IntReservaDao;
import com.ite.riskadventureSPRING.modelo.dao.IntTipoDao;
import com.ite.riskadventureSPRING.modelo.dao.IntUsuarioDao;
import com.ite.riskadventureSPRING.modelo.dao.TipoDaoImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

	
	@RequestMapping("/riskadventure")
	@Controller
	
	public class riskadventureController  {
		@Autowired
		IntEmpresaDao edao;
		@Autowired
		IntEventoDao evdao;
		@Autowired
		IntTipoDao tdao;
		@Autowired
		IntExperienciaDao exdao;
		@Autowired
		IntProvinciaDao pdao;
		@Autowired
		IntUsuarioDao udao;
		@Autowired
		IntPerfilDao pedao;
		@Autowired
		IntReservaDao rdao;

		//Login
		
		//Controlador pagina inicio-------------------------------------
				@GetMapping("/inicio")
				public String ini() {
					
					
					return "inicio";
					
				}
				@GetMapping("/login")
				public String login() {
					
					
					return "formLogin";
					
				}
		@GetMapping("/index")
		public String procesarLogin(Authentication aut, Model model, HttpSession misesion) {
			
			if(aut!=null) {
				System.out.println("usuario : " + aut.getName());
				System.out.println();
				Usuario usuario=	udao. usuarioPorUser(aut.getName());
				for (GrantedAuthority ele: aut.getAuthorities())
					System.out.println("ROL : " + ele.getAuthority());
				
				model.addAttribute("mensaje", aut.getAuthorities());
				misesion.setAttribute("usuario",usuario);
				
				
				return "redirect:/riskadventure/inicio";
			}else {
				return "redirect:/riskadventure/indexx";
			}
			
		}
		@GetMapping("/indexx")
		public String indexx(Authentication aut, Model model, HttpSession misesion) {
	
			System.out.println("usuario : " + aut.getName());
			System.out.println();
			Usuario usuario=	udao. usuarioPorUser(aut.getName());
			for (GrantedAuthority ele: aut.getAuthorities())
				System.out.println("ROL : " + ele.getAuthority());
			
			model.addAttribute("mensaje", aut.getAuthorities());
			misesion.setAttribute("usuario",usuario);
			
			return "eventos";
		}
		
		@GetMapping("/indexLogin")
		public String indexLogin(Authentication aut, Model model, HttpSession misesion) {
	
			System.out.println("usuario : " + aut.getName());
			System.out.println();
			Usuario usuario=	udao. usuarioPorUser(aut.getName());
			for (GrantedAuthority ele: aut.getAuthorities())
				System.out.println("ROL : " + ele.getAuthority());
			
			model.addAttribute("mensaje", aut.getAuthorities());
			misesion.setAttribute("usuario",usuario);
			
			return "inicio";

		}
		
		
		//logout
		@GetMapping("/logout")
		public String logout(HttpServletRequest request) {
			
				SecurityContextLogoutHandler logoutHandler=new SecurityContextLogoutHandler();
				logoutHandler.logout(request,null,null);
			System.out.println("te has deslogado");
			return "redirect:/riskadventure/inicio";
			
		}
		
		//Controlador de registro--------------------------------------
		@GetMapping("/registro")
		public String mostrarRegistro(Model model) {
			
			
			return "registro";
			
		}
		
		@PostMapping("/registro")
		public String registro(RedirectAttributes ratt, Usuario usuario ) {
			String mensajeAlta;
			System.out.println(usuario);
			usuario.setEnabled(1);
			Date fechaRegistro=new Date();
			usuario.setFechaRegistro(fechaRegistro);
			usuario.setPassword("{noop}"+usuario.getPassword());
			List<Perfile> lista=new ArrayList<Perfile>();
			lista.add(new Perfile(2,"WEB"));
			
			usuario.setPerfiles(lista);
			int registrado=udao.insertarUsuario(usuario);
			System.out.println(registrado);
			if(registrado==1) {
				mensajeAlta="Se ha registrado correctamente.<br> Loguese para acceder a sus reservas";
				System.out.println(mensajeAlta);
				ratt.addFlashAttribute("mensajeAlta", mensajeAlta);
				return "redirect:/riskadventure/login"; 
			}else {
				
				mensajeAlta="No se ha registrado,intentelo de nuevo";
				System.out.println(mensajeAlta);
				ratt.addFlashAttribute("mensajeAlta", mensajeAlta);
				return "registro";
				
			}
			
			
		}
		
		
		//Hola
		//controladores de landings---------------------------------
	
		@GetMapping("/experiencias")
		public String inicio1(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "experiencias";
			
		}
		
		@GetMapping("/tipoAgua")
		public String empresaPorExperienciaAgua(RedirectAttributes ratt,@RequestParam(name = "idExperiencia") int idExperiencia ) {
			ratt.addFlashAttribute("mensaje","Risk Adventure ");
			List<Empresa> listaTipo = edao.verPorExperiencia(idExperiencia);
			ratt.addFlashAttribute("listaTipoAgua", listaTipo);
			
			return "redirect:/riskadventure/agua";
			
		}
		@GetMapping("/agua")
		public String inicio2(Model model) {
			List <Provincia> provincias=pdao.verTodasProvincias();
			List <Experiencia> experiencias=exdao.verTodasExperiencias();
			model.addAttribute("provincias",provincias);
			model.addAttribute("experiencias",experiencias);
			
			return "agua";
			
		}
		
		@PostMapping("/aguaProvincia")
		public String verAguaProvincia(RedirectAttributes ratt,  @RequestParam("idProvincia") int idProvincia, @RequestParam("idExperiencia") int idExperiencia) {
			List<Empresa> empresa=edao.verPorExperienciaProvincia(idProvincia, idExperiencia);
			ratt.addFlashAttribute("empresasProvinciaExperiencia",empresa);

			return "redirect:/riskadventure/agua"; 
			
		}
		
		
		
		
		@GetMapping("/tipoAire")
		public String empresaPorExperienciaAire(RedirectAttributes ratt,@RequestParam(name = "idExperiencia") int idExperiencia ) {
			ratt.addFlashAttribute("mensaje","Risk Adventure ");
			List<Empresa> listaTipo = edao.verPorExperiencia(idExperiencia);
			ratt.addFlashAttribute("listaTipoAire", listaTipo);
			
			return "redirect:/riskadventure/aire";
		}
		
		@GetMapping("/aire")
		public String inicio3(Model model) {
			List <Provincia> provincias=pdao.verTodasProvincias();
			List <Experiencia> experiencias=exdao.verTodasExperiencias();
			model.addAttribute("provincias",provincias);
			model.addAttribute("experiencias",experiencias);
			
			return "aire";
			
		}
		@PostMapping("/aireProvincia")
		public String verAireProvincia(RedirectAttributes ratt,  @RequestParam("idProvincia") int idProvincia, @RequestParam("idExperiencia") int idExperiencia) {
			List<Empresa> empresa=edao.verPorExperienciaProvincia(idProvincia, idExperiencia);
			ratt.addFlashAttribute("empresasProvinciaExperiencia",empresa);
			
			 return "redirect:/riskadventure/aire"; 
			
		}
		
		
		@GetMapping("/tipoTierra")
		public String empresaPorExperienciaTierra(RedirectAttributes ratt,@RequestParam(name = "idExperiencia") int idExperiencia ) {
			ratt.addFlashAttribute("mensaje","Risk Adventure ");
			List<Empresa> listaTipo = edao.verPorExperiencia(idExperiencia);
			ratt.addFlashAttribute("listaTipoTierra", listaTipo);
			
			return "redirect:/riskadventure/tierra";
			
		}
		@GetMapping("/tierra")
		public String inicio4(Model model) {
			List <Provincia> provincias=pdao.verTodasProvincias();
			List <Experiencia> experiencias=exdao.verTodasExperiencias();
			model.addAttribute("provincias",provincias);
			model.addAttribute("experiencias",experiencias);
			
			return "tierra";
			
		}
		//Por Post, recogemos las respuestas de provincia y cargo manualmente el id de Tierra.Provincia es un select
		@PostMapping("/tierraProvincia")
		public String verTierraProvincia(RedirectAttributes ratt,  @RequestParam("idProvincia") int idProvincia, @RequestParam("idExperiencia") int idExperiencia) {
			List<Empresa> empresa=edao.verPorExperienciaProvincia(idProvincia, idExperiencia);
			ratt.addFlashAttribute("empresasProvinciaExperiencia",empresa);
			
			return "redirect:/riskadventure/tierra"; 
			
		}
		
		@GetMapping("/articulos")
		public String inicio5(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "articulos";
			
		}
		
		@GetMapping("/ofertas")
		public String inicio22(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "ofertas";
			
		}
		
		
		@GetMapping("/detalleOferta")
		public String detalleOferta(Model model,@RequestParam(name = "idEvento") int idEvento ) {
			model.addAttribute("mensaje","Risk Adventure ");
			Evento evento = evdao.mostrarEvento(idEvento);
			model.addAttribute("verDetalleEvento", evento);
			
			return "detalleoferta";
			
		}
		
		@GetMapping("/tipoOferta")
		public String oferta(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			List<Evento> listaEvento = evdao.verTodos();
			model.addAttribute("listaOferta", listaEvento);
			
			return "ofertas";
			
		}
		@GetMapping("/tipoOfertaDestacado")
		public String ofertaDestacado(Model model,@RequestParam(name = "destacado") String destacado ) {
			model.addAttribute("mensaje","Risk Adventure ");
			List<Evento> listaEventoDestacado = evdao.verPorDestacado(destacado);
			model.addAttribute("listaOfertaDestacado", listaEventoDestacado);
			
			return "ofertas";
			
		}
		
		
		
		@GetMapping("/aviso_legal")
		public String inicio6(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "aviso_legal";
			
		}
		@GetMapping("/blog")
		public String inicio7(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "blog";
			
		}
		//--------------------------------------------Página de reservas-------------------
		//Acceso
		@GetMapping("/carrito")
		public String inicio8(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "carrito";
			
		}
		//Ver reservas por username
		@GetMapping("/verReservas")
		public String verReservas(String username, Model model,RedirectAttributes ratt, HttpSession sesion) {
			
		    Usuario usuario=(Usuario)sesion.getAttribute("usuario");
			if(usuario!=null) {
			List<Reserva> listaReservas=rdao.verReservas(usuario.getUsername());
			sesion.setAttribute("listaReservas", listaReservas);
			return "redirect:/riskadventure/carrito";
			}else {
				return "redirect:/riskadventure/indexReserva";
			}
		}
		@GetMapping("/indexReserva")
		public String usuariosReserva(Authentication aut, Model model, HttpSession misesion) {
	
			System.out.println("usuario : " + aut.getName());
			System.out.println();
			Usuario usuario=	udao. usuarioPorUser(aut.getName());
			for (GrantedAuthority ele: aut.getAuthorities())
				System.out.println("ROL : " + ele.getAuthority());
			
			model.addAttribute("mensaje", aut.getAuthorities());
			misesion.setAttribute("usuario",usuario);
			
			return "redirect:/riskadventure/verReservas";
		}
		
		//Insertar reserva
		
		@GetMapping("/indexMiReserva")
		public String miReserva(Authentication aut, Model model, HttpSession misesion) {
	
			System.out.println("usuario : " + aut.getName());
			System.out.println();
			Usuario usuario=	udao. usuarioPorUser(aut.getName());
			for (GrantedAuthority ele: aut.getAuthorities())
				System.out.println("ROL : " + ele.getAuthority());
			
			model.addAttribute("mensaje", aut.getAuthorities());
			misesion.setAttribute("usuario",usuario);
			
			return "redirect:/riskadventure/formReserva";
		}		
		@GetMapping("/cogeReserva")
		public String cogereserva(RedirectAttributes ratt, Model model, @RequestParam(name = "idEvento") int idEvento,HttpSession sesionre) {
			Evento miOferta=evdao.mostrarEvento(idEvento);
			
			System.out.println(miOferta.getIdEvento()+"oferta");
			sesionre.setAttribute("miOferta", miOferta);
			Usuario usuario=(Usuario)sesionre.getAttribute("usuario");
			if(usuario!=null) {
				return "formReserva";
			}else {
				return "redirect:/riskadventure/indexMiReserva";
			}
			
		}
		@PostMapping("/insertaReserva")
		public String insertareserva(Model model,Reserva reserva, RedirectAttributes ratt, HttpSession ses) {
			String insertarReserva;
			Usuario user=(Usuario)ses.getAttribute("usuario");
			Evento miEvento=(Evento)ses.getAttribute("miOferta");
			System.out.println(reserva.getObservaciones());
			System.out.println(reserva.getCantidad());
			System.out.println(reserva.getIdReserva());
			
			
			reserva.setUsuario(user);
			System.out.println(reserva.getUsuario().getUsername());
			reserva.setEvento(miEvento);
			System.out.println(reserva.getEvento().getIdEvento());
			reserva.setPrecioVenta(miEvento.getPrecio());
			int reservaOk=rdao.insertarReserva(reserva);
			if(reservaOk==1) {
				insertarReserva = "<b>Reservada oferta</b> con id: ["+reserva.getIdReserva()+"] y nombre: "+reserva.getEvento().getNombre()+" <b>satisfactoriamente</b>";//+reserva.getEvento().getDescripcion();
				ses.setAttribute("insertarReserva",insertarReserva);
			}else {
				insertarReserva = "La oferta: no se reservó ";//+reserva.getEvento().getDescripcion()+" no se pudo reservar";
				ses.setAttribute("insertarReserva",insertarReserva);
			}
			return "redirect:/riskadventure/indexReserva";
			
		}
		//formreserva
		@GetMapping("/formReserva")
		public String formuRes(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "formReserva";
			
		}
		
		//Elimina la reserva con el "id" que le pasemos
		@GetMapping("/eliminareserva/{id}")
		public String eliminarReserva(RedirectAttributes ratt, Model model, @PathVariable(name="id") int  idReserva) {
				
			String mensajedelete;
				
			int eliminado = rdao.eliminarReserva(idReserva);
				
			if(eliminado == 1) {
				mensajedelete = "<span style=\"color: green;\">Se ha eliminado la reserva</span>";
				System.out.println(mensajedelete);
			} else {
				mensajedelete = "<span style=\"color: red;\">Ha habido un error al intentar eliminar la reserva<span>";
				System.out.println(mensajedelete);
			}
				
			ratt.addFlashAttribute("mensajedelete", mensajedelete);
				
			List<Reserva> listado = rdao.verReservas("activo");
			model.addAttribute("listadoActivos", listado);
			return "redirect:/riskadventure/indexReserva";	
			
		}
		
		//Ver todas reservas en el panel admin
		@GetMapping("/todasReservas")
		public String todasReservas(HttpSession sesion) {
			
				List<Reserva> listReservas=rdao.verTodasReservas();
				sesion.setAttribute("listReservas",listReservas);
			
			return "redirect:/riskadventure/adminreservasusuarios";
			
		}
		
		@GetMapping("/adminreservasusuarios")
		public String inicio20(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "adminreservasusuarios";
			
		}
		
		
		//-------------------------------------------------------------
		@GetMapping("/cookies")
		public String inicio10(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "cookies";
			
		}
		@GetMapping("/eventos")
		public String inicio11(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "eventos";
			
		}
		
		@GetMapping("/nosotros")
		public String inicio13(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "nosotros";
			
		}
		@GetMapping("/packs")
		public String inicio14(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "packs";
			
		}
		@GetMapping("/politica_privacidad")
		public String inicio15(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "politica_privacidad";
			
		}
		
		@GetMapping("/vermasblog")
		public String inicio17(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "vermasblog";
			
		}
		

		@GetMapping("/detalleoferta")
		public String inicio18(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "detalleoferta";
			
		}
		
		@GetMapping("/contacto")
		public String inicio19(Model model) {
			model.addAttribute("mensaje","Risk Adventure ");
			
			return "contacto";
			
		}
		//--------------------------------------------Página de ADMIN-------------------
		@GetMapping("/admin")
		public String mostrarActivos(Model model) {
			
			//Muestro los eventos activos
			List<Evento> listado = evdao.buscarEventosActivos("activo");
			model.addAttribute("listadoActivos", listado);
			
			//Cargo en el select de la derecha los Tipos actuales existentes
			List<Tipo> listadoTipos = tdao.verTodos();
			model.addAttribute("listadoTipos", listadoTipos);
			
			return "admin";
			
		}
		
		
		//Método para crear un nuevo evento. Me tengo que traer los tipos para meterlos en el
		//select al final del formulario
		@GetMapping("/create")
		public String nuevoEvento(Model model) {
			
			List<Tipo> listadoTipos = tdao.verTodos();
			model.addAttribute("listadoTipos", listadoTipos);
			List<Empresa> listadoEmpresas=edao.verTodasEmpresas();
			model.addAttribute("listadoEmpresas",listadoEmpresas);
			return "nuevoevento";
		}
		
		//Alta o insert
		//Por Post, recojo las respuestas del formulario una vez relleno
		@PostMapping("/create")
		public /*RedirectView*/String altaEvento(Model model,RedirectAttributes ratt, Evento evento, @RequestParam("efechaInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio) {
			String mensajeinsert;
			
			evento.setEstado("activo");
			evento.setDestacado("s");
			evento.setFechaInicio(fechaInicio);
			
			int altaOk = evdao.crearEvento(evento);
			
			if(altaOk == 1) {
				mensajeinsert = "<span style=\"color: green;\">Evento creado con éxito</span>";
				System.out.println(mensajeinsert);
			} else {
				mensajeinsert = "<span style=\"color: red;\">Ha habido un error al crear el evento<span>";
				System.out.println(mensajeinsert);
			}
			
			ratt.addFlashAttribute("mensajeinsert", mensajeinsert);
			 return "redirect:/riskadventure/admin"; 
			/*return new RedirectView("/riskadventure/activos");*/
		}
		
		
		//Elimina el evento con el "id" que le pasemos
		@GetMapping("/eliminar/{id}")
		public String eliminarEvento(RedirectAttributes ratt, Model model, @PathVariable(name="id") int  idEvento) {
				
			String mensajedelete;
				
			int eliminado = evdao.eliminarEvento(idEvento);
				
			if(eliminado == 1) {
				mensajedelete = "<span style=\"color: green;\">Se ha eliminado el evento</span>";
				System.out.println(mensajedelete);
			} else {
				mensajedelete = "<span style=\"color: red;\">Ha habido un error al intentar eliminar el evento<span>";
				System.out.println(mensajedelete);
			}
				
			ratt.addFlashAttribute("mensajedelete", mensajedelete);
				
			List<Evento> listado = evdao.buscarEventosActivos("activo");
			model.addAttribute("listadoActivos", listado);
			return "redirect:/riskadventure/admin";	
			/*return "admin";*/
		}
		
		
		
		//Pasa los datos del objeto a editar al formulario
		@GetMapping("/editar/{id}")
		public String editarEvento(Model model, @PathVariable(name="id") int  idEvento) {
			String mensajeupdate;
			List<Tipo> listadoTipos = tdao.verTodos();
			model.addAttribute("listadoTipos", listadoTipos);
			List<Empresa> listadoEmpresas=edao.verTodasEmpresas();
			model.addAttribute("listadoEmpresas",listadoEmpresas);
			Evento evento = evdao.mostrarEvento(idEvento);
			
			if(evento == null) {
				mensajeupdate = "<span style=\"color: red;\">Ha habido un error al recuperar el evento<span>";
			}
			
			model.addAttribute("evento", evento);
			return "formEvento";
		}
		//Recibimos los datos del objeto modificado en el formulario y lo actualiza en la bbdd
		@PostMapping("/modificar")
		public String procesarFormularioEditar(RedirectAttributes ratt,Evento evento, @RequestParam("efechaInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio ) {
			
			String mensajeupdate;
			evento.setFechaInicio(fechaInicio);
			int modificado=evdao.modificarEvento(evento);
			
			if(modificado == 1) {
				mensajeupdate = "<span style=\"color: green;\">Se ha modificado el evento</span>";
				System.out.println(mensajeupdate);
			} else {
				mensajeupdate = "<span style=\"color: red;\">Ha habido un error al intentar modificar el evento<span>";
				System.out.println(mensajeupdate);
			}
				
			ratt.addFlashAttribute("mensajeupdate", mensajeupdate);
				
			
			return "redirect:/riskadventure/admin";				 
			 
		}
		
		//Elimina la reserva con el "id" que le pasemos de cualquier usuario
				@GetMapping("/eliminareservausuario/{id}")
				public String eliminarReservaUsuario(RedirectAttributes ratt, Model model, @PathVariable(name="id") int  idReserva) {
						
					String mensajedelete;
						
					int eliminado = rdao.eliminarReserva(idReserva);
						
					if(eliminado == 1) {
						mensajedelete = "<span style=\"color: green;\">Se ha eliminado la reserva</span>";
						System.out.println(mensajedelete);
					} else {
						mensajedelete = "<span style=\"color: red;\">Ha habido un error al intentar eliminar la reserva<span>";
						System.out.println(mensajedelete);
					}
						
					ratt.addFlashAttribute("mensajedelete", mensajedelete);
						
					List<Reserva> listado = rdao.verReservas("activo");
					model.addAttribute("listadoActivos", listado);
					return "redirect:/riskadventure/admin";	
					
				}
		

		
		//Clase que formatea la fecha para que al traerla de un form no de error
		public void initBinder(WebDataBinder binder) {
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
			sdf.setLenient(false);
			binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,false));
			
		}
		
		
		
		
	}


