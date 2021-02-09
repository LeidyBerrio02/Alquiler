package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ProyectoAlquiler.demo.model.Persona;
import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.model.TipoPersona;
import com.ProyectoAlquiler.demo.service.PersonaService;
import com.ProyectoAlquiler.demo.service.TipoDocumentoService;
import com.ProyectoAlquiler.demo.service.TipoPersonaService;

@Controller
@RequestMapping("/Persona")
public class PersonaController {

	//inyeccion de dependencias
	@Autowired
	public PersonaService personaService;
	
	@Autowired
	public TipoDocumentoService tipoDocumentoService;
	
	@Autowired
	public TipoPersonaService tipoPersonaService;
	
	@GetMapping()
	public String persona(Model modelo) {
		modelo.addAttribute("persona", new Persona());
		List<Persona> persona = personaService.listar();
		List<TipoDocumento> tipoDoc = tipoDocumentoService.listarDoc();
		List<TipoPersona> tipoPer = tipoPersonaService.listarPer();
		modelo.addAttribute("tipoDoc",tipoDoc);
		modelo.addAttribute("tipoPer", tipoPer);
		modelo.addAttribute("personas", persona); 
		return "ListarPersona";
	}
	
	/*@GetMapping()
	public List<Persona> listar(){
		return personaService.listar();
	}*/
	
	@GetMapping("/mostrarFormulario")
	public String goPersona(Model modelo) {
		Persona persona = new Persona();
		modelo.addAttribute("persona", persona);
		List<TipoDocumento> tipoDoc = tipoDocumentoService.listarDoc();
		List<TipoPersona> tipoPer = tipoPersonaService.listarPer();
		modelo.addAttribute("tipoDoc",tipoDoc);
		modelo.addAttribute("tipoPer", tipoPer);
		return "CrearPersona";
	}  
	
	@PostMapping("/crear")
	public String crear(@ModelAttribute("persona")@Valid Persona persona) {
		 personaService.crear(persona);
		 return "redirect:/Persona";
	}
	
	@GetMapping("/actualizar/{idPersona}")
	public String actualizar(Model modelo, Persona persona) {
		 persona = personaService.buscar(persona);
		 modelo.addAttribute("persona", persona);
		 List<TipoDocumento> tipoDoc = tipoDocumentoService.listarDoc();
			List<TipoPersona> tipoPer = tipoPersonaService.listarPer();
			modelo.addAttribute("tipoDoc",tipoDoc);
			modelo.addAttribute("tipoPer", tipoPer);
				return "CrearPersona";
		
	}
	
	@GetMapping("/eliminar/{idPersona}")
	public String eliminar(@PathVariable Long idPersona) {
		 
				personaService.eliminar(idPersona);
				return "redirect:/Persona";
	}
}
