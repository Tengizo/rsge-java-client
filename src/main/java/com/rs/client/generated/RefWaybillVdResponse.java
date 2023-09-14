
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
 *         <element name="ref_waybill_vdResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "refWaybillVdResult"
})
@XmlRootElement(name = "ref_waybill_vdResponse")
public class RefWaybillVdResponse {

    @XmlElement(name = "ref_waybill_vdResult")
    protected int refWaybillVdResult;

    /**
     * Gets the value of the refWaybillVdResult property.
     * 
     */
    public int getRefWaybillVdResult() {
        return refWaybillVdResult;
    }

    /**
     * Sets the value of the refWaybillVdResult property.
     * 
     */
    public void setRefWaybillVdResult(int value) {
        this.refWaybillVdResult = value;
    }

}
