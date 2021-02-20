package com.ProyectoAlquiler.demo.controller;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProyectoAlquiler.demo.model.Alquiler;
import com.ProyectoAlquiler.demo.service.AlquilerService;

@Controller
@RequestMapping("/Alquiler")
public class AlquilerController {
	
	@Autowired
	private AlquilerService alquilerService;
	
	@GetMapping()
	public List<Alquiler> listar(){
		return alquilerService.listar();
	}
	
	@PostMapping("/crear")
	public Alquiler crear(@RequestBody Alquiler alquiler) {
		return alquilerService.crear(alquiler);
	}
	
	@PutMapping("/actualizar/{idAlquiler}")
	public Alquiler actualizar(@PathVariable Long idAlquiler,@RequestBody Alquiler alquiler) {
		return alquilerService.actualizar(alquiler, idAlquiler);
	}
	
	@GetMapping("/eliminar/{idAlquiler}")
	public String eliminar(@PathVariable Long idAlquiler) {
		 alquilerService.eliminar(idAlquiler);
		 return "redirect:/Detalle";
	}

}
