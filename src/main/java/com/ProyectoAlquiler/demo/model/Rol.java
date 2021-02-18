package com.ProyectoAlquiler.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity(name="rol")
@Table(name="rol")
public class Rol implements Serializable{


	public static final Long SerialVersionUID = 1L;
	
	@Id
	@Column(name="idrol")
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	public Long idRol;
	
	@Column(name="nombre")
	public String nombre;

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Long getSerialversionuid() {
		return SerialVersionUID;
	}
	
}
