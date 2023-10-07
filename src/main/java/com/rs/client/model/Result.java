package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "RESULT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"STATUS", "ID", "SUB_WAYBILLS", "GOODS_LIST", "text"})
public class Result {
    private Integer STATUS;
    private Integer ID;
    public Object SUB_WAYBILLS;
    public Object GOODS_LIST;
    private String text;

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Object getSUB_WAYBILLS() {
        return SUB_WAYBILLS;
    }

    public void setSUB_WAYBILLS(Object SUB_WAYBILLS) {
        this.SUB_WAYBILLS = SUB_WAYBILLS;
    }

    public Object getGOODS_LIST() {
        return GOODS_LIST;
    }

    public void setGOODS_LIST(Object GOODS_LIST) {
        this.GOODS_LIST = GOODS_LIST;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}