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

import com.ProyectoAlquiler.demo.model.Producto;
import com.ProyectoAlquiler.demo.model.TipoProducto;
import com.ProyectoAlquiler.demo.service.TipoProductoService;

@RestController
@RequestMapping("/tipoProducto")
public class TipoProductoController {
	
	//Inyeccion de dependencias
	@Autowired
	private TipoProductoService tipoProductoService;
	
	@GetMapping
	public List<TipoProducto> listar(){
		return tipoProductoService.listar();
	}
	
	@PostMapping("/crear")
	public TipoProducto crear(@RequestBody TipoProducto tipoProducto) {
		return tipoProductoService.crear(tipoProducto);
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
