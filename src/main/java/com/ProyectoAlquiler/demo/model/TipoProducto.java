package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity (name="tipoproducto")
	@Table(name="tipoproducto")
	public class TipoProducto {
		
		@Id
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		@Column(name="idtipoproducto")
		private Long idTipoProducto;

		@Column(name="tipoproducto")
		private String tipoProducto;

		@JsonIgnore
		@OneToMany(mappedBy = "idtipoproducto", fetch = FetchType.EAGER)
		private List<Producto> producto;
		
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

		public List<Producto> getProducto() {
			return producto;
		}

		public void setProducto(List<Producto> producto) {
			this.producto = producto;
		}
	
		
		
}
