package com.ProyectoAlquiler.demo.controller;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ProyectoAlquiler.demo.model.Persona;
import com.ProyectoAlquiler.demo.service.PersonaService;

@RestController
@RequestMapping("/Persona")
public class PersonaController {

	//inyeccion de dependencias
	@Autowired
	public PersonaService personaService;
	
	@GetMapping()
	public List<Persona> listar(){
		return personaService.listar();
	}
	
	@PostMapping("/crear")
	public Persona crear(@RequestBody Persona persona) {
		return personaService.crear(persona);
	}
	
	@PutMapping("/actualizar/{idPersona}")
	public Persona actualizar(@PathVariable Long idPersona,@RequestBody Persona persona) {
		return personaService.actualizar(persona,idPersona);
	}
	
	@DeleteMapping("/eliminar/{idPersona}")
	public Boolean eliminar(@PathVariable Long idPersona) {
		return personaService.eliminar(idPersona);
	}
}
