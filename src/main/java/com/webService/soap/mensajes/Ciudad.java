package com.webService.soap.mensajes;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCiudad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "idCiudad", "nombre", "latitud", "longitud" })
public class Ciudad {

	@XmlElement(namespace = "http://www.webService.com/soap/mensajes")
	protected int idCiudad;
	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected String nombre;
	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected BigDecimal latitud;
	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected BigDecimal longitud;

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudad(int idCiudad, String nombre, BigDecimal latitud, BigDecimal longitud) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/**
	 * Obtiene el valor de la propiedad idCiudad.
	 * 
	 */
	public int getIdCiudad() {
		return idCiudad;
	}

	/**
	 * Define el valor de la propiedad idCiudad.
	 * 
	 */
	public void setIdCiudad(int value) {
		this.idCiudad = value;
	}

	/**
	 * Obtiene el valor de la propiedad nombre.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Define el valor de la propiedad nombre.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}

	/**
	 * Obtiene el valor de la propiedad latitud.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getLatitud() {
		return latitud;
	}

	/**
	 * Define el valor de la propiedad latitud.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setLatitud(BigDecimal value) {
		this.latitud = value;
	}

	/**
	 * Obtiene el valor de la propiedad longitud.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getLongitud() {
		return longitud;
	}

	/**
	 * Define el valor de la propiedad longitud.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setLongitud(BigDecimal value) {
		this.longitud = value;
	}

}