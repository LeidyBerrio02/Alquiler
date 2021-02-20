package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.TipoProducto;
import com.ProyectoAlquiler.demo.repository.TipoProductoRepository;

@Service

public class TipoProductoServiceImp implements TipoProductoService{

	//inyeccion de dependencias
	@Autowired
	private TipoProductoRepository tipoProductoRepository;
	
	@Override
	public List<TipoProducto> listar() {
		// TODO Auto-generated method stub
		return tipoProductoRepository.findAll();
	}

	@Override
	public TipoProducto crear(TipoProducto tipoProducto) {
		// TODO Auto-generated method stub
		return tipoProductoRepository.save(tipoProducto);
	}
/*
	@Override
	public TipoProducto actualizar(TipoProducto tipoProducto, Long idTipoProducto) {
		TipoProducto tipoProductoEnBD = tipoProductoRepository.findById(idTipoProducto).orElse(null);
		
		if(tipoProducto !=null) {
			tipoProductoEnBD.setTipoProducto(tipoProducto.getTipoProducto());
			tipoProductoEnBD.setProducto(tipoProducto.getProducto());
		}
		
		return tipoProductoRepository.save(tipoProductoEnBD);
	}*/
	
	public Boolean eliminar(Long idTipoProducto) {
		if(tipoProductoRepository.existsById(idTipoProducto)) {
			tipoProductoRepository.deleteById(idTipoProducto);
			return true;
		}
		return false;
	}

	@Override
	public String cantidad() {
		// TODO Auto-generated method stub
		return tipoProductoRepository.cantidad();
	}

	@Override
	public TipoProducto buscar(TipoProducto tipoProducto) {
		// TODO Auto-generated method stub
		return tipoProductoRepository.findById(tipoProducto.getIdTipoProducto()).orElse(null);
	}

}
