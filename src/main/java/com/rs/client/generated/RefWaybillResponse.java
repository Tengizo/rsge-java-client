
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
 *         <element name="ref_waybillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "refWaybillResult"
})
@XmlRootElement(name = "ref_waybillResponse")
public class RefWaybillResponse {

    @XmlElement(name = "ref_waybillResult")
    protected int refWaybillResult;

    /**
     * Gets the value of the refWaybillResult property.
     * 
     */
    public int getRefWaybillResult() {
        return refWaybillResult;
    }

    /**
     * Sets the value of the refWaybillResult property.
     * 
     */
    public void setRefWaybillResult(int value) {
        this.refWaybillResult = value;
    }

}
