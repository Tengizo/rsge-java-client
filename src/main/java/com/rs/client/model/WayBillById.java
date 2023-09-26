package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "WAYBILL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"SUB_WAYBILLS", "GOODS_LIST", "WOOD_DOCS_LIST", "ID", "TYPE", "CREATE_DATE", "BUYER_TIN", "CHEK_BUYER_TIN", "BUYER_NAME", "START_ADDRESS",
        "END_ADDRESS", "DRIVER_TIN", "CHEK_DRIVER_TIN", "DRIVER_NAME", "TRANSPORT_COAST", "RECEPTION_INFO", "RECEIVER_INFO", "DELIVERY_DATE", "STATUS",
        "SELER_UN_ID", "ACTIVATE_DATE", "PAR_ID", "FULL_AMOUNT", "FULL_AMOUNT_TXT", "CAR_NUMBER", "WAYBILL_NUMBER", "CLOSE_DATE", "S_USER_ID", "BEGIN_DATE",
        "TRAN_COST_PAYER", "TRANS_ID", "TRANS_TXT", "COMMENT", "IS_CONFIRMED", "INVOICE_ID", "CONFIRMATION_DATE", "SELLER_TIN", "SELLER_NAME", "WOOD_LABELS",
        "CATEGORY", "ORIGIN_TYPE", "ORIGIN_TEXT", "BUYER_S_USER_ID", "TOTAL_QUANTITY", "TRANSPORTER_TIN", "CUST_STATUS", "CUST_NAME", "CORRECTION_DATE", "IS_MED",})
//@XmlSeeAlso({SUB_WAYBILLS.class, GOODS_LIST.class})
public class WayBillById implements Serializable {

    private SUB_WAYBILLS SUB_WAYBILLS;
    private GOODS_LIST GOODS_LIST;
    private Object WOOD_DOCS_LIST;
    private String ID;
    private Integer TYPE;
    private Date CREATE_DATE;
    private String BUYER_TIN;
    private Integer CHEK_BUYER_TIN;
    private String BUYER_NAME;
    private String START_ADDRESS;
    private String END_ADDRESS;
    private String DRIVER_TIN;
    private Integer CHEK_DRIVER_TIN;
    private String DRIVER_NAME;
    private Double TRANSPORT_COAST;
    private String RECEPTION_INFO;
    private String RECEIVER_INFO;
    private String DELIVERY_DATE;
    private Integer STATUS;
    private String SELER_UN_ID;
    private Date ACTIVATE_DATE;
    private String PAR_ID;
    private Double FULL_AMOUNT;
    private String FULL_AMOUNT_TXT;
    private String CAR_NUMBER;
    private String WAYBILL_NUMBER;
    private Date CLOSE_DATE;
    private String S_USER_ID;
    private Date BEGIN_DATE;
    private Double TRAN_COST_PAYER;
    private String TRANS_ID;
    private String TRANS_TXT;
    private String COMMENT;
    private Integer IS_CONFIRMED;
    private String INVOICE_ID;
    private Date CONFIRMATION_DATE;
    private String SELLER_TIN;
    private String SELLER_NAME;
    private String WOOD_LABELS;
    private String CATEGORY;
    private String ORIGIN_TYPE;
    private String ORIGIN_TEXT;
    private String BUYER_S_USER_ID;
    private Double TOTAL_QUANTITY;
    private String TRANSPORTER_TIN;
    private String CUST_STATUS;
    private String CUST_NAME;
    private Date CORRECTION_DATE;
    private Integer IS_MED;

    public com.rs.client.model.SUB_WAYBILLS getSUB_WAYBILLS() {
        return SUB_WAYBILLS;
    }

    public void setSUB_WAYBILLS(com.rs.client.model.SUB_WAYBILLS SUB_WAYBILLS) {
        this.SUB_WAYBILLS = SUB_WAYBILLS;
    }

    public com.rs.client.model.GOODS_LIST getGOODS_LIST() {
        return GOODS_LIST;
    }

    public void setGOODS_LIST(com.rs.client.model.GOODS_LIST GOODS_LIST) {
        this.GOODS_LIST = GOODS_LIST;
    }

    public Object getWOOD_DOCS_LIST() {
        return WOOD_DOCS_LIST;
    }

    public void setWOOD_DOCS_LIST(Object WOOD_DOCS_LIST) {
        this.WOOD_DOCS_LIST = WOOD_DOCS_LIST;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getTYPE() {
        return TYPE;
    }

    public void setTYPE(Integer TYPE) {
        this.TYPE = TYPE;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getBUYER_TIN() {
        return BUYER_TIN;
    }

    public void setBUYER_TIN(String BUYER_TIN) {
        this.BUYER_TIN = BUYER_TIN;
    }

    public Integer getCHEK_BUYER_TIN() {
        return CHEK_BUYER_TIN;
    }

    public void setCHEK_BUYER_TIN(Integer CHEK_BUYER_TIN) {
        this.CHEK_BUYER_TIN = CHEK_BUYER_TIN;
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

    public String getDRIVER_TIN() {
        return DRIVER_TIN;
    }

    public void setDRIVER_TIN(String DRIVER_TIN) {
        this.DRIVER_TIN = DRIVER_TIN;
    }

    public Integer getCHEK_DRIVER_TIN() {
        return CHEK_DRIVER_TIN;
    }

    public void setCHEK_DRIVER_TIN(Integer CHEK_DRIVER_TIN) {
        this.CHEK_DRIVER_TIN = CHEK_DRIVER_TIN;
    }

    public String getDRIVER_NAME() {
        return DRIVER_NAME;
    }

    public void setDRIVER_NAME(String DRIVER_NAME) {
        this.DRIVER_NAME = DRIVER_NAME;
    }

    public Double getTRANSPORT_COAST() {
        return TRANSPORT_COAST;
    }

    public void setTRANSPORT_COAST(Double TRANSPORT_COAST) {
        this.TRANSPORT_COAST = TRANSPORT_COAST;
    }

    public String getRECEPTION_INFO() {
        return RECEPTION_INFO;
    }

    public void setRECEPTION_INFO(String RECEPTION_INFO) {
        this.RECEPTION_INFO = RECEPTION_INFO;
    }

    public String getRECEIVER_INFO() {
        return RECEIVER_INFO;
    }

    public void setRECEIVER_INFO(String RECEIVER_INFO) {
        this.RECEIVER_INFO = RECEIVER_INFO;
    }

    public String getDELIVERY_DATE() {
        return DELIVERY_DATE;
    }

    public void setDELIVERY_DATE(String DELIVERY_DATE) {
        this.DELIVERY_DATE = DELIVERY_DATE;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public String getSELER_UN_ID() {
        return SELER_UN_ID;
    }

    public void setSELER_UN_ID(String SELER_UN_ID) {
        this.SELER_UN_ID = SELER_UN_ID;
    }

    public Date getACTIVATE_DATE() {
        return ACTIVATE_DATE;
    }

    public void setACTIVATE_DATE(Date ACTIVATE_DATE) {
        this.ACTIVATE_DATE = ACTIVATE_DATE;
    }

    public String getPAR_ID() {
        return PAR_ID;
    }

    public void setPAR_ID(String PAR_ID) {
        this.PAR_ID = PAR_ID;
    }

    public Double getFULL_AMOUNT() {
        return FULL_AMOUNT;
    }

    public void setFULL_AMOUNT(Double FULL_AMOUNT) {
        this.FULL_AMOUNT = FULL_AMOUNT;
    }

    public String getFULL_AMOUNT_TXT() {
        return FULL_AMOUNT_TXT;
    }

    public void setFULL_AMOUNT_TXT(String FULL_AMOUNT_TXT) {
        this.FULL_AMOUNT_TXT = FULL_AMOUNT_TXT;
    }

    public String getCAR_NUMBER() {
        return CAR_NUMBER;
    }

    public void setCAR_NUMBER(String CAR_NUMBER) {
        this.CAR_NUMBER = CAR_NUMBER;
    }

    public String getWAYBILL_NUMBER() {
        return WAYBILL_NUMBER;
    }

    public void setWAYBILL_NUMBER(String WAYBILL_NUMBER) {
        this.WAYBILL_NUMBER = WAYBILL_NUMBER;
    }

    public Date getCLOSE_DATE() {
        return CLOSE_DATE;
    }

    public void setCLOSE_DATE(Date CLOSE_DATE) {
        this.CLOSE_DATE = CLOSE_DATE;
    }

    public String getS_USER_ID() {
        return S_USER_ID;
    }

    public void setS_USER_ID(String s_USER_ID) {
        S_USER_ID = s_USER_ID;
    }

    public Date getBEGIN_DATE() {
        return BEGIN_DATE;
    }

    public void setBEGIN_DATE(Date BEGIN_DATE) {
        this.BEGIN_DATE = BEGIN_DATE;
    }

    public Double getTRAN_COST_PAYER() {
        return TRAN_COST_PAYER;
    }

    public void setTRAN_COST_PAYER(Double TRAN_COST_PAYER) {
        this.TRAN_COST_PAYER = TRAN_COST_PAYER;
    }

    public String getTRANS_ID() {
        return TRANS_ID;
    }

    public void setTRANS_ID(String TRANS_ID) {
        this.TRANS_ID = TRANS_ID;
    }

    public String getTRANS_TXT() {
        return TRANS_TXT;
    }

    public void setTRANS_TXT(String TRANS_TXT) {
        this.TRANS_TXT = TRANS_TXT;
    }

    public String getCOMMENT() {
        return COMMENT;
    }

    public void setCOMMENT(String COMMENT) {
        this.COMMENT = COMMENT;
    }

    public Integer getIS_CONFIRMED() {
        return IS_CONFIRMED;
    }

    public void setIS_CONFIRMED(Integer IS_CONFIRMED) {
        this.IS_CONFIRMED = IS_CONFIRMED;
    }

    public String getINVOICE_ID() {
        return INVOICE_ID;
    }

    public void setINVOICE_ID(String INVOICE_ID) {
        this.INVOICE_ID = INVOICE_ID;
    }

    public Date getCONFIRMATION_DATE() {
        return CONFIRMATION_DATE;
    }

    public void setCONFIRMATION_DATE(Date CONFIRMATION_DATE) {
        this.CONFIRMATION_DATE = CONFIRMATION_DATE;
    }

    public String getSELLER_TIN() {
        return SELLER_TIN;
    }

    public void setSELLER_TIN(String SELLER_TIN) {
        this.SELLER_TIN = SELLER_TIN;
    }

    public String getSELLER_NAME() {
        return SELLER_NAME;
    }

    public void setSELLER_NAME(String SELLER_NAME) {
        this.SELLER_NAME = SELLER_NAME;
    }

    public String getWOOD_LABELS() {
        return WOOD_LABELS;
    }

    public void setWOOD_LABELS(String WOOD_LABELS) {
        this.WOOD_LABELS = WOOD_LABELS;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getORIGIN_TYPE() {
        return ORIGIN_TYPE;
    }

    public void setORIGIN_TYPE(String ORIGIN_TYPE) {
        this.ORIGIN_TYPE = ORIGIN_TYPE;
    }

    public String getORIGIN_TEXT() {
        return ORIGIN_TEXT;
    }

    public void setORIGIN_TEXT(String ORIGIN_TEXT) {
        this.ORIGIN_TEXT = ORIGIN_TEXT;
    }

    public String getBUYER_S_USER_ID() {
        return BUYER_S_USER_ID;
    }

    public void setBUYER_S_USER_ID(String BUYER_S_USER_ID) {
        this.BUYER_S_USER_ID = BUYER_S_USER_ID;
    }

    public Double getTOTAL_QUANTITY() {
        return TOTAL_QUANTITY;
    }

    public void setTOTAL_QUANTITY(Double TOTAL_QUANTITY) {
        this.TOTAL_QUANTITY = TOTAL_QUANTITY;
    }

    public String getTRANSPORTER_TIN() {
        return TRANSPORTER_TIN;
    }

    public void setTRANSPORTER_TIN(String TRANSPORTER_TIN) {
        this.TRANSPORTER_TIN = TRANSPORTER_TIN;
    }

    public String getCUST_STATUS() {
        return CUST_STATUS;
    }

    public void setCUST_STATUS(String CUST_STATUS) {
        this.CUST_STATUS = CUST_STATUS;
    }

    public String getCUST_NAME() {
        return CUST_NAME;
    }

    public void setCUST_NAME(String CUST_NAME) {
        this.CUST_NAME = CUST_NAME;
    }

    public Date getCORRECTION_DATE() {
        return CORRECTION_DATE;
    }

    public void setCORRECTION_DATE(Date CORRECTION_DATE) {
        this.CORRECTION_DATE = CORRECTION_DATE;
    }

    public Integer getIS_MED() {
        return IS_MED;
    }

    public void setIS_MED(Integer IS_MED) {
        this.IS_MED = IS_MED;
    }
}