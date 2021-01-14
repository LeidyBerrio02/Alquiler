package com.ProyectoAlquiler.demo.model;

import java.util.Date;
import java.util.List;

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
	
	//@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="persona_idpersona")
	private Persona idPersona;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idnovedad")
	private Novedad idnovedad;
	
	@JsonIgnore
	@OneToMany(mappedBy = "alquiler")
    private List<DetalleAlquiler> idDteAlquiler;

	public Long getIdalquiler() {
		return idalquiler;
	}

	public void setIdalquiler(Long idalquiler) {
		this.idalquiler = idalquiler;
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

	public Novedad getIdnovedad() {
		return idnovedad;
	}

	public void setIdnovedad(Novedad idnovedad) {
		this.idnovedad = idnovedad;
	}

	public List<DetalleAlquiler> getIdDteAlquiler() {
		return idDteAlquiler;
	}

	public void setIdDteAlquiler(List<DetalleAlquiler> idDteAlquiler) {
		this.idDteAlquiler = idDteAlquiler;
	}
		
}
