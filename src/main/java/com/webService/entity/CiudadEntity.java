package com.webService.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ciudad")
public class CiudadEntity {

	@Id
	@Column(name = "id_ciudad")
	private Integer idCiudad;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "codigo_pais")
	private String codigoPais;

	@Column(name = "latitud", precision = 10, scale = 8)
	private BigDecimal latitud;

	@Column(name = "longitud", precision = 11, scale = 8)
	private BigDecimal longitud;

	@Column(name = "cantidad_buscada")
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

	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	public Integer getCantidadBuscada() {
		return cantidadBuscada;
	}

	public void setCantidadBuscada(Integer cantidadBuscada) {
		this.cantidadBuscada = cantidadBuscada;
	}

}
