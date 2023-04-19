package com.rf.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rf.tienda.dominio.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

}
