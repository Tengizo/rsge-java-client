
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
 *         <element name="save_waybill_transporterResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "saveWaybillTransporterResult"
})
@XmlRootElement(name = "save_waybill_transporterResponse")
public class SaveWaybillTransporterResponse {

    @XmlElement(name = "save_waybill_transporterResult")
    protected int saveWaybillTransporterResult;

    /**
     * Gets the value of the saveWaybillTransporterResult property.
     * 
     */
    public int getSaveWaybillTransporterResult() {
        return saveWaybillTransporterResult;
    }

    /**
     * Sets the value of the saveWaybillTransporterResult property.
     * 
     */
    public void setSaveWaybillTransporterResult(int value) {
        this.saveWaybillTransporterResult = value;
    }

}
