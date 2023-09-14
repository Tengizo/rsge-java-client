
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
 *         <element name="is_vat_payer_tinResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isVatPayerTinResult"
})
@XmlRootElement(name = "is_vat_payer_tinResponse")
public class IsVatPayerTinResponse {

    @XmlElement(name = "is_vat_payer_tinResult")
    protected boolean isVatPayerTinResult;

    /**
     * Gets the value of the isVatPayerTinResult property.
     * 
     */
    public boolean isIsVatPayerTinResult() {
        return isVatPayerTinResult;
    }

    /**
     * Sets the value of the isVatPayerTinResult property.
     * 
     */
    public void setIsVatPayerTinResult(boolean value) {
        this.isVatPayerTinResult = value;
    }

}
