package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.Producto;

public interface ProductoService {

	List<Producto>  listarProd();
	Producto crear(Producto producto);
	Producto buscar(Producto producto);
	Boolean eliminar(Long idProducto);
	String cantidad();
	
}
