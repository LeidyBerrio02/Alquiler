package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

@Entity (name="tipoPersona")
@Table(name="tipoPersona")

public class TipoPersona {
		
		@Id
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		private Long idTipoPersona;

		@Column(name="tipoPersona")
		private String TipoPersona;

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
