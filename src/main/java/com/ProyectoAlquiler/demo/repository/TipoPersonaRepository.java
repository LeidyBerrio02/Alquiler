package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.TipoPersona;

@Repository
public interface TipoPersonaRepository extends JpaRepository<TipoPersona, Long> {

	Optional<TipoPersona> findById(Long idtipopersona);
}
