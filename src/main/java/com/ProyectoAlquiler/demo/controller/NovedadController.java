package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.Novedad;
import com.ProyectoAlquiler.demo.service.NovedadService;

@RestController
@RequestMapping("/Novedad")
public class NovedadController {
	
	@Autowired
	private NovedadService novedadService;
	
	@GetMapping()
	public List<Novedad> listar(){
		return novedadService.listar();
	}
	
	@PostMapping("/crear")
	public Novedad crear(@RequestBody Novedad novedad) {
		return novedadService.crear(novedad);
	}
	
	@PutMapping("/actualizar/{idNovedad}")
	public Novedad actualizarNovedad(@PathVariable Long idNovedad, @RequestBody Novedad novedad) {
		return novedadService.actualizar(novedad, idNovedad);
	}

	@DeleteMapping("eliminar/{idNovedad}")
	public Boolean eliminar(@PathVariable Long idNovedad) {
		return novedadService.eliminar(idNovedad);
	}
	
}
