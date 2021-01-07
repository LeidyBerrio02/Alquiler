package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

@Entity(name ="novedad")
@Table(name="novedad")
public class Novedad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNovedad;
	
	@Column(name="idTipoNovedad")
	private TipoNovedad idTipoNovedad;
	
	@Column(name="descripcion")
	private String descripcion;

	public Long getIdNovedad() {
		return idNovedad;
	}

	public void setIdNovedad(Long idNovedad) {
		this.idNovedad = idNovedad;
	}

	public TipoNovedad getIdTipoNovedad() {
		return idTipoNovedad;
	}

	public void setIdTipoNovedad(TipoNovedad idTipoNovedad) {
		this.idTipoNovedad = idTipoNovedad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	
}
