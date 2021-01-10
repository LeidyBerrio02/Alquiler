package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.Alquiler;

public interface AlquilerService {

	List<Alquiler> listar();
	Alquiler crear(Alquiler alquiler);
	Boolean eliminar(Long idAlquiler);
	
}
