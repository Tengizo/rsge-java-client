package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "ServiceUsers")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"serviceUsers"})
@XmlSeeAlso(ServiceUser.class)
public class ServiceUsers {
    @XmlMixed
    @XmlAnyElement(lax = true)
    private List<ServiceUser> serviceUsers;

    public List<ServiceUser> getServiceUsers() {
        return serviceUsers;
    }

    public void setServiceUsers(List<ServiceUser> serviceUsers) {
        this.serviceUsers = serviceUsers;
    }
}