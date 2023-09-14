
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
 *         <element name="confirm_waybillResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "confirmWaybillResult"
})
@XmlRootElement(name = "confirm_waybillResponse")
public class ConfirmWaybillResponse {

    @XmlElement(name = "confirm_waybillResult")
    protected boolean confirmWaybillResult;

    /**
     * Gets the value of the confirmWaybillResult property.
     * 
     */
    public boolean isConfirmWaybillResult() {
        return confirmWaybillResult;
    }

    /**
     * Sets the value of the confirmWaybillResult property.
     * 
     */
    public void setConfirmWaybillResult(boolean value) {
        this.confirmWaybillResult = value;
    }

}
