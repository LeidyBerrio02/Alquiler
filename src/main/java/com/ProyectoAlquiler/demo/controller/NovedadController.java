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
	
	@GetMapping("/actualizar/{idnovedad}")
	public String actualizarNovedad(Model modelo, Novedad novedad) {
		novedad = novedadService.buscar(novedad);
		modelo.addAttribute("novedad",novedad);
		List<TipoNovedad> listaTN = tipoNovedadService.listar();
		modelo.addAttribute("listaTN", listaTN);
		//para que pueda aparecer la lista
		List<Novedad> lista = novedadService.listar();
		modelo.addAttribute("listaNovedad",lista);
		 return "ListarNovedad";
	}

	@GetMapping("eliminar/{idnxovedad}")
	public String eliminar(@PathVariable Long idNovedad) {
		 novedadService.eliminar(idNovedad);
		 return "redirect:/Novedad";
	}
	
}
