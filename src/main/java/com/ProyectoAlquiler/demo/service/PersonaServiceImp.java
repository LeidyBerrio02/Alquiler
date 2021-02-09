package com.ProyectoAlquiler.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.Persona;
import com.ProyectoAlquiler.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImp implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}
	
	@Override
	public List<Persona> listaCompleta(){
		return entityManager.createQuery("select p.idPersona, p.nombre, p.apellido, p.email, p.direccion, tipodocumento.TipoDocumento, p.numeroDocumento, tipopersona.TipoPersona\r\n"
				+ "from persona p\r\n"
				+ "left join tipodocumento on p.tipodocumento_idtipodocumento = tipodocumento.idtipodocumento\r\n"
				+ "left join tipopersona on p.TipoPersona_idTipoPersona = tipopersona.idTipoPersona",Persona.class).getResultList();

		//return entityManager.createQuery("select p from persona p join p.idTipoDocumento d join p.tipopersona_idtipopersona t",Persona.class).getResultList();
	
		//SELECT ph FROM Employee e JOIN e.department d JOIN e.phones ph
		
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
	public Persona buscar(Persona persona) {
		
		//Persona personaBD = personaRepository.findById(idPersona).orElse(null);
		
		/*if(persona != null) {
			personaBD.setApellido(persona.getApellido());
			personaBD.setDireccion(persona.getDireccion());
			personaBD.setEmail(persona.getEmail());
			personaBD.setIdTipoDocumento(persona.getIdTipoDocumento());
			personaBD.setNombre(persona.getNombre());
			personaBD.setNumeroDocumento(persona.getNumeroDocumento());
			personaBD.setTipopersona_idtipopersona(persona.getTipopersona_idtipopersona());
		}
		
		return personaRepository.save(personaBD);
		*/
		return personaRepository.findById(persona.getIdPersona()).orElse(null);
		
	}

}
