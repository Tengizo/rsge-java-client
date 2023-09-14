
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
 *         <element name="waybill_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="car_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="driver_tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="chek_driver_tin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="driver_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="trans_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="trans_txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reception_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="receiver_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "waybillId",
    "carNumber",
    "driverTin",
    "chekDriverTin",
    "driverName",
    "transId",
    "transTxt",
    "receptionInfo",
    "receiverInfo"
})
@XmlRootElement(name = "save_waybill_transporter")
public class SaveWaybillTransporter {

    protected String su;
    protected String sp;
    @XmlElement(name = "waybill_id")
    protected int waybillId;
    @XmlElement(name = "car_number")
    protected String carNumber;
    @XmlElement(name = "driver_tin")
    protected String driverTin;
    @XmlElement(name = "chek_driver_tin")
    protected int chekDriverTin;
    @XmlElement(name = "driver_name")
    protected String driverName;
    @XmlElement(name = "trans_id")
    protected int transId;
    @XmlElement(name = "trans_txt")
    protected String transTxt;
    @XmlElement(name = "reception_info")
    protected String receptionInfo;
    @XmlElement(name = "receiver_info")
    protected String receiverInfo;

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
     * Gets the value of the waybillId property.
     * 
     */
    public int getWaybillId() {
        return waybillId;
    }

    /**
     * Sets the value of the waybillId property.
     * 
     */
    public void setWaybillId(int value) {
        this.waybillId = value;
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
     * Gets the value of the chekDriverTin property.
     * 
     */
    public int getChekDriverTin() {
        return chekDriverTin;
    }

    /**
     * Sets the value of the chekDriverTin property.
     * 
     */
    public void setChekDriverTin(int value) {
        this.chekDriverTin = value;
    }

    /**
     * Gets the value of the driverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the value of the driverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     */
    public int getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     */
    public void setTransId(int value) {
        this.transId = value;
    }

    /**
     * Gets the value of the transTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTxt() {
        return transTxt;
    }

    /**
     * Sets the value of the transTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTxt(String value) {
        this.transTxt = value;
    }

    /**
     * Gets the value of the receptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptionInfo() {
        return receptionInfo;
    }

    /**
     * Sets the value of the receptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptionInfo(String value) {
        this.receptionInfo = value;
    }

    /**
     * Gets the value of the receiverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverInfo() {
        return receiverInfo;
    }

    /**
     * Sets the value of the receiverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverInfo(String value) {
        this.receiverInfo = value;
    }

}
