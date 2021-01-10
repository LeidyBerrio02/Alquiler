package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.DetalleAlquiler;

@Repository
public interface DetalleAlquilerRepository extends JpaRepository<DetalleAlquiler, Long> {

	Optional<DetalleAlquiler> findById(Long idDetalleAlquiler);
	
}
