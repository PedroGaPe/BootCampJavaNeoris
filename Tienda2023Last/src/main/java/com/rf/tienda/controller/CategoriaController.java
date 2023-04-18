package com.rf.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rf.tienda.dominio.Categoria;
import com.rf.tienda.exception.DomainException;
import com.rf.tienda.servicios.ICategoriaServicio;

@RestController
@RequestMapping ("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaServicio cDao;
	
	@GetMapping("/{id}")
	public Categoria leerUno(@PathVariable("id") int id) {
		return cDao.leerUno(id);
		
	}
	@GetMapping
	public List<Categoria> leerTodos() {
		return cDao.leerTodos();
	}
	@PostMapping
	public void nuevo(@RequestBody Categoria c) throws DomainException {
		c.setId_categoria(0);
		cDao.crear(c);
	}
	@DeleteMapping("/{id}")
	public String borrar(@PathVariable("id")int id) {
		cDao.borrar(id);
		return "elemento borrado";
	}
	@PutMapping
	public void actualizar(@RequestBody Categoria c) throws DomainException {
		cDao.actualizar(c, c.getId_categoria());
	}
}
