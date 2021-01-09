package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.service.TipoDocumentoService;

@RestController
@RequestMapping("/tipoDocumento")
public class TipoDocumentoController {

	//inyeccion de dependencias
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@GetMapping()
	public List<TipoDocumento> listar(){
		return tipoDocumentoService.listarDoc();
	}
	
	@PostMapping("crear")
	public TipoDocumento crear(@RequestBody TipoDocumento tipoDocumento) {
		return tipoDocumentoService.crear(tipoDocumento);
	}
	
	

}
