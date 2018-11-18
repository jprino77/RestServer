package com.webService.soap.mensajes;

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
@XmlType(name = "", propOrder = { "icon", "dtTxt", "tempMin", "tempMax" })
public class Clima {

	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected String icon;
	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected String dtTxt;
	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected String tempMin;
	@XmlElement(namespace = "http://www.webService.com/soap/mensajes", required = true)
	protected String tempMax;
	
	

	public Clima() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Clima(String icon, String dtTxt, String tempMin, String tempMax) {
		super();
		this.icon = icon;
		this.dtTxt = dtTxt;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
	}



	/**
	 * Obtiene el valor de la propiedad icon.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * Define el valor de la propiedad icon.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIcon(String value) {
		this.icon = value;
	}

	/**
	 * Obtiene el valor de la propiedad dtTxt.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDtTxt() {
		return dtTxt;
	}

	/**
	 * Define el valor de la propiedad dtTxt.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDtTxt(String value) {
		this.dtTxt = value;
	}

	/**
	 * Obtiene el valor de la propiedad tempMin.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTempMin() {
		return tempMin;
	}

	/**
	 * Define el valor de la propiedad tempMin.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTempMin(String value) {
		this.tempMin = value;
	}

	/**
	 * Obtiene el valor de la propiedad tempMax.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTempMax() {
		return tempMax;
	}

	/**
	 * Define el valor de la propiedad tempMax.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTempMax(String value) {
		this.tempMax = value;
	}

}
