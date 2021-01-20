package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity (name="tipodocumento")
@Table(name="tipodocumento")
public class TipoDocumento {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="idtipodocumento")
	private Long idtipodocumento;

	@Column(name="tipodocumento")
	private String TipoDocumento;

	@JsonIgnore
	@OneToMany(mappedBy ="idTipoDocumento", fetch = FetchType.EAGER)
	private List<Persona> persona;

	

	public Long getIdtipodocumento() {
		return idtipodocumento;
	}

	public void setIdtipodocumento(Long idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public List<Persona> getPersona() {
		return persona;
	}

	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	
	
}