package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.repository.TipoNovedadRepository;

@Service
public class TipoNovedadServiceImp implements TipoNovedadService {

	@Autowired
	public TipoNovedadRepository tipoNovedadRepository;
	
	@Override
	public List<TipoNovedad> listar() {
		return tipoNovedadRepository.findAll();
	}

	@Override
	public TipoNovedad crear(TipoNovedad tNovedad) {
		return tipoNovedadRepository.save(tNovedad);
	}

	@Override
	public TipoNovedad actualizar(TipoNovedad tNovedad, Long idtiponovedad) {
		TipoNovedad tNovedadEnBD = tipoNovedadRepository.findById(idtiponovedad).orElse(null);
		if(tNovedad != null) {
			tNovedadEnBD.setNovedad(tNovedad.getNovedad());
		}
		
		return tipoNovedadRepository.save(tNovedadEnBD);
	}
	
	@Override
	public Boolean eliminar(Long idtiponovedad) {
		if(tipoNovedadRepository.existsById(idtiponovedad)) {
			tipoNovedadRepository.deleteById(idtiponovedad);
			
			return true;
		}
		return false;
	}

	@Override
	public String cantidad() {
		// TODO Auto-generated method stub
		return tipoNovedadRepository.cantidad();
	}

}
