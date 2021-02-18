package com.ProyectoAlquiler.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity(name="usuario")
@Data
@Table(name="usuario")
public class Usuario implements Serializable{

	public static final Long SerialVersionUID = 1L;
	
	@Id
	@Column(name="idusuario")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long idUsuario;
	
	@Column(name="username")
	public String username;
	
	@Column(name="password")
	public String password;
	
	@Column(name="estado")
	public boolean estado;
	
	@OneToMany()
	@JoinColumn(name="id_usuario")
	public List<Rol> roles;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public static Long getSerialversionuid() {
		return SerialVersionUID;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	
	
	
}
