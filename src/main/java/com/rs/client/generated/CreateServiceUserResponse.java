
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
 *         <element name="create_service_userResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "createServiceUserResult"
})
@XmlRootElement(name = "create_service_userResponse")
public class CreateServiceUserResponse {

    @XmlElement(name = "create_service_userResult")
    protected boolean createServiceUserResult;

    /**
     * Gets the value of the createServiceUserResult property.
     * 
     */
    public boolean isCreateServiceUserResult() {
        return createServiceUserResult;
    }

    /**
     * Sets the value of the createServiceUserResult property.
     * 
     */
    public void setCreateServiceUserResult(boolean value) {
        this.createServiceUserResult = value;
    }

}
