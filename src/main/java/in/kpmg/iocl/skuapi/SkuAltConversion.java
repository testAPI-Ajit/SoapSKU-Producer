//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.03 at 02:49:23 PM IST 
//


package in.kpmg.iocl.skuapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sku_alt_conversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sku_alt_conversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="materialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseUnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitOfMeasureDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeratorConversion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="denominatorConversion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sku_alt_conversion", propOrder = {
    "materialNo",
    "baseUnitOfMeasure",
    "unitOfMeasureDisplay",
    "numeratorConversion",
    "denominatorConversion"
})
public class SkuAltConversion {

    @XmlElement(required = true)
    protected String materialNo;
    @XmlElement(required = true)
    protected String baseUnitOfMeasure;
    @XmlElement(required = true)
    protected String unitOfMeasureDisplay;
    @XmlElement(required = true)
    protected String numeratorConversion;
    @XmlElement(required = true)
    protected String denominatorConversion;

    /**
     * Gets the value of the materialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialNo() {
        return materialNo;
    }

    /**
     * Sets the value of the materialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialNo(String value) {
        this.materialNo = value;
    }

    /**
     * Gets the value of the baseUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUnitOfMeasure() {
        return baseUnitOfMeasure;
    }

    /**
     * Sets the value of the baseUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUnitOfMeasure(String value) {
        this.baseUnitOfMeasure = value;
    }

    /**
     * Gets the value of the unitOfMeasureDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureDisplay() {
        return unitOfMeasureDisplay;
    }

    /**
     * Sets the value of the unitOfMeasureDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureDisplay(String value) {
        this.unitOfMeasureDisplay = value;
    }

    /**
     * Gets the value of the numeratorConversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeratorConversion() {
        return numeratorConversion;
    }

    /**
     * Sets the value of the numeratorConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeratorConversion(String value) {
        this.numeratorConversion = value;
    }

    /**
     * Gets the value of the denominatorConversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominatorConversion() {
        return denominatorConversion;
    }

    /**
     * Sets the value of the denominatorConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominatorConversion(String value) {
        this.denominatorConversion = value;
    }

}
