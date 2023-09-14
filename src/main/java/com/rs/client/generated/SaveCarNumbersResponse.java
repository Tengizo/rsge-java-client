
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
 *         <element name="save_car_numbersResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "saveCarNumbersResult"
})
@XmlRootElement(name = "save_car_numbersResponse")
public class SaveCarNumbersResponse {

    @XmlElement(name = "save_car_numbersResult")
    protected int saveCarNumbersResult;

    /**
     * Gets the value of the saveCarNumbersResult property.
     * 
     */
    public int getSaveCarNumbersResult() {
        return saveCarNumbersResult;
    }

    /**
     * Sets the value of the saveCarNumbersResult property.
     * 
     */
    public void setSaveCarNumbersResult(int value) {
        this.saveCarNumbersResult = value;
    }

}
