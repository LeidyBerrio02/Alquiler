package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.Producto;

public interface ProductoService {

	List<Producto>  listarProd();
	Producto crear(Producto producto);
	Producto actualizar(Producto producto , Long idProducto);
	Boolean eliminar(Long idProducto);
	
}
