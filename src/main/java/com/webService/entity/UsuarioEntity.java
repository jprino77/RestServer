package com.webService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "usuario")
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "clave")
	private String clave;

	@ManyToOne
	@JoinColumn(name = "id_ciudad")
	private CiudadEntity ciudad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public CiudadEntity getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadEntity ciudad) {
		this.ciudad = ciudad;
	}

}
