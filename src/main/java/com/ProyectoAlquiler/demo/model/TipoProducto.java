package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

	@Entity (name="tipoProducto")
	@Table(name="tipoProducto")
	public class TipoProducto {
		
		@Id
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		private Long idTipoProducto;

		@Column(name="tipoProducto")
		private String tipoProducto;

		public Long getIdTipoProducto() {
			return idTipoProducto;
		}

		public void setIdTipoProducto(Long idTipoProducto) {
			this.idTipoProducto = idTipoProducto;
		}

		public String getTipoProducto() {
			return tipoProducto;
		}

		public void setTipoProducto(String tipoProducto) {
			this.tipoProducto = tipoProducto;
		}
	
		
		
}
