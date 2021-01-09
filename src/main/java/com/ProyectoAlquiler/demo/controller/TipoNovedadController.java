package com.ProyectoAlquiler.demo.controller;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.service.TipoNovedadService;

@RestController
@RequestMapping("/tipoNovedad")
public class TipoNovedadController {
	
	@Autowired
	private TipoNovedadService tipoNovedadService;
	
	@GetMapping()
	public List<TipoNovedad> listar(){
		return tipoNovedadService.listar();
	}
	

}
