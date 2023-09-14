
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
 *         <element name="get_print_pdfResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getPrintPdfResult"
})
@XmlRootElement(name = "get_print_pdfResponse")
public class GetPrintPdfResponse {

    @XmlElement(name = "get_print_pdfResult")
    protected byte[] getPrintPdfResult;

    /**
     * Gets the value of the getPrintPdfResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetPrintPdfResult() {
        return getPrintPdfResult;
    }

    /**
     * Sets the value of the getPrintPdfResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetPrintPdfResult(byte[] value) {
        this.getPrintPdfResult = value;
    }

}
