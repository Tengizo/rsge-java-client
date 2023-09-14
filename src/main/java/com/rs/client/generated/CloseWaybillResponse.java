
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
 *         <element name="close_waybillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "closeWaybillResult"
})
@XmlRootElement(name = "close_waybillResponse")
public class CloseWaybillResponse {

    @XmlElement(name = "close_waybillResult")
    protected int closeWaybillResult;

    /**
     * Gets the value of the closeWaybillResult property.
     * 
     */
    public int getCloseWaybillResult() {
        return closeWaybillResult;
    }

    /**
     * Sets the value of the closeWaybillResult property.
     * 
     */
    public void setCloseWaybillResult(int value) {
        this.closeWaybillResult = value;
    }

}
