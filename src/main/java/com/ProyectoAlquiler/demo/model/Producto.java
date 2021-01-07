package com.ProyectoAlquiler.demo.model;

import java.util.Date;

import javax.persistence.*;

@Entity(name="producto")
@Table (name="producto")
public class Producto {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private long idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column (name="idTipoProducto")
	private TipoProducto idTipoProducto;
	
	@Column(name="fechaEstreno")
	private Date fechaEstreno;
	
	@Column(name="compositor")
	private String compositor;

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}
	public TipoProducto getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(TipoProducto idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public Date getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}
	
	

}
