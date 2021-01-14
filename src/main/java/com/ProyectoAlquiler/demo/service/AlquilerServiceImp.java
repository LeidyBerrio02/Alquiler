package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.Alquiler;
import com.ProyectoAlquiler.demo.repository.AlquilerRepository;

@Service
public class AlquilerServiceImp implements AlquilerService {

	@Autowired
	private AlquilerRepository alquilerRepository;
	
	@Override
	public List<Alquiler> listar() {
		// TODO Auto-generated method stub
		return alquilerRepository.findAll();
	}

	@Override
	public Alquiler crear(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return alquilerRepository.save(alquiler);
	}

	@Override
	public Boolean eliminar(Long idAlquiler) {
		if(alquilerRepository.existsById(idAlquiler)) {
			alquilerRepository.deleteById(idAlquiler);
			return true;
		}
		return false;
	}

	@Override
	public Alquiler actualizar(Alquiler alquiler, Long idAlquiler) {
		
		Alquiler alquilerBD = alquilerRepository.findById(idAlquiler).orElse(null);
		if	(alquiler != null) {
			alquilerBD.setFechaAlquiler(alquiler.getFechaAlquiler());
			alquilerBD.setFechaEntrega(alquiler.getFechaEntrega());
			alquilerBD.setIdnovedad(alquiler.getIdnovedad());
			alquilerBD.setIdPersona(alquiler.getIdPersona());
			
		}
		
		return alquilerRepository.save(alquilerBD);
	}

}
