package com.ProyectoAlquiler.demo.model;

import javax.persistence.*;

@Entity(name="detallealquiler")
@Table( name ="detallealquiler")
public class DetalleAlquiler {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddetallealquiler")
	private Long idDetalleAlquiler;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="alquiler_idalquiler")
	private Alquiler alquiler;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="producto_idproducto")
	private Producto producto;
	
	@Column (name="total")
	private Double total;

	

	public Long getIdDetalleAlquiler() {
		return idDetalleAlquiler;
	}

	public void setIdDetalleAlquiler(Long idDetalleAlquiler) {
		this.idDetalleAlquiler = idDetalleAlquiler;
	}

	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}



	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	
}