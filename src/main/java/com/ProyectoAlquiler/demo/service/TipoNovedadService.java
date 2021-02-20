package com.ProyectoAlquiler.demo.service;

import java.util.List;		
import com.ProyectoAlquiler.demo.model.TipoNovedad;

public interface TipoNovedadService {

	List<TipoNovedad> listar();
	TipoNovedad crear(TipoNovedad novedad);
	TipoNovedad buscar(TipoNovedad novedad);
	Boolean eliminar(Long idtiponovedad);
	String cantidad();
}
