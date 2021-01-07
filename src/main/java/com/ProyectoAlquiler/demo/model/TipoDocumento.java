package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

@Entity (name="tipoDocumento")
@Table(name="tipoDocumento")
public class TipoDocumento {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idTipoDocumento;

	@Column(name="tipoDocumento")
	private String TipoDocumento;

	public Long getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}
	
	
	
}
