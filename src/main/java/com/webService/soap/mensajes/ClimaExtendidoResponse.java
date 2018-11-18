//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.17 a las 10:29:52 PM ART 
//

package com.webService.soap.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="climas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clima" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dtTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tempMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tempMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "climas" })
@XmlRootElement(name = "ClimaExtendidoResponse", namespace = "http://www.webService.com/soap/mensajes")
public class ClimaExtendidoResponse {

	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected Climas climas;

	/**
	 * Obtiene el valor de la propiedad climas.
	 * 
	 * @return possible object is {@link ClimaExtendidoResponse.Climas }
	 * 
	 */
	public Climas getClimas() {
		return climas;
	}

	/**
	 * Define el valor de la propiedad climas.
	 * 
	 * @param value
	 *            allowed object is {@link ClimaExtendidoResponse.Climas }
	 * 
	 */
	public void setClimas(Climas value) {
		this.climas = value;
	}

}
