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

import com.ProyectoAlquiler.demo.model.Novedad;
import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.service.NovedadService;
import com.ProyectoAlquiler.demo.service.TipoNovedadService;

@Controller
@RequestMapping("/Novedad")
public class NovedadController {
	
	@Autowired
	private NovedadService novedadService;
	
	@Autowired
	private TipoNovedadService tipoNovedadService;
	
	@GetMapping()
	public String mostrarNovedad(Model modelo) {
		
		List<Novedad> lista = novedadService.listar();
		modelo.addAttribute("listaNovedad",lista);
		Novedad novedad = new Novedad();
		modelo.addAttribute("novedad", novedad);
		List<TipoNovedad> listaTN = tipoNovedadService.listar();
		modelo.addAttribute("listaTN", listaTN);
		return "ListarNovedad";
	}
	/*
	@GetMapping()
	public List<Novedad> listar(){
		return novedadService.listar();
	}*/
	
	@PostMapping("/crear")
	public String crear(@ModelAttribute("novedad")@Valid Novedad novedad) {
		 novedadService.crear(novedad);
		 return "redirect:/Novedad";
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
