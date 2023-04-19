package com.rf.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rf.tienda.dominio.Usuario;
import com.rf.tienda.exception.DomainException;
import com.rf.tienda.servicios.IUsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	IUsuarioServicio uDao;
	@GetMapping("/{id}")
	public Usuario leerUno(@PathVariable("id") int id) {
		return uDao.leerUno(id);
		
	}
	@GetMapping
	public List<Usuario> leerTodos() {
		return uDao.leerTodos();
	}
	@PostMapping
	public void nuevo(@RequestBody Usuario u) throws DomainException {
		u.setId_usuario(0);
		uDao.crear(u);
	}
	@DeleteMapping("/{id}")
	public String borrar(@PathVariable("id")int id) {
		uDao.borrar(id);
		return "elemento borrado";
	}
	@PutMapping
	public void actualizar(@RequestBody Usuario u) throws DomainException {
		uDao.actualizar(u, u.getId_usuario());
	}

}
