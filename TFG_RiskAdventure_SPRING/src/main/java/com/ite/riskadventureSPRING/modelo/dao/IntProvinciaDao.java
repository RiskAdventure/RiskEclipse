package com.ite.riskadventureSPRING.modelo.dao;

import java.util.List;

import com.ite.riskadventureSPRING.modelo.beans.Provincia;

public interface IntProvinciaDao {

	Provincia verUnaProvincia(int idProvincia);
	List<Provincia> verTodasProvincias();
}
