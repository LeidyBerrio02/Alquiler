package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.Novedad;
import com.ProyectoAlquiler.demo.repository.NovedadRepository;

@Service
public class NovedadServiceImp implements NovedadService{

	@Autowired
	public NovedadRepository novedadRespository;
	
	@Override
	public List<Novedad> listar() {
		return novedadRespository.findAll();
	}

	@Override
	public Novedad crear(Novedad novedad) {
		return novedadRespository.save(novedad);
	}

	@Override
	public Novedad actualizar(Novedad novedad, Long idNovedad) {
		Novedad novedadBD = novedadRespository.findById(idNovedad).orElse(null);
		if(novedad != null) {
			novedadBD.setDescripcion(novedad.getDescripcion());
			novedadBD.setIdtiponovedad(novedad.getIdtiponovedad());
		}
		
		return novedadRespository.save(novedadBD);
	}

	@Override
	public Boolean eliminar(Long idNovedad) {
		if(novedadRespository.existsById(idNovedad)) {
			novedadRespository.deleteById(idNovedad);
			return true;
		}
		return false;
	}

	@Override
	public String cantidad() {
		return novedadRespository.cantidad();
	}

}
