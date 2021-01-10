package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.Persona;
import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.model.TipoPersona;
import com.ProyectoAlquiler.demo.repository.PersonaRepository;
import com.ProyectoAlquiler.demo.repository.TipoDocumentoRepository;
import com.ProyectoAlquiler.demo.repository.TipoPersonaRepository;

@Service
public class PersonaServiceImp implements PersonaService {

	//inyeccion de dependencias
	@Autowired
	public PersonaRepository personaRepository;
	
	@Override
	public Boolean eliminar(Long idPersona) {
		if(personaRepository.existsById(idPersona)) {
			personaRepository.deleteById(idPersona);
			return true;
		}
		return false;
	}

	@Override
	public List<Persona> listarPer() {
		return personaRepository.findAll();
	}

	@Override
	public Persona crear(Persona persona) {
		return personaRepository.save(persona);
	}

}
