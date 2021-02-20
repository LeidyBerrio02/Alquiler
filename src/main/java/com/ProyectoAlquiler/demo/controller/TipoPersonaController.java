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
import com.ProyectoAlquiler.demo.model.TipoPersona;
import com.ProyectoAlquiler.demo.service.TipoPersonaService;
@Controller
@RequestMapping("/TipoPersona")
public class TipoPersonaController {
	
	@Autowired
	private TipoPersonaService tipoPersonaService;
	
	
	@GetMapping()
	public String mostrar(Model modelo) {
		List<TipoPersona> tp = tipoPersonaService.listarPer();
		modelo.addAttribute("listaTipoPersona", tp);
		TipoPersona tpersona =  new TipoPersona();
		modelo.addAttribute("tpersona",tpersona);
		return "ListarTipoPersona";
	}
	
	/*@GetMapping()
	public List<TipoPersona> listar(){
		return tipoPersonaService.listarPer();
	}*/
	
	@PostMapping("crear")
	public String crear(@ModelAttribute("tpersona") @Valid TipoPersona tipoPersona) {
		tipoPersonaService.crear(tipoPersona);
		return "redirect:/TipoPersona";
	}
	
	@GetMapping("/actualizar/{idTipoPersona}")
	public String actualizar(Model modelo, TipoPersona tpersona) {
		tpersona = tipoPersonaService.buscar(tpersona);
		 modelo.addAttribute("tpersona", tpersona);
		 //poder mostrar la lista
		 List<TipoPersona> tp = tipoPersonaService.listarPer();
		 modelo.addAttribute("listaTipoPersona", tp);
		 return "ListarTipoPersona";
	}
	
	@GetMapping("/eliminar/{idTipoPersona}")
	public String eliminar(@PathVariable Long idTipoPersona) {
		 tipoPersonaService.eliminar(idTipoPersona);
		 return "redirect:/TipoPersona";
	}

	
	
	
}
