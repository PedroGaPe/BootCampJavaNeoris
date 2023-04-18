package com.rf.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rf.tienda.dominio.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria,Integer>{

}
