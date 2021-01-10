package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.Persona;

public interface PersonaService {

	List<Persona> listarPer();
	Persona crear(Persona persona);
	//Persona actualizar(Persona persona, Long idPersona);
	Boolean eliminar(Long idPersona);
	
}
