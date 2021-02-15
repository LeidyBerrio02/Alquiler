package com.ProyectoAlquiler.demo.service;

import java.util.List;

import com.ProyectoAlquiler.demo.model.Persona;

public interface PersonaService {

	List<Persona> listar();
	List<Persona> listaCompleta();
	Persona crear(Persona persona);
	Persona buscar(Persona persona);
	Boolean eliminar(Long idPersona);
	String cantidad();
	
}
