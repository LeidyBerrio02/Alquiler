package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.DetalleAlquiler;
import com.ProyectoAlquiler.demo.repository.DetalleAlquilerRepository;

@Service
public class DetalleAlquilerServiceImp implements DetalleAlquilerService {

	@Autowired
	private DetalleAlquilerRepository detalleAlquilerRepository;
	
	@Override
	public List<DetalleAlquiler> listar() {
		// TODO Auto-generated method stub
		return detalleAlquilerRepository.findAll();
	}

	@Override
	public DetalleAlquiler crear(DetalleAlquiler detalleAlquiler) {
		return detalleAlquilerRepository.save(detalleAlquiler);
	}

}
