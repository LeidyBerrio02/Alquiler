package com.ProyectoAlquiler.demo.controller;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.service.TipoNovedadService;

@Controller
@RequestMapping("/TipoNovedad")
public class TipoNovedadController {
	
	@Autowired
	private TipoNovedadService tipoNovedadService;
	
	/*@GetMapping()
	public List<TipoNovedad> listar(){
		return tipoNovedadService.listar();
	}*/
	
	@GetMapping()
	public String novedad(Model modelo) {
		List<TipoNovedad> tN = tipoNovedadService.listar();
		modelo.addAttribute("listaTipoNovedad",tN);
		return "ListarTipoNovedad";
		
	}
	
	@PostMapping("/crear")
	public TipoNovedad crear(@RequestBody TipoNovedad tipoNovedad) {
		return tipoNovedadService.crear(tipoNovedad);
	}
	
	@PutMapping("/actualizar/{idTipoNovedad}")
	public TipoNovedad actualizar(@PathVariable Long idtipoNovedad, @RequestBody TipoNovedad tipoNovedad) {
		return tipoNovedadService.actualizar(tipoNovedad, idtipoNovedad);
	}
	
	@DeleteMapping("/eliminar/{idTipoNovedad}")
	public Boolean eliminar(@PathVariable Long idtiponovedad) {
		return tipoNovedadService.eliminar(idtiponovedad);
	}

}
