
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
 *         <element name="reject_waybillResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rejectWaybillResult"
})
@XmlRootElement(name = "reject_waybillResponse")
public class RejectWaybillResponse {

    @XmlElement(name = "reject_waybillResult")
    protected boolean rejectWaybillResult;

    /**
     * Gets the value of the rejectWaybillResult property.
     * 
     */
    public boolean isRejectWaybillResult() {
        return rejectWaybillResult;
    }

    /**
     * Sets the value of the rejectWaybillResult property.
     * 
     */
    public void setRejectWaybillResult(boolean value) {
        this.rejectWaybillResult = value;
    }

}
