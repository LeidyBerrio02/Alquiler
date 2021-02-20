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
import com.ProyectoAlquiler.demo.model.TipoDocumento;
import com.ProyectoAlquiler.demo.service.TipoDocumentoService;

@Controller
@RequestMapping("TipoDocumento")
public class TipoDocumentoController {

	//inyeccion de dependencias
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	/*@GetMapping()
	public List<TipoDocumento> listar(){
		return tipoDocumentoService.listarDoc();
	}*/
	
	@GetMapping()
	public String doc(Model modelo) {
		//lista tipo documento 
	List<TipoDocumento> td =tipoDocumentoService.listarDoc();
	modelo.addAttribute("listaTipoDoc",td);
	//objeto para crear nuevo tipo documento
	TipoDocumento tipoDocumento = new TipoDocumento();
	modelo.addAttribute("tipoDocumento",tipoDocumento 	);
		return "ListarTipoDocumento";
	}
	
	@PostMapping("/CrearTD")
	public String crear(@ModelAttribute("tipoDocumento")@Valid TipoDocumento tipoDocumento) {
		tipoDocumentoService.crear(tipoDocumento);
		return "redirect:/TipoDocumento";
	}
	
	@GetMapping("/actualizar/{idtipodocumento}")
	public String actualizar(Model modelo, TipoDocumento tipoDocumento) {
		tipoDocumento = tipoDocumentoService.buscar(tipoDocumento);
		modelo.addAttribute("tipoDocumento", tipoDocumento);
		//mostrar lista
		List<TipoDocumento> td =tipoDocumentoService.listarDoc();
		modelo.addAttribute("listaTipoDoc",td);
		 return "ListarTipoDocumento";
	}	
	
	@GetMapping("/eliminar/{idTipoDocumento}")
	public String eliminar(@PathVariable Long idTipoDocumento) {
		 tipoDocumentoService.eliminar(idTipoDocumento);
		 return "redirect:/TipoDocumento";
	}
}
