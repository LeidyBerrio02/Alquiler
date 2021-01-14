package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.Persona;
import com.ProyectoAlquiler.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImp implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	public Persona crear(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	public Boolean eliminar(Long idPersona) {
		if(personaRepository.existsById(idPersona)) {
			personaRepository.deleteById(idPersona);
			return true;
		}
		return false;
	}

	@Override
	public Persona actualizar(Persona persona, Long idPersona) {
		
		Persona personaBD = personaRepository.findById(idPersona).orElse(null);
		
		if(persona != null) {
			personaBD.setApellido(persona.getApellido());
			personaBD.setDireccion(persona.getDireccion());
			personaBD.setEmail(persona.getEmail());
			personaBD.setIdTipoDocumento(persona.getIdTipoDocumento());
			personaBD.setNombre(persona.getNombre());
			personaBD.setNumeroDocumento(persona.getNumeroDocumento());
			personaBD.setTipopersona_idtipopersona(persona.getTipopersona_idtipopersona());
		}
		
		return personaRepository.save(personaBD);
	}

}
