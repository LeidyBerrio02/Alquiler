package com.ProyectoAlquiler.demo.controller;

import java.util.List;		

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ProyectoAlquiler.demo.model.TipoPersona;
import com.ProyectoAlquiler.demo.service.TipoPersonaService;

@RestController
@RequestMapping("/tipoPersona")
public class TipoPersonaController {
	
	@Autowired
	private TipoPersonaService tipoPersonaService;
	
	@GetMapping()
	public List<TipoPersona> listar(){
		return tipoPersonaService.listarPer();
	}
	

}
