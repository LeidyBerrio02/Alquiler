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
import com.ProyectoAlquiler.demo.service.ProductoService;

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
	
	@PutMapping("/actualizar/{idProducto}")
	public Producto actualizar(@PathVariable Long idProducto,@RequestBody Producto producto) {
		return productoService.actualizar(producto, idProducto);
	}	
	
	@DeleteMapping("/eliminar/{idProducto}")
	public Boolean eliminar(@PathVariable Long idProducto) {
		return productoService.eliminar(idProducto);
	}
	
	
}
