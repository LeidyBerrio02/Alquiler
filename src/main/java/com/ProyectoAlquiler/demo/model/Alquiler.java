package com.ProyectoAlquiler.demo.model;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity(name="alquiler")
@Table(name="alquiler")
public class Alquiler {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idalquiler")
	private Long idalquiler;
	
	@Column(name="fechaalquiler")
	private Date fechaAlquiler;
	
	@Column(name="fechaentrega")
	private Date fechaEntrega;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="persona_idpersona")
	private Persona idPersona;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idnovedad")
	private Novedad idnovedad;
	
	public Long getIdAlquiler() {
		return idalquiler;
	}

	public void setIdAlquiler(Long idAlquiler) {
		this.idalquiler = idAlquiler;
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

	
	
	public Persona getPersona() {
		return idPersona;
	}

	public void setPersona(Persona persona) {
		this.idPersona = persona;
	}

	public Novedad getIdNovedad() {
		return idnovedad;
	}

	public void setIdNovedad(Novedad idNovedad) {
		this.idnovedad = idNovedad;
	}


	
	
	
}
