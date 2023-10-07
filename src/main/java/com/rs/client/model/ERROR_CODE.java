package com.rs.client.model;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "ERROR_CODE", namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"ID", "TEXT", "TYPE"})
public class ERROR_CODE {
    public int ID;
    public String TEXT;
    public int TYPE;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public int getTYPE() {
        return TYPE;
    }

    public void setTYPE(int TYPE) {
        this.TYPE = TYPE;
    }
}

