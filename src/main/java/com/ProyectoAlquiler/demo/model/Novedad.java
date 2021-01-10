package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name ="novedad")
@Table(name="novedad")
public class Novedad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idnovedad;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idtiponovedad")
	private TipoNovedad idtiponovedad;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idnovedad")
	private List<Alquiler> alquiler;

	public Long getIdNovedad() {
		return idnovedad;
	}

	public void setIdNovedad(Long idNovedad) {
		this.idnovedad = idNovedad;
	}

	public TipoNovedad getIdTipoNovedad() {
		return idtiponovedad;
	}

	public void setIdTipoNovedad(TipoNovedad idtiponovedad) {
		this.idtiponovedad = idtiponovedad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Alquiler> getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(List<Alquiler> alquiler) {
		this.alquiler = alquiler;
	}
	

	
}
