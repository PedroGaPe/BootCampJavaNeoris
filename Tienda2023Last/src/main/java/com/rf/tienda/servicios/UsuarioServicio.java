package com.rf.tienda.servicios;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rf.tienda.dao.IUsuarioRepo;
import com.rf.tienda.dominio.Usuario;
import com.rf.tienda.exception.DomainException;

@Service
public class UsuarioServicio implements IUsuarioServicio{

	@Autowired
	private IUsuarioRepo usuarioRepo;
	@Override
	public Usuario crear(Usuario usuario) throws DomainException {
		return usuarioRepo.save(usuario);
	}

	@Override
	public List<Usuario> leerTodos() {
		return usuarioRepo.findAll();
	}

	@Override
	public Usuario leerUno(int usuario) {
		return usuarioRepo.findById(usuario).get();
	}

	@Override
	public Usuario actualizar(Usuario usuario, int id_usuario) throws DomainException {
		Usuario aux = usuarioRepo.findById(id_usuario).get();
		
		if(usuario.getUser_dni()!=null && !usuario.getUser_dni().equalsIgnoreCase(""))
			aux.setUser_dni(usuario.getUser_dni());
		
		if(usuario.getUser_email()!=null && !usuario.getUser_email().equalsIgnoreCase(""))
			aux.setUser_email(usuario.getUser_email());
		
		if(usuario.getUser_fecAlta()!=null && !usuario.getUser_fecAlta().equalsIgnoreCase(""))
			aux.setUser_fecAlta(usuario.getUser_fecAlta());
		
		if(usuario.getUser_fecConfirmacion()!=null && !usuario.getUser_fecConfirmacion().equalsIgnoreCase(""))
			aux.setUser_fecConfirmacion(usuario.getUser_fecConfirmacion());
		
		if(usuario.getUser_nombre()!=null && !usuario.getUser_nombre().equalsIgnoreCase(""))
			aux.setUser_nombre(usuario.getUser_nombre());
		
		if(usuario.getUser_pass()!=null && !usuario.getUser_pass().equalsIgnoreCase(""))
			aux.setUser_pass(usuario.getUser_pass());
		
		if(Objects.nonNull(usuario.getUser_tipo()))
			aux.setUser_tipo(usuario.getUser_tipo());
		
		return usuarioRepo.save(aux);
	}

	@Override
	public void borrar(int id_usuario) {
		Usuario aux = usuarioRepo.findById(id_usuario).get();
		usuarioRepo.delete(aux);
	}

}
