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
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.Producto;
import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.model.TipoPersona;
import com.ProyectoAlquiler.demo.model.TipoProducto;
import com.ProyectoAlquiler.demo.service.TipoProductoService;

@Controller
@RequestMapping("/TipoProducto")
public class TipoProductoController {
	
	//Inyeccion de dependencias
	@Autowired
	private TipoProductoService tipoProductoService;
	
	@GetMapping()
	public String mostrar(Model modelo) {
		List<TipoProducto> tP = tipoProductoService.listar();
		modelo.addAttribute("listaTipoProd", tP);
		TipoProducto tipoP = new TipoProducto();
		modelo.addAttribute("tipoP", tipoP);
		return "ListarTipoProducto";
	}
	/*
	@GetMapping
	public List<TipoProducto> listar(){
		return tipoProductoService.listar();
	}
	*/
	@PostMapping("/crear")
	public String crear(@ModelAttribute("tipoP")@Valid TipoProducto tipoProducto) {
		tipoProductoService.crear(tipoProducto);
		return "redirect:/TipoProducto";
	}
	
	@PutMapping("/actualizar/{idTipoProducto}")
	public TipoProducto actualizar(@PathVariable Long idTipoProducto,@RequestBody TipoProducto tipoProducto) {
		return tipoProductoService.actualizar(tipoProducto, idTipoProducto);
	}	
	
	@DeleteMapping("/eliminar/{idTipoProducto}")
	public Boolean eliminar(Long idTipoProducto) {
		return tipoProductoService.eliminar(idTipoProducto);
	}
	
}
