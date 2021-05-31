package com.ite.riskadventureSPRING.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ite.riskadventureSPRING.modelo.beans.Tipo;
import com.ite.riskadventureSPRING.modelo.beans.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
