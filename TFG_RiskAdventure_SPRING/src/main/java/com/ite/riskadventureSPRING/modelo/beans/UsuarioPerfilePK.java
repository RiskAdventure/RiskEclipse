package com.ite.riskadventureSPRING.modelo.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the usuario_perfiles database table.
 * 
 */
@Embeddable
public class UsuarioPerfilePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_USUARIO", insertable=false, updatable=false)
	private int idUsuario;

	@Column(name="ID_PERFIL", insertable=false, updatable=false)
	private int idPerfil;

	public UsuarioPerfilePK() {
	}
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdPerfil() {
		return this.idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuarioPerfilePK)) {
			return false;
		}
		UsuarioPerfilePK castOther = (UsuarioPerfilePK)other;
		return 
			(this.idUsuario == castOther.idUsuario)
			&& (this.idPerfil == castOther.idPerfil);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUsuario;
		hash = hash * prime + this.idPerfil;
		
		return hash;
	}
}