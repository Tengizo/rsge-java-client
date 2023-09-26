package com.rs.client.model;


import jakarta.xml.bind.annotation.*;

import java.io.Serializable;

@XmlRootElement(name = "waybill")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"WAYBILL"})
@XmlSeeAlso(WayBillById.class)
public class SaveWaybillRequest implements Serializable {

    @XmlElement(name = "WAYBILL")
    private WayBillById WAYBILL;

    public WayBillById getWAYBILL() {
        return WAYBILL;
    }

    public void setWAYBILL(WayBillById WAYBILL) {
        this.WAYBILL = WAYBILL;
    }
}
