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
import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.service.TipoNovedadService;

@RestController
@RequestMapping("/tipoNovedad")
public class TipoNovedadController {
	
	@Autowired
	private TipoNovedadService tipoNovedadService;
	
	@GetMapping()
	public List<TipoNovedad> listar(){
		return tipoNovedadService.listar();
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
