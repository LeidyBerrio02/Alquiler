package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.Alquiler;
import com.ProyectoAlquiler.demo.model.DetalleAlquiler;
import com.ProyectoAlquiler.demo.service.AlquilerService;
import com.ProyectoAlquiler.demo.service.DetalleAlquilerService;

@Controller
@RequestMapping("/Detalle")
public class DetalleAlquilerController {

	@Autowired
	public DetalleAlquilerService detalleAlquilerService;
	
	@Autowired 
	public AlquilerService alquilerService;
	
	@GetMapping()
	public String listarD(Model modelo){
		List<DetalleAlquiler> listaDA = detalleAlquilerService.listar();
		List<Alquiler> listaA = alquilerService.listar();
		modelo.addAttribute("listaA", listaA);
		modelo.addAttribute("listaD", listaDA);
		return "ListarAlquiler";
	}
	
}
