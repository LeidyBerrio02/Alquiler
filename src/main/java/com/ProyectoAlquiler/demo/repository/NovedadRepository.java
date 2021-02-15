package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.Novedad;

@Repository
public interface NovedadRepository extends JpaRepository<Novedad, Long> {
	
	Optional<Novedad> findById(Long idNovedad);
	
	@Query(value="select count(idNovedad) from novedad", nativeQuery = true)
	public String cantidad();
}
