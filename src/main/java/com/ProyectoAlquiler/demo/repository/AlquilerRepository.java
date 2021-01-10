package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.Alquiler;

@Repository 
public interface AlquilerRepository extends JpaRepository<Alquiler, Long>{

	Optional<Alquiler> findById(Long idAlquiler);
}
