package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.DetalleAlquiler;
import com.ProyectoAlquiler.demo.service.DetalleAlquilerService;

@RestController
@RequestMapping("/Detalle")
public class DetalleAlquilerController {

	@Autowired
	private DetalleAlquilerService detalleAlquilerService;
	
	@GetMapping()
	public List<DetalleAlquiler> listar(){
		return detalleAlquilerService.listarDetalle();
	}
}
