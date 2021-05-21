package com.ite.riskadventureSPRING.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ite.riskadventureSPRING.modelo.beans.Empresa;
import com.ite.riskadventureSPRING.modelo.beans.Tipo;
import com.ite.riskadventureSPRING.modelo.repository.EmpresaRepository;
@Service
public class EmpresaDaoImpl implements IntEmpresaDao {
	@Autowired
	EmpresaRepository erepo;


	@Override
	public List<Empresa> verTodasEmpresas() {
		
		return erepo.findAll();
		}


	@Override
	public List<Empresa> verPorProvincia(int idProvincia) {
		
		return erepo.verPorProvincia(idProvincia);
		
		
		
	}
	@Override
	public List<Empresa> verPorExperiencia(int idExperiencia) {
		
		return  erepo.verPorExperiencia(idExperiencia);
	}

}
