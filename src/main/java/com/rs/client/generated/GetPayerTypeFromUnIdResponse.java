
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
 *         <element name="get_payer_type_from_un_idResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getPayerTypeFromUnIdResult"
})
@XmlRootElement(name = "get_payer_type_from_un_idResponse")
public class GetPayerTypeFromUnIdResponse {

    @XmlElement(name = "get_payer_type_from_un_idResult")
    protected int getPayerTypeFromUnIdResult;

    /**
     * Gets the value of the getPayerTypeFromUnIdResult property.
     * 
     */
    public int getGetPayerTypeFromUnIdResult() {
        return getPayerTypeFromUnIdResult;
    }

    /**
     * Sets the value of the getPayerTypeFromUnIdResult property.
     * 
     */
    public void setGetPayerTypeFromUnIdResult(int value) {
        this.getPayerTypeFromUnIdResult = value;
    }

}
