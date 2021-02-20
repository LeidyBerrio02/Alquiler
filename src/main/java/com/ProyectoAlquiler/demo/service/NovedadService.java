package com.ProyectoAlquiler.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ProyectoAlquiler.demo.model.Novedad;

@Service
public interface NovedadService {

	List<Novedad> listar();
	Novedad crear(Novedad novedad);
	Novedad buscar(Novedad novedad);
	Boolean eliminar(Long idNovedad);
	String cantidad();
}
