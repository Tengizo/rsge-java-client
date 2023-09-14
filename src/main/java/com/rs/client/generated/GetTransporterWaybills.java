
package com.rs.client.generated;

import java.math.BigDecimal;
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
 *         <element name="buyer_tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="statuses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="car_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="begin_date_s" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="begin_date_e" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="create_date_s" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="create_date_e" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="driver_tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="delivery_date_s" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="delivery_date_e" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="full_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="waybill_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="close_date_s" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="close_date_e" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="s_user_ids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="is_confirmed" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "buyerTin",
    "statuses",
    "carNumber",
    "beginDateS",
    "beginDateE",
    "createDateS",
    "createDateE",
    "driverTin",
    "deliveryDateS",
    "deliveryDateE",
    "fullAmount",
    "waybillNumber",
    "closeDateS",
    "closeDateE",
    "sUserIds",
    "comment",
    "isConfirmed"
})
@XmlRootElement(name = "get_transporter_waybills")
public class GetTransporterWaybills {

    protected String su;
    protected String sp;
    @XmlElement(name = "buyer_tin")
    protected String buyerTin;
    protected String statuses;
    @XmlElement(name = "car_number")
    protected String carNumber;
    @XmlElement(name = "begin_date_s", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDateS;
    @XmlElement(name = "begin_date_e", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDateE;
    @XmlElement(name = "create_date_s", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateS;
    @XmlElement(name = "create_date_e", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateE;
    @XmlElement(name = "driver_tin")
    protected String driverTin;
    @XmlElement(name = "delivery_date_s", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDateS;
    @XmlElement(name = "delivery_date_e", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDateE;
    @XmlElement(name = "full_amount", required = true, nillable = true)
    protected BigDecimal fullAmount;
    @XmlElement(name = "waybill_number")
    protected String waybillNumber;
    @XmlElement(name = "close_date_s", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDateS;
    @XmlElement(name = "close_date_e", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDateE;
    @XmlElement(name = "s_user_ids")
    protected String sUserIds;
    protected String comment;
    @XmlElement(name = "is_confirmed", required = true, type = Integer.class, nillable = true)
    protected Integer isConfirmed;

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
     * Gets the value of the buyerTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerTin() {
        return buyerTin;
    }

    /**
     * Sets the value of the buyerTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerTin(String value) {
        this.buyerTin = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of the statuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatuses(String value) {
        this.statuses = value;
    }

    /**
     * Gets the value of the carNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * Sets the value of the carNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNumber(String value) {
        this.carNumber = value;
    }

    /**
     * Gets the value of the beginDateS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDateS() {
        return beginDateS;
    }

    /**
     * Sets the value of the beginDateS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDateS(XMLGregorianCalendar value) {
        this.beginDateS = value;
    }

    /**
     * Gets the value of the beginDateE property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDateE() {
        return beginDateE;
    }

    /**
     * Sets the value of the beginDateE property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDateE(XMLGregorianCalendar value) {
        this.beginDateE = value;
    }

    /**
     * Gets the value of the createDateS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateS() {
        return createDateS;
    }

    /**
     * Sets the value of the createDateS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateS(XMLGregorianCalendar value) {
        this.createDateS = value;
    }

    /**
     * Gets the value of the createDateE property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateE() {
        return createDateE;
    }

    /**
     * Sets the value of the createDateE property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateE(XMLGregorianCalendar value) {
        this.createDateE = value;
    }

    /**
     * Gets the value of the driverTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverTin() {
        return driverTin;
    }

    /**
     * Sets the value of the driverTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverTin(String value) {
        this.driverTin = value;
    }

    /**
     * Gets the value of the deliveryDateS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDateS() {
        return deliveryDateS;
    }

    /**
     * Sets the value of the deliveryDateS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDateS(XMLGregorianCalendar value) {
        this.deliveryDateS = value;
    }

    /**
     * Gets the value of the deliveryDateE property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDateE() {
        return deliveryDateE;
    }

    /**
     * Sets the value of the deliveryDateE property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDateE(XMLGregorianCalendar value) {
        this.deliveryDateE = value;
    }

    /**
     * Gets the value of the fullAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullAmount() {
        return fullAmount;
    }

    /**
     * Sets the value of the fullAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullAmount(BigDecimal value) {
        this.fullAmount = value;
    }

    /**
     * Gets the value of the waybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNumber() {
        return waybillNumber;
    }

    /**
     * Sets the value of the waybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNumber(String value) {
        this.waybillNumber = value;
    }

    /**
     * Gets the value of the closeDateS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDateS() {
        return closeDateS;
    }

    /**
     * Sets the value of the closeDateS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDateS(XMLGregorianCalendar value) {
        this.closeDateS = value;
    }

    /**
     * Gets the value of the closeDateE property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDateE() {
        return closeDateE;
    }

    /**
     * Sets the value of the closeDateE property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDateE(XMLGregorianCalendar value) {
        this.closeDateE = value;
    }

    /**
     * Gets the value of the sUserIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUserIds() {
        return sUserIds;
    }

    /**
     * Sets the value of the sUserIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUserIds(String value) {
        this.sUserIds = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsConfirmed(Integer value) {
        this.isConfirmed = value;
    }

}
