
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
 *         <element name="delete_bar_codeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "deleteBarCodeResult"
})
@XmlRootElement(name = "delete_bar_codeResponse")
public class DeleteBarCodeResponse {

    @XmlElement(name = "delete_bar_codeResult")
    protected int deleteBarCodeResult;

    /**
     * Gets the value of the deleteBarCodeResult property.
     * 
     */
    public int getDeleteBarCodeResult() {
        return deleteBarCodeResult;
    }

    /**
     * Sets the value of the deleteBarCodeResult property.
     * 
     */
    public void setDeleteBarCodeResult(int value) {
        this.deleteBarCodeResult = value;
    }

}
