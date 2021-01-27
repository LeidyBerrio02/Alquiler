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
		return "ListarTipoDocumento";
	}
	
	@PostMapping("/CrearTD")
	public TipoDocumento crear(@RequestBody TipoDocumento tipoDocumento) {
		return tipoDocumentoService.crear(tipoDocumento);
	}
	
	@PutMapping("/actualizar/{idTipoDocumento}")
	public TipoDocumento actualizar(@PathVariable Long idTipoDocumento,@RequestBody TipoDocumento tipoDocumento) {
		return tipoDocumentoService.actualizar(tipoDocumento, idTipoDocumento);
	}	
	
	@DeleteMapping("/eliminar/{idTipoDocumento}")
	public Boolean eliminar(@PathVariable Long idTipoDocumento) {
		return tipoDocumentoService.eliminar(idTipoDocumento);
	}
}
