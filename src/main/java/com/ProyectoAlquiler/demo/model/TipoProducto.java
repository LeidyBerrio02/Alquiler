package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

	@Entity (name="tipoproducto")
	@Table(name="tipoproducto")
	public class TipoProducto {
		
		@Id
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		private Long idTipoProducto;

		@Column(name="tipoProducto")
		private String tipoProducto;

		@OneToMany(mappedBy = "idTipoProducto", fetch = FetchType.EAGER)
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
