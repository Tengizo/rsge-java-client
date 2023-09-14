
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
 *         <element name="get_buyer_waybilll_goods_listResult" minOccurs="0">
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
    "getBuyerWaybilllGoodsListResult"
})
@XmlRootElement(name = "get_buyer_waybilll_goods_listResponse")
public class GetBuyerWaybilllGoodsListResponse {

    @XmlElement(name = "get_buyer_waybilll_goods_listResult")
    protected GetBuyerWaybilllGoodsListResponse.GetBuyerWaybilllGoodsListResult getBuyerWaybilllGoodsListResult;

    /**
     * Gets the value of the getBuyerWaybilllGoodsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetBuyerWaybilllGoodsListResponse.GetBuyerWaybilllGoodsListResult }
     *     
     */
    public GetBuyerWaybilllGoodsListResponse.GetBuyerWaybilllGoodsListResult getGetBuyerWaybilllGoodsListResult() {
        return getBuyerWaybilllGoodsListResult;
    }

    /**
     * Sets the value of the getBuyerWaybilllGoodsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBuyerWaybilllGoodsListResponse.GetBuyerWaybilllGoodsListResult }
     *     
     */
    public void setGetBuyerWaybilllGoodsListResult(GetBuyerWaybilllGoodsListResponse.GetBuyerWaybilllGoodsListResult value) {
        this.getBuyerWaybilllGoodsListResult = value;
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
    public static class GetBuyerWaybilllGoodsListResult {

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
