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
	
	@PutMapping("/actualizar/{idtipoPersona}")
	public TipoPersona actualizar(@PathVariable Long idtipoPersona,@RequestBody TipoPersona tipoPersona) {
		return tipoPersonaService.actualizar(tipoPersona,idtipoPersona);
	}
	
	@DeleteMapping("/eliminar/{idtipoPersona}")
	public Boolean eliminar(@PathVariable Long idtipoPersona) {
		return tipoPersonaService.eliminar(idtipoPersona);
	}

}
