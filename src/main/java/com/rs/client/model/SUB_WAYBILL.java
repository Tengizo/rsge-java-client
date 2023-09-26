package com.rs.client.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SUB_WAYBILL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"ID", "WAYBILL_NUMBER", "BUYER_TIN", "BUYER_NAME", "FULL_AMOUNT", "STATUS", "TOTAL_QUANTITY", "TYPE"})
public class SUB_WAYBILL {
    public String ID;
    public String WAYBILL_NUMBER;
    public String BUYER_TIN;
    public String BUYER_NAME;
    public Double FULL_AMOUNT;
    public Integer STATUS;
    public Double TOTAL_QUANTITY;
    public Integer TYPE;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getWAYBILL_NUMBER() {
        return WAYBILL_NUMBER;
    }

    public void setWAYBILL_NUMBER(String WAYBILL_NUMBER) {
        this.WAYBILL_NUMBER = WAYBILL_NUMBER;
    }

    public String getBUYER_TIN() {
        return BUYER_TIN;
    }

    public void setBUYER_TIN(String BUYER_TIN) {
        this.BUYER_TIN = BUYER_TIN;
    }

    public String getBUYER_NAME() {
        return BUYER_NAME;
    }

    public void setBUYER_NAME(String BUYER_NAME) {
        this.BUYER_NAME = BUYER_NAME;
    }

    public Double getFULL_AMOUNT() {
        return FULL_AMOUNT;
    }

    public void setFULL_AMOUNT(Double FULL_AMOUNT) {
        this.FULL_AMOUNT = FULL_AMOUNT;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Double getTOTAL_QUANTITY() {
        return TOTAL_QUANTITY;
    }

    public void setTOTAL_QUANTITY(Double TOTAL_QUANTITY) {
        this.TOTAL_QUANTITY = TOTAL_QUANTITY;
    }

    public Integer getTYPE() {
        return TYPE;
    }

    public void setTYPE(Integer TYPE) {
        this.TYPE = TYPE;
    }
}