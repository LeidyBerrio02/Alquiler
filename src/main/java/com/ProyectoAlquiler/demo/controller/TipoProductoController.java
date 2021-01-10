package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.TipoProducto;
import com.ProyectoAlquiler.demo.service.TipoProductoService;

@RestController
@RequestMapping("/tipoProducto")
public class TipoProductoController {
	
	//Inyeccion de dependencias
	@Autowired
	private TipoProductoService tipoProductoService;
	
	@GetMapping
	public List<TipoProducto> listar(){
		return tipoProductoService.listar();
	}
	

}
