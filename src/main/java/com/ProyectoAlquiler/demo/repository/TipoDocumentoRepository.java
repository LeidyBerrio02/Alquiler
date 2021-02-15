package com.ProyectoAlquiler.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ProyectoAlquiler.demo.model.TipoDocumento;

@Repository
public interface TipoDocumentoRepository extends JpaRepository <TipoDocumento, Long>{

	Optional<TipoDocumento> findById(Long idTipoDocumento);
	
	@Query(value="select count(idtipodocumento) from tipodocumento", nativeQuery = true)
	public String cantidad();
	
}
