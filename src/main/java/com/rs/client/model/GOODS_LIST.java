package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "GOODS_LIST",namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"GOODS"})
@XmlSeeAlso({ GOODS.class})
public class GOODS_LIST {
    @XmlMixed
    @XmlAnyElement(lax = true)
    private List<GOODS> GOODS;

    public List<com.rs.client.model.GOODS> getGOODS() {
        return GOODS;
    }

    public void setGOODS(List<com.rs.client.model.GOODS> GOODS) {
        this.GOODS = GOODS;
    }
}
