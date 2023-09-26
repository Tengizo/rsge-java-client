package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "SUB_WAYBILLS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"SUB_WAYBILLS"})
@XmlSeeAlso({SUB_WAYBILL.class})
public class SUB_WAYBILLS {
    @XmlMixed
    @XmlAnyElement(lax = true)
    private List<SUB_WAYBILL> SUB_WAYBILLS;

    public List<SUB_WAYBILL> getSUB_WAYBILLS() {
        return SUB_WAYBILLS;
    }

    public void setSUB_WAYBILLS(List<SUB_WAYBILL> SUB_WAYBILLS) {
        this.SUB_WAYBILLS = SUB_WAYBILLS;
    }

}
