
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
 *         <element name="close_waybill_vdResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "closeWaybillVdResult"
})
@XmlRootElement(name = "close_waybill_vdResponse")
public class CloseWaybillVdResponse {

    @XmlElement(name = "close_waybill_vdResult")
    protected int closeWaybillVdResult;

    /**
     * Gets the value of the closeWaybillVdResult property.
     * 
     */
    public int getCloseWaybillVdResult() {
        return closeWaybillVdResult;
    }

    /**
     * Sets the value of the closeWaybillVdResult property.
     * 
     */
    public void setCloseWaybillVdResult(int value) {
        this.closeWaybillVdResult = value;
    }

}
