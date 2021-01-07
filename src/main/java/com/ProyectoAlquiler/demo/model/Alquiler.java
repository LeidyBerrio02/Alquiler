package com.ProyectoAlquiler.demo.model;

import java.util.Date;

import javax.persistence.*;
@Entity(name="alquiler")
@Table(name="alquiler")
public class Alquiler {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAlquiler")
	private Long idAlquiler;
	
	@Column(name="fechaAlquiler")
	private Date fechaAlquiler;
	
	@Column(name="fechaEntrega")
	private Date fechaEntrega;
	
	@Column(name="idPersona")
	private Persona idPersona;
	
	@Column(name="idNovedad")
	private Novedad idNovedad;
	
	public Long getIdAlquiler() {
		return idAlquiler;
	}

	public void setIdAlquiler(Long idAlquiler) {
		this.idAlquiler = idAlquiler;
	}

	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Persona getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	public Novedad getIdNovedad() {
		return idNovedad;
	}

	public void setIdNovedad(Novedad idNovedad) {
		this.idNovedad = idNovedad;
	}


	
	
	
}
