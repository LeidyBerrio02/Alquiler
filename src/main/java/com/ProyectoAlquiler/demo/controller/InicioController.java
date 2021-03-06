package com.ProyectoAlquiler.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProyectoAlquiler.demo.model.Producto;
import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.model.TipoNovedad;
import com.ProyectoAlquiler.demo.model.TipoPersona;
import com.ProyectoAlquiler.demo.model.TipoProducto;
import com.ProyectoAlquiler.demo.service.AlquilerService;
import com.ProyectoAlquiler.demo.service.NovedadService;
import com.ProyectoAlquiler.demo.service.PersonaService;
import com.ProyectoAlquiler.demo.service.ProductoService;
import com.ProyectoAlquiler.demo.service.TipoDocumentoService;
import com.ProyectoAlquiler.demo.service.TipoNovedadService;
import com.ProyectoAlquiler.demo.service.TipoPersonaService;
import com.ProyectoAlquiler.demo.service.TipoProductoService;
@Controller
@RequestMapping("/")
public class InicioController {
	
	@Autowired
	public TipoPersonaService tipoPersonaService;
	
	@Autowired
	public TipoDocumentoService tipoDocumentoService;
	
	@Autowired
	public TipoNovedadService tipoNovedadService;
	
	@Autowired
	public TipoProductoService tipoProductoService;
	
	@Autowired
	public ProductoService productoService;
	
	@Autowired
	public PersonaService personaService;
	
	@Autowired
	public NovedadService novedadService;
	
	@Autowired
	public AlquilerService alquilerService;
	
	@GetMapping("/index")
	public String goHome(Model modelo) {
		List<Producto> listaProducto = productoService.listarProd();
		modelo.addAttribute("listaP", listaProducto);
		return "index";
	} 
	
	@GetMapping("/Inicio")
	public String goHomeI(Model modelo) {
		String per = personaService.cantidad();
		modelo.addAttribute("cantPersona",per);
		String prod = productoService.cantidad();
		modelo.addAttribute("cantidadProd",prod);
		String nov = novedadService.cantidad();
		modelo.addAttribute("cantNovedad",nov);
		String alq = alquilerService.cantidad();
		modelo.addAttribute("cantAlquiler", alq);
		String tDoc = tipoDocumentoService.cantidad();
		modelo.addAttribute("cantTDoc",tDoc);
		String tNov = tipoNovedadService.cantidad();
		modelo.addAttribute("cantTNov", tNov);
		String tPer = tipoPersonaService.cantidad();
		modelo.addAttribute("cantTPer", tPer);
		String tProd = tipoProductoService.cantidad();
		modelo.addAttribute("cantTProd", tProd);
		return "indexIngreso";
	}
	
	@GetMapping("/login")
	public String goLogin() {
		return "login";
	}
	
	/*
	@GetMapping("/Tipos")
	public String listarTipoPersona(Model modelo) {
		//lista tipo persona
		List<TipoPersona> tp= tipoPersonaService.listarPer();
		modelo.addAttribute("listaTipoPersona",tp);
		
		//lista tipo documento 
		List<TipoDocumento> td =tipoDocumentoService.listarDoc();
		modelo.addAttribute("listaTipoDoc",td);
		
		//lista tipo novedad
		List<TipoNovedad> tn = tipoNovedadService.listar();
		modelo.addAttribute("listaTipoNovedad",tn);
		
		//lista tipo Producto
		List<TipoProducto> tProd = tipoProductoService.listar();
		modelo.addAttribute("listaTipoProd",tProd);
		return "ListarTipos";
		
	}*/

}
