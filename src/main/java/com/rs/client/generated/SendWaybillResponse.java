
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
 *         <element name="send_waybillResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sendWaybillResult"
})
@XmlRootElement(name = "send_waybillResponse")
public class SendWaybillResponse {

    @XmlElement(name = "send_waybillResult")
    protected String sendWaybillResult;

    /**
     * Gets the value of the sendWaybillResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendWaybillResult() {
        return sendWaybillResult;
    }

    /**
     * Sets the value of the sendWaybillResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendWaybillResult(String value) {
        this.sendWaybillResult = value;
    }

}
