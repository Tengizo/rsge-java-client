package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "WAYBILL_LIST")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"wayBill"})
@XmlSeeAlso(WayBill.class)
public class WayBillsResponse {
    @XmlMixed
    @XmlAnyElement(lax = true)
    private List<WayBill> wayBill;


    public List<WayBill> getWayBill() {
        return wayBill;
    }

    public void setWayBill(List<WayBill> wayBill) {
        this.wayBill = wayBill;
    }

}