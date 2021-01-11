package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.Persona;

public interface PersonaService {

	List<Persona> listar();
	Persona crear(Persona persona);
	Boolean eliminar(Long idPersona);
	
}
