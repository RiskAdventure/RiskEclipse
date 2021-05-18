package com.ite.riskadventureSPRING.modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario_perfiles database table.
 * 
 */
@Entity
@Table(name="usuario_perfiles")
@NamedQuery(name="UsuarioPerfile.findAll", query="SELECT u FROM UsuarioPerfile u")
public class UsuarioPerfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioPerfilePK id;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO", insertable=false, updatable=false)
	private Usuario usuario;

	//uni-directional many-to-one association to Perfile
	@ManyToOne
	@JoinColumn(name="ID_PERFIL" , insertable=false, updatable=false)
	private Perfile perfiles;

	public UsuarioPerfile() {
	}

	public UsuarioPerfilePK getId() {
		return this.id;
	}

	public void setId(UsuarioPerfilePK id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Perfile getPerfiles() {
		return this.perfiles;
	}

	public void setPerfiles(Perfile perfiles) {
		this.perfiles = perfiles;
	}

}