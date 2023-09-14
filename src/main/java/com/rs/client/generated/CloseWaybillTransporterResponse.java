
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
 *         <element name="close_waybill_transporterResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "closeWaybillTransporterResult"
})
@XmlRootElement(name = "close_waybill_transporterResponse")
public class CloseWaybillTransporterResponse {

    @XmlElement(name = "close_waybill_transporterResult")
    protected int closeWaybillTransporterResult;

    /**
     * Gets the value of the closeWaybillTransporterResult property.
     * 
     */
    public int getCloseWaybillTransporterResult() {
        return closeWaybillTransporterResult;
    }

    /**
     * Sets the value of the closeWaybillTransporterResult property.
     * 
     */
    public void setCloseWaybillTransporterResult(int value) {
        this.closeWaybillTransporterResult = value;
    }

}
