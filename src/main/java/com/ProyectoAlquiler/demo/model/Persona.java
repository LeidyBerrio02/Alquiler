package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

@Entity (name="persona")
@Table(name="persona")
public class Persona {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPersona;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="idTipoDocumento")
	private TipoDocumento idTipoDocumento;
	
	@Column(name="numeroDocumento")
	private String numeroDocumento;
	
	@Column(name="idTipoPersona")
	private TipoPersona idTipoPersona;

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public TipoDocumento getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public TipoPersona getIdTipoPersona() {
		return idTipoPersona;
	}

	public void setIdTipoPersona(TipoPersona idTipoPersona) {
		this.idTipoPersona = idTipoPersona;
	}
	
	
	
}
