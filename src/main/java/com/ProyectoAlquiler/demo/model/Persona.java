package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity (name="persona")
@Table(name="persona")
public class Persona {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idpersona;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;
	
	@Column(name="direccion")
	private String direccion;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="tipodocumento_idtipodocumento")
	private TipoDocumento idTipoDocumento;
	
	@Column(name="numerodocumento")
	private String numeroDocumento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="tipopersona_idtipopersona")
	private TipoPersona idTipoPersona;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "idPersona")
	private List<Alquiler> alquiler;

	public Long getIdPersona() {
		return idpersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idpersona = idPersona;
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

	public List<Alquiler> getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(List<Alquiler> alquiler) {
		this.alquiler = alquiler;
	}
	
	
	
}
