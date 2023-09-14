
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
 *         <element name="save_invoiceResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="out_inv_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "saveInvoiceResult",
    "outInvId"
})
@XmlRootElement(name = "save_invoiceResponse")
public class SaveInvoiceResponse {

    @XmlElement(name = "save_invoiceResult")
    protected int saveInvoiceResult;
    @XmlElement(name = "out_inv_id")
    protected int outInvId;

    /**
     * Gets the value of the saveInvoiceResult property.
     * 
     */
    public int getSaveInvoiceResult() {
        return saveInvoiceResult;
    }

    /**
     * Sets the value of the saveInvoiceResult property.
     * 
     */
    public void setSaveInvoiceResult(int value) {
        this.saveInvoiceResult = value;
    }

    /**
     * Gets the value of the outInvId property.
     * 
     */
    public int getOutInvId() {
        return outInvId;
    }

    /**
     * Sets the value of the outInvId property.
     * 
     */
    public void setOutInvId(int value) {
        this.outInvId = value;
    }

}
