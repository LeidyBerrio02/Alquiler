package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.TipoDocumento;

public interface TipoDocumentoService {

	List<TipoDocumento> listarDoc();
	TipoDocumento crear(TipoDocumento tipoDocumento);
	TipoDocumento actualizar(TipoDocumento tipoDocumento, Long idTipoDocumento);
	Boolean eliminar(Long idTipoDocumento);
	
}
