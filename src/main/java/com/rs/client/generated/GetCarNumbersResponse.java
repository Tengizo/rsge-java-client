
package com.rs.client.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMixed;
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
 *         <element name="get_car_numbersResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="car_numbers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "getCarNumbersResult",
    "carNumbers"
})
@XmlRootElement(name = "get_car_numbersResponse")
public class GetCarNumbersResponse {

    @XmlElement(name = "get_car_numbersResult")
    protected int getCarNumbersResult;
    @XmlElement(name = "car_numbers")
    protected GetCarNumbersResponse.CarNumbers carNumbers;

    /**
     * Gets the value of the getCarNumbersResult property.
     * 
     */
    public int getGetCarNumbersResult() {
        return getCarNumbersResult;
    }

    /**
     * Sets the value of the getCarNumbersResult property.
     * 
     */
    public void setGetCarNumbersResult(int value) {
        this.getCarNumbersResult = value;
    }

    /**
     * Gets the value of the carNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link GetCarNumbersResponse.CarNumbers }
     *     
     */
    public GetCarNumbersResponse.CarNumbers getCarNumbers() {
        return carNumbers;
    }

    /**
     * Sets the value of the carNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCarNumbersResponse.CarNumbers }
     *     
     */
    public void setCarNumbers(GetCarNumbersResponse.CarNumbers value) {
        this.carNumbers = value;
    }


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
     *         <any/>
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
        "content"
    })
    public static class CarNumbers {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         * @return
         *     The value of the content property.
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<>();
            }
            return this.content;
        }

    }

}
