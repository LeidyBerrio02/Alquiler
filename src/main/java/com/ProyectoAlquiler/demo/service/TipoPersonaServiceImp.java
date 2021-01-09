package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.model.TipoPersona;
import com.ProyectoAlquiler.demo.repository.TipoDocumentoRepository;
import com.ProyectoAlquiler.demo.repository.TipoPersonaRepository;

@Service
public class TipoPersonaServiceImp implements TipoPersonaService {

	//inyeccion de dependencias
	@Autowired
	public TipoPersonaRepository tipoPersonaRepository;
	
	@Override
	public Boolean eliminar(Long idTipoPersona) {
		if(tipoPersonaRepository.existsById(idTipoPersona)) {
			tipoPersonaRepository.deleteById(idTipoPersona);
			return true;
		}
		return false;
	}

	@Override
	public List<TipoPersona> listarPer() {
		return tipoPersonaRepository.findAll();
	}

	@Override
	public TipoPersona crear(TipoPersona tipoPersona) {
		return tipoPersonaRepository.save(tipoPersona);
	}

	@Override
	public TipoPersona actualizar(TipoPersona tipoPersona, Long idTipoPersona) {

		TipoPersona tipoPersonaEnBD = tipoPersonaRepository.findById(idTipoPersona).orElse(null);
		if(tipoPersona != null) {
			tipoPersonaEnBD.setTipoPersona(tipoPersona.getTipoPersona());
		}
		return tipoPersonaRepository.save(tipoPersonaEnBD);
	}

}