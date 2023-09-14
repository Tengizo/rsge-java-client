
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
 *         <element name="send_waybill_transporterResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="waybill_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sendWaybillTransporterResult",
    "waybillNumber"
})
@XmlRootElement(name = "send_waybill_transporterResponse")
public class SendWaybillTransporterResponse {

    @XmlElement(name = "send_waybill_transporterResult")
    protected int sendWaybillTransporterResult;
    @XmlElement(name = "waybill_number")
    protected String waybillNumber;

    /**
     * Gets the value of the sendWaybillTransporterResult property.
     * 
     */
    public int getSendWaybillTransporterResult() {
        return sendWaybillTransporterResult;
    }

    /**
     * Sets the value of the sendWaybillTransporterResult property.
     * 
     */
    public void setSendWaybillTransporterResult(int value) {
        this.sendWaybillTransporterResult = value;
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

}
