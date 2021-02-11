package com.ProyectoAlquiler.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author leidy
 *
 */
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
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso  = ISO.DATE)
	@Column(name="fechaestreno")
	private Date fechaEstreno;
	
	@Column(name="compositor")
	private String compositor;
	
	@JsonIgnore
	@OneToMany(mappedBy = "producto")
    private List<DetalleAlquiler> producto;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="imagen")
	private String imagen="default.png";

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

	public List<DetalleAlquiler> getProducto() {
		return producto;
	}

	public void setProducto(List<DetalleAlquiler> producto) {
		this.producto = producto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	

	/**@ManyToOne(fetch = FetchType.LAZY)
	private DetalleAlquiler detalleAlquiler;*/

}
