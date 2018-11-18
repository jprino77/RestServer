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
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudades">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ciudad" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idCiudad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "", propOrder = {
    "ciudades"
})
@XmlRootElement(name = "CiudadesResponse", namespace = "http://www.webService.com/soap/mensajes")
public class CiudadesResponse {

    @XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
    protected Ciudades ciudades;

    /**
     * Obtiene el valor de la propiedad ciudades.
     * 
     * @return
     *     possible object is
     *     {@link CiudadesResponse.Ciudades }
     *     
     */
    public Ciudades getCiudades() {
        return ciudades;
    }

    /**
     * Define el valor de la propiedad ciudades.
     * 
     * @param value
     *     allowed object is
     *     {@link CiudadesResponse.Ciudades }
     *     
     */
    public void setCiudades(Ciudades value) {
        this.ciudades = value;
    }




}
