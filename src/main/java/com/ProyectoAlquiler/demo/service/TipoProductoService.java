package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.TipoProducto;

public interface TipoProductoService {

	List<TipoProducto> listar();
	TipoProducto crear(TipoProducto tipoProducto);
	TipoProducto actualizar(TipoProducto tipoProducto, Long idTipoProducto);
	Boolean eliminar(Long idTipoProducto);
	String cantidad();
}
