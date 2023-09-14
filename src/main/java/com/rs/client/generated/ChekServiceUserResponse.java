
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
 *         <element name="chek_service_userResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="un_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="s_user_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "chekServiceUserResult",
    "unId",
    "sUserId"
})
@XmlRootElement(name = "chek_service_userResponse")
public class ChekServiceUserResponse {

    @XmlElement(name = "chek_service_userResult")
    protected boolean chekServiceUserResult;
    @XmlElement(name = "un_id")
    protected int unId;
    @XmlElement(name = "s_user_id")
    protected int sUserId;

    /**
     * Gets the value of the chekServiceUserResult property.
     * 
     */
    public boolean isChekServiceUserResult() {
        return chekServiceUserResult;
    }

    /**
     * Sets the value of the chekServiceUserResult property.
     * 
     */
    public void setChekServiceUserResult(boolean value) {
        this.chekServiceUserResult = value;
    }

    /**
     * Gets the value of the unId property.
     * 
     */
    public int getUnId() {
        return unId;
    }

    /**
     * Sets the value of the unId property.
     * 
     */
    public void setUnId(int value) {
        this.unId = value;
    }

    /**
     * Gets the value of the sUserId property.
     * 
     */
    public int getSUserId() {
        return sUserId;
    }

    /**
     * Sets the value of the sUserId property.
     * 
     */
    public void setSUserId(int value) {
        this.sUserId = value;
    }

}
