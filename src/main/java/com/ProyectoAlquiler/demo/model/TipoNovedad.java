package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

@Entity (name="tipoNovedad")
@Table(name="tipoNovedad")
public class TipoNovedad {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idTipoNovedad;

	@Column(name="novedad")
	private String novedad;

	public Long getIdTipoNovedad() {
		return idTipoNovedad;
	}

	public void setIdTipoNovedad(Long idTipoNovedad) {
		this.idTipoNovedad = idTipoNovedad;
	}

	public String getNovedad() {
		return novedad;
	}

	public void setNovedad(String novedad) {
		this.novedad = novedad;
	}
	
	
}


