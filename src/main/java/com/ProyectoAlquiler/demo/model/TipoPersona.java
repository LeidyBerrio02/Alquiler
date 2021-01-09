package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity (name="tipopersona")
@Table(name="tipopersona")

public class TipoPersona {
		
		@Id
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		@Column(name="idtipopersona")
		private Long idTipoPersona;

		@Column(name="tipopersona")
		private String TipoPersona;

		@JsonIgnore
		@OneToMany(mappedBy = "idTipoPersona", fetch = FetchType.EAGER)
		private List<Persona> persona;
		
		public Long getIdTipoPersona() {
			return idTipoPersona;
		}

		public void setIdTipoPersona(Long idTipoPersona) {
			this.idTipoPersona = idTipoPersona;
		}

		public String getTipoPersona() {
			return TipoPersona;
		}

		public void setTipoPersona(String tipoPersona) {
			TipoPersona = tipoPersona;
		}
		
		
	
}
