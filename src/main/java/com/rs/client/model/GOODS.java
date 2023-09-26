package com.rs.client.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GOODS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"ID", "W_NAME", "UNIT_ID", "QUANTITY", "PRICE", "AMOUNT", "BAR_CODE", "A_ID", "VAT_TYPE", "STATUS", "QUANTITY_F", "W_ID"})
public class GOODS {
    private Long ID;
    private String W_NAME;
    private Integer UNIT_ID;
    private Double QUANTITY;
    private Double PRICE;
    private Double AMOUNT;
    private String BAR_CODE;
    private String A_ID;
    private Integer VAT_TYPE;
    private Integer STATUS;
    private Double QUANTITY_F;
    private String W_ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getW_NAME() {
        return W_NAME;
    }

    public void setW_NAME(String w_NAME) {
        W_NAME = w_NAME;
    }

    public Integer getUNIT_ID() {
        return UNIT_ID;
    }

    public void setUNIT_ID(Integer UNIT_ID) {
        this.UNIT_ID = UNIT_ID;
    }

    public Double getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(Double QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public Double getPRICE() {
        return PRICE;
    }

    public void setPRICE(Double PRICE) {
        this.PRICE = PRICE;
    }

    public Double getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(Double AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getBAR_CODE() {
        return BAR_CODE;
    }

    public void setBAR_CODE(String BAR_CODE) {
        this.BAR_CODE = BAR_CODE;
    }

    public String getA_ID() {
        return A_ID;
    }

    public void setA_ID(String a_ID) {
        A_ID = a_ID;
    }

    public Integer getVAT_TYPE() {
        return VAT_TYPE;
    }

    public void setVAT_TYPE(Integer VAT_TYPE) {
        this.VAT_TYPE = VAT_TYPE;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Double getQUANTITY_F() {
        return QUANTITY_F;
    }

    public void setQUANTITY_F(Double QUANTITY_F) {
        this.QUANTITY_F = QUANTITY_F;
    }

    public String getW_ID() {
        return W_ID;
    }

    public void setW_ID(String w_ID) {
        W_ID = w_ID;
    }
}