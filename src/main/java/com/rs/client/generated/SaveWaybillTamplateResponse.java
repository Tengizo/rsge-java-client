
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
 *         <element name="save_waybill_tamplateResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "saveWaybillTamplateResult"
})
@XmlRootElement(name = "save_waybill_tamplateResponse")
public class SaveWaybillTamplateResponse {

    @XmlElement(name = "save_waybill_tamplateResult")
    protected int saveWaybillTamplateResult;

    /**
     * Gets the value of the saveWaybillTamplateResult property.
     * 
     */
    public int getSaveWaybillTamplateResult() {
        return saveWaybillTamplateResult;
    }

    /**
     * Sets the value of the saveWaybillTamplateResult property.
     * 
     */
    public void setSaveWaybillTamplateResult(int value) {
        this.saveWaybillTamplateResult = value;
    }

}
