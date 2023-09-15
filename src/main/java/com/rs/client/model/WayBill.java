package com.rs.client.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Date;

@XmlRootElement(name = "WAYBILL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = {"ID", "TYPE", "CREATE_DATE", "BUYER_TIN", "BUYER_NAME", "START_ADDRESS", "END_ADDRESS", "DRIVER_TIN", "DRIVER_NAME",
        "TRANSPORT_COAST", "STATUS", "ACTIVATE_DATE", "FULL_AMOUNT", "CAR_NUMBER", "WAYBILL_NUMBER", "S_USER_ID", "BEGIN_DATE", "IS_CONFIRMED",
        "IS_CORRECTED", "BUYER_ST", "IS_MED", "RECEIVER_INFO", "INVOICE_ID", "DELIVERY_DATE", "CLOSE_DATE", "RECEPTION_INFO", "WAYBILL_COMMENT"})
public class WayBill {
    private int ID;
    private int TYPE;
    private Date CREATE_DATE;
    private double BUYER_TIN;
    private String BUYER_NAME;
    private String START_ADDRESS;
    private String END_ADDRESS;
    private double DRIVER_TIN;
    private String DRIVER_NAME;
    private int TRANSPORT_COAST;
    private int STATUS;
    private Date ACTIVATE_DATE;
    private int FULL_AMOUNT;
    private String CAR_NUMBER;
    private int WAYBILL_NUMBER;
    private int S_USER_ID;
    private Date BEGIN_DATE;
    private int IS_CONFIRMED;
    private int IS_CORRECTED;
    private int BUYER_ST;
    private int IS_MED;
    private String RECEIVER_INFO;
    private int INVOICE_ID;
    private Date DELIVERY_DATE;
    private Date CLOSE_DATE;
    private String RECEPTION_INFO;
    private String WAYBILL_COMMENT;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTYPE() {
        return TYPE;
    }

    public void setTYPE(int TYPE) {
        this.TYPE = TYPE;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public double getBUYER_TIN() {
        return BUYER_TIN;
    }

    public void setBUYER_TIN(double BUYER_TIN) {
        this.BUYER_TIN = BUYER_TIN;
    }

    public String getBUYER_NAME() {
        return BUYER_NAME;
    }

    public void setBUYER_NAME(String BUYER_NAME) {
        this.BUYER_NAME = BUYER_NAME;
    }

    public String getSTART_ADDRESS() {
        return START_ADDRESS;
    }

    public void setSTART_ADDRESS(String START_ADDRESS) {
        this.START_ADDRESS = START_ADDRESS;
    }

    public String getEND_ADDRESS() {
        return END_ADDRESS;
    }

    public void setEND_ADDRESS(String END_ADDRESS) {
        this.END_ADDRESS = END_ADDRESS;
    }

    public double getDRIVER_TIN() {
        return DRIVER_TIN;
    }

    public void setDRIVER_TIN(double DRIVER_TIN) {
        this.DRIVER_TIN = DRIVER_TIN;
    }

    public String getDRIVER_NAME() {
        return DRIVER_NAME;
    }

    public void setDRIVER_NAME(String DRIVER_NAME) {
        this.DRIVER_NAME = DRIVER_NAME;
    }

    public int getTRANSPORT_COAST() {
        return TRANSPORT_COAST;
    }

    public void setTRANSPORT_COAST(int TRANSPORT_COAST) {
        this.TRANSPORT_COAST = TRANSPORT_COAST;
    }

    public int getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(int STATUS) {
        this.STATUS = STATUS;
    }

    public Date getACTIVATE_DATE() {
        return ACTIVATE_DATE;
    }

    public void setACTIVATE_DATE(Date ACTIVATE_DATE) {
        this.ACTIVATE_DATE = ACTIVATE_DATE;
    }

    public int getFULL_AMOUNT() {
        return FULL_AMOUNT;
    }

    public void setFULL_AMOUNT(int FULL_AMOUNT) {
        this.FULL_AMOUNT = FULL_AMOUNT;
    }

    public String getCAR_NUMBER() {
        return CAR_NUMBER;
    }

    public void setCAR_NUMBER(String CAR_NUMBER) {
        this.CAR_NUMBER = CAR_NUMBER;
    }

    public int getWAYBILL_NUMBER() {
        return WAYBILL_NUMBER;
    }

    public void setWAYBILL_NUMBER(int WAYBILL_NUMBER) {
        this.WAYBILL_NUMBER = WAYBILL_NUMBER;
    }

    public int getS_USER_ID() {
        return S_USER_ID;
    }

    public void setS_USER_ID(int s_USER_ID) {
        S_USER_ID = s_USER_ID;
    }

    public Date getBEGIN_DATE() {
        return BEGIN_DATE;
    }

    public void setBEGIN_DATE(Date BEGIN_DATE) {
        this.BEGIN_DATE = BEGIN_DATE;
    }

    public int getIS_CONFIRMED() {
        return IS_CONFIRMED;
    }

    public void setIS_CONFIRMED(int IS_CONFIRMED) {
        this.IS_CONFIRMED = IS_CONFIRMED;
    }

    public int getIS_CORRECTED() {
        return IS_CORRECTED;
    }

    public void setIS_CORRECTED(int IS_CORRECTED) {
        this.IS_CORRECTED = IS_CORRECTED;
    }

    public int getBUYER_ST() {
        return BUYER_ST;
    }

    public void setBUYER_ST(int BUYER_ST) {
        this.BUYER_ST = BUYER_ST;
    }

    public int getIS_MED() {
        return IS_MED;
    }

    public void setIS_MED(int IS_MED) {
        this.IS_MED = IS_MED;
    }

    public String getRECEIVER_INFO() {
        return RECEIVER_INFO;
    }

    public void setRECEIVER_INFO(String RECEIVER_INFO) {
        this.RECEIVER_INFO = RECEIVER_INFO;
    }

    public int getINVOICE_ID() {
        return INVOICE_ID;
    }

    public void setINVOICE_ID(int INVOICE_ID) {
        this.INVOICE_ID = INVOICE_ID;
    }

    public Date getDELIVERY_DATE() {
        return DELIVERY_DATE;
    }

    public void setDELIVERY_DATE(Date DELIVERY_DATE) {
        this.DELIVERY_DATE = DELIVERY_DATE;
    }

    public Date getCLOSE_DATE() {
        return CLOSE_DATE;
    }

    public void setCLOSE_DATE(Date CLOSE_DATE) {
        this.CLOSE_DATE = CLOSE_DATE;
    }

    public String getRECEPTION_INFO() {
        return RECEPTION_INFO;
    }

    public void setRECEPTION_INFO(String RECEPTION_INFO) {
        this.RECEPTION_INFO = RECEPTION_INFO;
    }

    public String getWAYBILL_COMMENT() {
        return WAYBILL_COMMENT;
    }

    public void setWAYBILL_COMMENT(String WAYBILL_COMMENT) {
        this.WAYBILL_COMMENT = WAYBILL_COMMENT;
    }
}