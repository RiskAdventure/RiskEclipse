package com.ite.riskadventureSPRING.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ite.riskadventureSPRING.modelo.beans.Tipo;

public interface TipoRepository  extends JpaRepository<Tipo, Integer>{

	

}
