//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.29 at 02:59:00 PM IST 
//


package in.kpmg.iocl.skuapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversion_factor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternate_from_uom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternate_to_uom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="materialCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "conversionFactor",
    "alternateFromUom",
    "alternateToUom",
    "materialCode"
})
@XmlRootElement(name = "Sku_alt_conversionRequest")
public class SkuAltConversionRequest {

    @XmlElement(name = "conversion_factor", required = true)
    protected String conversionFactor;
    @XmlElement(name = "alternate_from_uom", required = true)
    protected String alternateFromUom;
    @XmlElement(name = "alternate_to_uom", required = true)
    protected String alternateToUom;
    @XmlElement(required = true)
    protected String materialCode;

    /**
     * Gets the value of the conversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Sets the value of the conversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionFactor(String value) {
        this.conversionFactor = value;
    }

    /**
     * Gets the value of the alternateFromUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateFromUom() {
        return alternateFromUom;
    }

    /**
     * Sets the value of the alternateFromUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateFromUom(String value) {
        this.alternateFromUom = value;
    }

    /**
     * Gets the value of the alternateToUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateToUom() {
        return alternateToUom;
    }

    /**
     * Sets the value of the alternateToUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateToUom(String value) {
        this.alternateToUom = value;
    }

    /**
     * Gets the value of the materialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * Sets the value of the materialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialCode(String value) {
        this.materialCode = value;
    }

}
