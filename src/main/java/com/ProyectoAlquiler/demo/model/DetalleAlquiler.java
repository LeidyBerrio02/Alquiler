package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

@Entity(name="detalleAlquiler")
@Table( name ="detalleAlquiler")
public class DetalleAlquiler {
	
	@Id
	@GeneratedValue( strategy =GenerationType.IDENTITY)
	private Long idDetalleAlquiler;
		
	@Column
	private Producto idProducto;
	
	@Column (name="cantidad")
	private int cantidad;

	public Long getIdDetalleAlquiler() {
		return idDetalleAlquiler;
	}

	public void setIdDetalleAlquiler(Long idDetalleAlquiler) {
		this.idDetalleAlquiler = idDetalleAlquiler;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
