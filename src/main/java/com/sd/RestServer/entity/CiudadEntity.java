package com.sd.RestServer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ciudad")
public class CiudadEntity implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ciudad")
	private Integer idCiudad;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="codigo_pais")
	private String codigoPais;

	@Column(name="latitud")
	private Double latitud;
	
	@Column(name="longitud")
	private Double longitud;
	
	@Column(name="cantidad_buscada")
	private Integer cantidadBuscada;

	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Integer getCantidadBuscada() {
		return cantidadBuscada;
	}

	public void setCantidadBuscada(Integer cantidadBuscada) {
		this.cantidadBuscada = cantidadBuscada;
	}
	
	
	
}
