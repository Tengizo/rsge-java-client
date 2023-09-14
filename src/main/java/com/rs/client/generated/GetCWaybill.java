
package com.rs.client.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="s_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="e_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "sDt",
    "eDt"
})
@XmlRootElement(name = "get_c_waybill")
public class GetCWaybill {

    protected String su;
    protected String sp;
    @XmlElement(name = "s_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sDt;
    @XmlElement(name = "e_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eDt;

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
     * Gets the value of the sDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSDt() {
        return sDt;
    }

    /**
     * Sets the value of the sDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSDt(XMLGregorianCalendar value) {
        this.sDt = value;
    }

    /**
     * Gets the value of the eDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDt() {
        return eDt;
    }

    /**
     * Sets the value of the eDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDt(XMLGregorianCalendar value) {
        this.eDt = value;
    }

}
