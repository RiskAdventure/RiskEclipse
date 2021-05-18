package com.ite.riskadventureSPRING.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ite.riskadventureSPRING.modelo.beans.Tipo;
import com.ite.riskadventureSPRING.modelo.repository.TipoRepository;

public class TipoDaoImpl implements IntTipoDao {
	
	@Autowired
	TipoRepository trepo;

	@Override
	public Tipo verUno(int idTipo) {
		
			return trepo.findById(idTipo).orElse(null);
		}
	

	@Override
	public List<Tipo> verTodos() {
		
		return trepo.findAll();
	}

	@Override
	public List<Tipo> verPorExperiencia(int idExperiencia) {
		
		return trepo.verPorExperiencia(idExperiencia);
	}

}
