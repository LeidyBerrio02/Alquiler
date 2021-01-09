package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.Novedad;
import com.ProyectoAlquiler.demo.service.NovedadService;

@RestController
@RequestMapping("/")
public class NovedadController {
	
	@Autowired
	private NovedadService novedadService;
	
	@GetMapping()
	public List<Novedad> listar(){
		return novedadService.listar();
	}
	

}
