package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.TipoProducto;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long>{

	Optional<TipoProducto> findById(Long idTipoProducto);
	
	@Query(value="select count(idtipoproducto) from tipoproducto",nativeQuery = true)
	public String cantidad();
}
