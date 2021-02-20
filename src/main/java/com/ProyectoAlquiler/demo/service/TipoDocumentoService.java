package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.TipoDocumento;

public interface TipoDocumentoService {

	List<TipoDocumento> listarDoc();
	TipoDocumento crear(TipoDocumento tipoDocumento);
	TipoDocumento buscar(TipoDocumento tipoDocumento);
	Boolean eliminar(Long idTipoDocumento);
	String cantidad();
}
