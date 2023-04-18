package com.rf.tienda.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.rf.tienda.dao.IProductoRepo;
import com.rf.tienda.dominio.Producto;
import com.rf.tienda.exception.DomainException;

@Service
public class ProductoServicio implements IProductoServicio{

	@Autowired
	private IProductoRepo productoRepo;
	@Override
	public Producto crear(Producto id_producto) throws DomainException {
		return productoRepo.save(id_producto);
	}

	@Override
	public List<Producto> leerTodos() {
		// TODO Auto-generated method stub
		return productoRepo.findAll();
	}

	@Override
	public Producto leerUno(String id_producto) {
		return productoRepo.findById(id_producto).get();
	}

	@Override
	public Producto actualizar(Producto producto, String id_producto) throws DomainException {
		Producto aux = this.productoRepo.findById(id_producto).get();
		aux.setId_pais(producto.getId_pais());
		aux.setId_categoria(producto.getId_categoria());
		aux.setPro_cantXUniVenta(producto.getPro_cantXUniVenta());
		aux.setPro_descripcion(producto.getPro_descripcion());
		aux.setPro_desLarga(producto.getPro_desLarga());
		aux.setPro_fecActi(producto.getPro_fecActi());
		aux.setPro_fecDesacti(producto.getPro_fecDesacti());
		aux.setPro_fecRepos(producto.getPro_fecRepos());
		aux.setPro_nStkAlto(producto.getPro_nStkAlto());
		aux.setPro_nStkBajo(producto.getPro_nStkBajo());
		aux.setPro_precio(producto.getPro_precio());
		aux.setPro_stat(producto.getPro_stat());
		aux.setPro_stkReservado(producto.getPro_stkReservado());
		aux.setPro_stock(producto.getPro_stock());
		aux.setPro_uniUltNivel(producto.getPro_uniUltNivel());
		aux.setPro_uniVenta(producto.getPro_uniVenta());
		aux.setPro_usoRecomendado(producto.getPro_usoRecomendado());
		return this.productoRepo.save(aux);
	}

	@Override
	public void borrar(String id_producto) {
		Producto aux = productoRepo.findById(id_producto).get();
		productoRepo.delete(aux);
	}

}
