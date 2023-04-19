package com.rf.tienda.servicios;

import java.util.List;

import com.rf.tienda.dominio.Usuario;
import com.rf.tienda.exception.DomainException;

public interface IUsuarioServicio {
	Usuario crear(Usuario usuario) throws DomainException;
	List<Usuario> leerTodos();
	Usuario leerUno(int usuario);
	Usuario actualizar(Usuario usuario, int id_usuario) throws DomainException;
	void borrar(int id_usuario);

}
