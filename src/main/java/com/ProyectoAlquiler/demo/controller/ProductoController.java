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
import com.ProyectoAlquiler.demo.model.Producto;
import com.ProyectoAlquiler.demo.model.TipoProducto;
import com.ProyectoAlquiler.demo.service.ProductoService;
import com.ProyectoAlquiler.demo.service.TipoProductoService;

@Controller
@RequestMapping("/Producto")
public class ProductoController {

	@Autowired
	public ProductoService productoService;
	
	@Autowired
	public TipoProductoService tipoProductoService;
	
	@GetMapping()
	public String listar(Model modelo){
	
		List<Producto> producto = productoService.listarProd();
		modelo.addAttribute("productos",producto);
		
		return "ListarProducto";
	}
	
	/*
	@GetMapping()
	public List<Producto> listar(){
		return productoService.listarProd();
	}*/
	
	@GetMapping("/FormularioProducto")
	public String c(Model modelo) {
		Producto p = new Producto();
		modelo.addAttribute("producto", p);
		List<TipoProducto> tP = tipoProductoService.listar();
		modelo.addAttribute("tipoProducto", tP);
		return "CrearProducto";
	}
	
	@PostMapping("/crear")
	public String crear(@ModelAttribute("producto")@Valid Producto producto) {
		 productoService.crear(producto);
		 return "redirect:/Producto";
	}
	
	@GetMapping("/actualizar/{idProducto}")
	public String actualizar(Model modelo, Producto producto) {
		 producto = productoService.buscar(producto);
		 modelo.addAttribute("producto",producto);
		 List<TipoProducto> tP = tipoProductoService.listar();
			modelo.addAttribute("tipoProducto", tP);
		 return "CrearProducto";
	}	
	
	@GetMapping("/eliminar/{idProducto}")
	public String eliminar(@PathVariable Long idProducto) {
		 productoService.eliminar(idProducto);
		 return "redirect:/Producto";
	}
	
	
}
