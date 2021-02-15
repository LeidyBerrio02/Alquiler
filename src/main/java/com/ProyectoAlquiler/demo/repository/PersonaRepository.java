package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
	Optional<Persona> findById(Long idPersona);
	
	@Query(value="select count(idpersona) from persona", nativeQuery = true)
	public String cantidad();
}
