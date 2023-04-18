package com.rf.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rf.tienda.dominio.Producto;

public interface IProductoRepo extends JpaRepository<Producto, String>{

}
