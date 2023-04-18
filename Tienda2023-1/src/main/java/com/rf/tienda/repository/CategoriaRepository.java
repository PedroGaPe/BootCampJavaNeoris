package com.rf.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rf.tienda.dominio.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
