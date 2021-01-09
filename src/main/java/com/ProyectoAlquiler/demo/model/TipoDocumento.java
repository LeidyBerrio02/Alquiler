package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity (name="tipodocumento")
@Table(name="tipodocumento")
public class TipoDocumento {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idtipodocumento;

	@Column(name="tipodocumento")
	private String TipoDocumento;

	@OneToMany(mappedBy ="idTipoDocumento", fetch = FetchType.EAGER)
	private List<Persona> persona;

	public Long getIdtipodocumento() {
		return idtipodocumento;
	}

	public void setIdtipodocumento(Long idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	
	
	
}