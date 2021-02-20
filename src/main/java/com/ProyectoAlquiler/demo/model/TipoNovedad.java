package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity (name="tiponovedad")
@Table(name="tiponovedad")
public class TipoNovedad {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="idtiponovedad")
	private Long idtiponovedad;

	@Column(name="novedadN")
	private String novedadN;

	@JsonIgnore
	@OneToMany(mappedBy = "idtiponovedad" ,fetch = FetchType.EAGER)
	private List<Novedad> novedad;

	

	public Long getIdtiponovedad() {
		return idtiponovedad;
	}

	public void setIdtiponovedad(Long idtiponovedad) {
		this.idtiponovedad = idtiponovedad;
	}

	public void setNovedadN(String novedadN) {
		this.novedadN = novedadN;
	}

	public void setNovedad(List<Novedad> novedad) {
		this.novedad = novedad;
	}

	public String getNovedadN() {
		return novedadN;
	}

	public void setNovedad(String novedadN) {
		this.novedadN = novedadN;
	}

	public List<Novedad> getNovedad() {
		return novedad;
	}

	public void setNovedadd(List<Novedad> novedad) {
		this.novedad = novedad;
	}
	
	
}


