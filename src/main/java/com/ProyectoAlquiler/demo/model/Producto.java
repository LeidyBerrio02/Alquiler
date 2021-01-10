package com.ProyectoAlquiler.demo.model;

import java.util.Date;	

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="producto")
@Table (name="producto")
public class Producto {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column(name="idproducto")
	private long idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idtipoproducto")
	private TipoProducto idtipoproducto;
	
	@Column(name="fechaestreno")
	private Date fechaEstreno;
	
	@Column(name="compositor")
	private String compositor;
	
	/**@ManyToOne(fetch = FetchType.LAZY)
	private DetalleAlquiler detalleAlquiler;*/

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
	
	public TipoProducto getIdtipoproducto() {
		return idtipoproducto;
	}

	public void setIdtipoproducto(TipoProducto idtipoproducto) {
		this.idtipoproducto = idtipoproducto;
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
