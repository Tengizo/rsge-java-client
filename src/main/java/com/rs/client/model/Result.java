package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "RESULT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "STATUS", "text"})
public class Result {
	private Integer STATUS;
//	public Object SUB_WAYBILLS;
//	public Object GOODS_LIST;
	private String text;

	public Integer getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(Integer STATUS) {
		this.STATUS = STATUS;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}