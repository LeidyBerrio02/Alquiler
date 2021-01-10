package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.Persona;
import com.ProyectoAlquiler.demo.service.PersonaService;

@RestController
@RequestMapping("/Persona")
public class PersonaController {

	//inyeccion de dependencias
	public PersonaService personaService;
	
	@GetMapping()
	public List<Persona> listar(){
		return personaService.listarPer();
	}
	
	@PostMapping("crear")
	public Persona crear(@RequestBody Persona persona) {
		return personaService.crear(persona);
	}
	
	
}
