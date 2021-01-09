/**package com.ProyectoAlquiler.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity(name="detalleAlquiler")
@Table( name ="detalleAlquiler")
public class DetalleAlquiler {
	
	@OneToOne()
	@JoinColumn(name="Alquiler_idAlquiler")
	private Long Alquiler_idAlquiler;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="Canciones_idCanciones")
	private List<Producto> idProducto;
	
	@Column (name="cantidad")
	private int cantidad;

	public Long getAlquiler_idAlquiler() {
		return Alquiler_idAlquiler;
	}

	public void setAlquiler_idAlquiler(Long alquiler_idAlquiler) {
		Alquiler_idAlquiler = alquiler_idAlquiler;
	}

	public List<Producto> getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(List<Producto> idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
**/