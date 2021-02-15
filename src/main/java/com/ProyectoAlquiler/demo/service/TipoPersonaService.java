package com.ProyectoAlquiler.demo.service;

import java.util.List;	

import com.ProyectoAlquiler.demo.model.TipoPersona;

public interface TipoPersonaService {

	List<TipoPersona> listarPer();
	TipoPersona crear(TipoPersona tipoPersona);
	TipoPersona actualizar(TipoPersona tipoPersona, Long idTipoPersona);
	Boolean eliminar(Long idTipoPersona);
	String cantidad();
	
}
