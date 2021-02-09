package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoAlquiler.demo.model.Alquiler;
import com.ProyectoAlquiler.demo.model.DetalleAlquiler;
import com.ProyectoAlquiler.demo.model.Novedad;
import com.ProyectoAlquiler.demo.model.Producto;
import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.service.AlquilerService;
import com.ProyectoAlquiler.demo.service.DetalleAlquilerService;
import com.ProyectoAlquiler.demo.service.NovedadService;
import com.ProyectoAlquiler.demo.service.ProductoService;
import com.ProyectoAlquiler.demo.service.TipoNovedadService;

@Controller
@RequestMapping("/Detalle")
public class DetalleAlquilerController {

	@Autowired
	public DetalleAlquilerService detalleAlquilerService;
	
	@Autowired 
	public AlquilerService alquilerService;
	
	@Autowired
	public NovedadService novedadService;
	
	@Autowired
	public TipoNovedadService tipoNovedadService;
	
	@Autowired
	public ProductoService productoService;
	
	@GetMapping()
	public String listarD(Model modelo){
		List<DetalleAlquiler> listaDA = detalleAlquilerService.listar();
		List<Alquiler> listaA = alquilerService.listar();
		modelo.addAttribute("listaA", listaA);
		modelo.addAttribute("listaD", listaDA);
		return "ListarAlquiler";
	}
	
	@GetMapping("/MostrarFormulario")
	public String mostrarF(Model modelo) {
		DetalleAlquiler da = new DetalleAlquiler();
		modelo.addAttribute("detalle", da);
		List<Alquiler> listaA = alquilerService.listar();
		modelo.addAttribute("listaA", listaA);
		List<Novedad> nov = novedadService.listar();
		modelo.addAttribute("listaNov", nov);
		List<TipoNovedad> tNov = tipoNovedadService.listar();
		modelo.addAttribute("listaTipoNov", tNov);
		List<Producto> prod = productoService.listarProd();
		modelo.addAttribute("listaProd", prod);
		return "CrearAlquiler";
	}
	
	@PostMapping("/crear")
	public String crear(@ModelAttribute("detalle") DetalleAlquiler detalleAlquiler) {
		detalleAlquilerService.crear(detalleAlquiler);
		return "redirect:/Detalle";
	}
	
}
