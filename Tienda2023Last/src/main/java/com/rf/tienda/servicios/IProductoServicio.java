package com.rf.tienda.servicios;

import java.util.List;

import com.rf.tienda.dominio.Producto;
import com.rf.tienda.exception.DomainException;

public interface IProductoServicio {
	
	Producto crear(Producto producto) throws DomainException;
	List<Producto> leerTodos();
	Producto leerUno(String id_producto);
	Producto actualizar(Producto producto, String id_producto) throws DomainException;
	void borrar(String id_producto);

}
