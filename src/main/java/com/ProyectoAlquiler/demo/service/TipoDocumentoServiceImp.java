package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImp implements TipoDocumentoService {

	//inyeccion de dependencias
	@Autowired
	public TipoDocumentoRepository tipoDocumentoRepository;
	
	@Override
	public List<TipoDocumento> listarDoc() {
		// TODO Auto-generated method stub
		return tipoDocumentoRepository.findAll();
	}

	@Override
	public TipoDocumento crear(TipoDocumento tipoDocumento) {
		return tipoDocumentoRepository.save(tipoDocumento);
	}

	@Override
	public TipoDocumento actualizar(TipoDocumento tipoDocumento, Long idTipoDocumento) {
		
		TipoDocumento tipoDocumentoBD = tipoDocumentoRepository.findById(idTipoDocumento).orElse(null);
		if(tipoDocumento != null) {
			tipoDocumentoBD.setTipoDocumento(tipoDocumento.getTipoDocumento());
		}
		
		return tipoDocumentoRepository.save(tipoDocumentoBD);
	}

	@Override
	public Boolean eliminar(Long idTipoDocumento) {
		if(tipoDocumentoRepository.existsById(idTipoDocumento)) {
			tipoDocumentoRepository.deleteById(idTipoDocumento);
			return true;
		}
		return false;
	}

}
