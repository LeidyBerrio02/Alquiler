package com.ProyectoAlquiler.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.DetalleAlquiler;

@Repository
public interface DetalleAlquilerRepository extends JpaRepository<DetalleAlquiler, Long>{

}
