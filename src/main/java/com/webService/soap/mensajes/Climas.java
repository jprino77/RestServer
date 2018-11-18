package com.webService.soap.mensajes;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class Climas {

    @XmlElement(namespace = "http://www.webService.com/soap/mensajes")
    protected List<Clima> clima;

    public void setClima(List<Clima> clima) {
		this.clima = clima;
	}

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
    public List<Clima> getClima() {
        if (clima == null) {
            clima = new ArrayList<Clima>();
        }
        return this.clima;
    }

}  