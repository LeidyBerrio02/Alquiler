package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.Producto;
import com.ProyectoAlquiler.demo.repository.ProductoRepository;

@Service

public class ProductoServiceImp  implements ProductoService{
	
	//inyeccion de dependencias
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> listarProd() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Producto crear(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public Boolean eliminar(Long idProducto) {
		// TODO Auto-generated method stub
		if(productoRepository.existsById(idProducto)) {
			productoRepository.deleteById(idProducto);
			return true;
		}
		return false;
	}

	
	
}
