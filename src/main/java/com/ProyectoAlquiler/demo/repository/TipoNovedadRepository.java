package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;		

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.TipoNovedad;

@Repository
public interface TipoNovedadRepository extends JpaRepository<TipoNovedad, Long> {

	Optional<TipoNovedad> findById(Long idtiponovedad);
	
}
