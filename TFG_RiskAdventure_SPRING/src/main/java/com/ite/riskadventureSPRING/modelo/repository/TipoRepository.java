package com.ite.riskadventureSPRING.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ite.riskadventureSPRING.modelo.beans.Experiencia;
import com.ite.riskadventureSPRING.modelo.beans.Tipo;

public interface TipoRepository  extends JpaRepository<Tipo, Integer>{

	@Query("select t from Tipo t where t.experiencia.idExperiencia=?1")
	public List<Tipo> verPorExperiencia(Experiencia experiencia);

}
