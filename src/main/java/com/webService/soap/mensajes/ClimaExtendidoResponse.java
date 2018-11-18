//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.17 a las 10:29:52 PM ART 
//


package com.webService.soap.mensajes;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "", propOrder = {
    "climas"
})
@XmlRootElement(name = "ClimaExtendidoResponse", namespace = "http://www.webService.com/soap/mensajes")
public class ClimaExtendidoResponse {

    @XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
    protected ClimaExtendidoResponse.Climas climas;

    /**
     * Obtiene el valor de la propiedad climas.
     * 
     * @return
     *     possible object is
     *     {@link ClimaExtendidoResponse.Climas }
     *     
     */
    public ClimaExtendidoResponse.Climas getClimas() {
        return climas;
    }

    /**
     * Define el valor de la propiedad climas.
     * 
     * @param value
     *     allowed object is
     *     {@link ClimaExtendidoResponse.Climas }
     *     
     */
    public void setClimas(ClimaExtendidoResponse.Climas value) {
        this.climas = value;
    }


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
     *         &lt;element name="clima" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dtTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tempMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tempMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "clima"
    })
    public static class Climas {

        @XmlElement(namespace = "http://www.webService.com/soap/mensajes")
        protected List<ClimaExtendidoResponse.Climas.Clima> clima;

        /**
         * Gets the value of the clima property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clima property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClima().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClimaExtendidoResponse.Climas.Clima }
         * 
         * 
         */
        public List<ClimaExtendidoResponse.Climas.Clima> getClima() {
            if (clima == null) {
                clima = new ArrayList<ClimaExtendidoResponse.Climas.Clima>();
            }
            return this.clima;
        }


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
         *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dtTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tempMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tempMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "icon",
            "dtTxt",
            "tempMin",
            "tempMax"
        })
        public static class Clima {

            @XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
            protected String icon;
            @XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
            protected String dtTxt;
            @XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
            protected String tempMin;
            @XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
            protected String tempMax;

            /**
             * Obtiene el valor de la propiedad icon.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIcon() {
                return icon;
            }

            /**
             * Define el valor de la propiedad icon.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIcon(String value) {
                this.icon = value;
            }

            /**
             * Obtiene el valor de la propiedad dtTxt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtTxt() {
                return dtTxt;
            }

            /**
             * Define el valor de la propiedad dtTxt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtTxt(String value) {
                this.dtTxt = value;
            }

            /**
             * Obtiene el valor de la propiedad tempMin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempMin() {
                return tempMin;
            }

            /**
             * Define el valor de la propiedad tempMin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempMin(String value) {
                this.tempMin = value;
            }

            /**
             * Obtiene el valor de la propiedad tempMax.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempMax() {
                return tempMax;
            }

            /**
             * Define el valor de la propiedad tempMax.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempMax(String value) {
                this.tempMax = value;
            }

        }

    }

}
