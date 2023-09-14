
package com.rs.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="su" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bar_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="goods_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unit_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="unit_txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="a_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "su",
    "sp",
    "barCode",
    "goodsName",
    "unitId",
    "unitTxt",
    "aId"
})
@XmlRootElement(name = "save_bar_code")
public class SaveBarCode {

    protected String su;
    protected String sp;
    @XmlElement(name = "bar_code")
    protected String barCode;
    @XmlElement(name = "goods_name")
    protected String goodsName;
    @XmlElement(name = "unit_id")
    protected int unitId;
    @XmlElement(name = "unit_txt")
    protected String unitTxt;
    @XmlElement(name = "a_id")
    protected int aId;

    /**
     * Gets the value of the su property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSu() {
        return su;
    }

    /**
     * Sets the value of the su property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSu(String value) {
        this.su = value;
    }

    /**
     * Gets the value of the sp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSp() {
        return sp;
    }

    /**
     * Sets the value of the sp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSp(String value) {
        this.sp = value;
    }

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the goodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets the value of the goodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * Gets the value of the unitId property.
     * 
     */
    public int getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     */
    public void setUnitId(int value) {
        this.unitId = value;
    }

    /**
     * Gets the value of the unitTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTxt() {
        return unitTxt;
    }

    /**
     * Sets the value of the unitTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTxt(String value) {
        this.unitTxt = value;
    }

    /**
     * Gets the value of the aId property.
     * 
     */
    public int getAId() {
        return aId;
    }

    /**
     * Sets the value of the aId property.
     * 
     */
    public void setAId(int value) {
        this.aId = value;
    }

}
