
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
 *         <element name="is_vat_payerResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isVatPayerResult"
})
@XmlRootElement(name = "is_vat_payerResponse")
public class IsVatPayerResponse {

    @XmlElement(name = "is_vat_payerResult")
    protected boolean isVatPayerResult;

    /**
     * Gets the value of the isVatPayerResult property.
     * 
     */
    public boolean isIsVatPayerResult() {
        return isVatPayerResult;
    }

    /**
     * Sets the value of the isVatPayerResult property.
     * 
     */
    public void setIsVatPayerResult(boolean value) {
        this.isVatPayerResult = value;
    }

}
