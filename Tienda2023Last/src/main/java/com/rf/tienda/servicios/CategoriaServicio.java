package com.rf.tienda.servicios;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rf.tienda.dao.ICategoriaRepo;
import com.rf.tienda.dominio.Categoria;
import com.rf.tienda.exception.DomainException;

@Service
public class CategoriaServicio implements ICategoriaServicio{

	@Autowired
	private ICategoriaRepo categoriaRepo;
	@Override
	public Categoria crear(Categoria categoria) throws DomainException {
		return categoriaRepo.save(categoria);
	}

	@Override
	public List<Categoria> leerTodos() {
		// TODO Auto-generated method stub
		return categoriaRepo.findAll();
	}

	
	@Override
	public Categoria leerUno(int id_categoria) {
		return categoriaRepo.findById(id_categoria).get();
		
	}

	@Override
	public Categoria actualizar(Categoria categoria, int id_categoria) throws DomainException {
		Categoria aux = categoriaRepo.findById(id_categoria).get();
		if(Objects.nonNull(categoria.getCat_nombre())&&!"".equalsIgnoreCase(categoria.getCat_nombre())) {
			aux.setCat_nombre(categoria.getCat_nombre());
		}
		if(Objects.nonNull(categoria.getCat_descripcion())&&!"".equalsIgnoreCase(categoria.getCat_descripcion())) {
			aux.setCat_descripcion(categoria.getCat_descripcion());
		}		
		return categoriaRepo.save(aux);
	}

	@Override
	public void borrar(int id_categoria) {
		Categoria aux = categoriaRepo.findById(id_categoria).get();
		categoriaRepo.delete(aux);
		
	}

}
