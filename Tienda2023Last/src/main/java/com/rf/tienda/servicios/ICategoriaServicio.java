package com.rf.tienda.servicios;

import java.util.List;

import com.rf.tienda.dominio.Categoria;
import com.rf.tienda.exception.DomainException;

public interface ICategoriaServicio {
	
	Categoria crear(Categoria categoria) throws DomainException;
	List<Categoria> leerTodos();
	Categoria leerUno(int id_categoria);
	Categoria actualizar(Categoria categoria, int id_categoria) throws DomainException;
	void borrar(int id_categoria);

}
