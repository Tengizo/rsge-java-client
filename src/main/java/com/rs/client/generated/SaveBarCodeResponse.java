
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
 *         <element name="save_bar_codeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "saveBarCodeResult"
})
@XmlRootElement(name = "save_bar_codeResponse")
public class SaveBarCodeResponse {

    @XmlElement(name = "save_bar_codeResult")
    protected int saveBarCodeResult;

    /**
     * Gets the value of the saveBarCodeResult property.
     * 
     */
    public int getSaveBarCodeResult() {
        return saveBarCodeResult;
    }

    /**
     * Sets the value of the saveBarCodeResult property.
     * 
     */
    public void setSaveBarCodeResult(int value) {
        this.saveBarCodeResult = value;
    }

}
