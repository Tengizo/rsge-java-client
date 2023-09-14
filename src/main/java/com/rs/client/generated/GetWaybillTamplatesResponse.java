
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
 *         <element name="get_waybill_tamplatesResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="waybill_tamplates" minOccurs="0">
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
    "getWaybillTamplatesResult",
    "waybillTamplates"
})
@XmlRootElement(name = "get_waybill_tamplatesResponse")
public class GetWaybillTamplatesResponse {

    @XmlElement(name = "get_waybill_tamplatesResult")
    protected int getWaybillTamplatesResult;
    @XmlElement(name = "waybill_tamplates")
    protected GetWaybillTamplatesResponse.WaybillTamplates waybillTamplates;

    /**
     * Gets the value of the getWaybillTamplatesResult property.
     * 
     */
    public int getGetWaybillTamplatesResult() {
        return getWaybillTamplatesResult;
    }

    /**
     * Sets the value of the getWaybillTamplatesResult property.
     * 
     */
    public void setGetWaybillTamplatesResult(int value) {
        this.getWaybillTamplatesResult = value;
    }

    /**
     * Gets the value of the waybillTamplates property.
     * 
     * @return
     *     possible object is
     *     {@link GetWaybillTamplatesResponse.WaybillTamplates }
     *     
     */
    public GetWaybillTamplatesResponse.WaybillTamplates getWaybillTamplates() {
        return waybillTamplates;
    }

    /**
     * Sets the value of the waybillTamplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWaybillTamplatesResponse.WaybillTamplates }
     *     
     */
    public void setWaybillTamplates(GetWaybillTamplatesResponse.WaybillTamplates value) {
        this.waybillTamplates = value;
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
    public static class WaybillTamplates {

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
