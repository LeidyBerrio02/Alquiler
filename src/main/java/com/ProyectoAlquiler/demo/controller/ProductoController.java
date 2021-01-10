package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.Producto;
import com.ProyectoAlquiler.demo.service.ProductoService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@RestController
@RequestMapping("/Producto")
public class ProductoController {

	@Autowired
	public ProductoService productoService;
	
	@GetMapping()
	public List<Producto> listar(){
		return productoService.listarProd();
	}
	
	@PostMapping("/crear")
	public Producto crear(@RequestBody Producto producto) {
		return productoService.crear(producto);
	}
	
	@DeleteMapping("/eliminar")
	public Boolean eliminar(Long idProducto) {
		return productoService.eliminar(idProducto);
	}
	
	
}
