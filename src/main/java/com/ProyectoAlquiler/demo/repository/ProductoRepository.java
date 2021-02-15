package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	Optional<Producto> findById(Long idProducto);
	
	@Query(value="select count(idproducto) from producto", nativeQuery = true)
	public String cantidad();
}
