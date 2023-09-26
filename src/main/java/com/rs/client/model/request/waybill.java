package com.rs.client.model.request;


import com.rs.client.model.WayBillById;
import jakarta.xml.bind.annotation.*;

import java.io.Serializable;

@XmlRootElement(name = "waybilld")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"WAYBILL"})
public class waybill implements Serializable {

    @XmlElement(name = "WAYBILLa")
    private WayBillById WAYBILL;

    public WayBillById getWAYBILL() {
        return WAYBILL;
    }

    public void setWAYBILL(WayBillById WAYBILL) {
        this.WAYBILL = WAYBILL;
    }
}
