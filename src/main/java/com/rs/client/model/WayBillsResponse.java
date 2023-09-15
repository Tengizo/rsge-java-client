package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "WAYBILL_LIST")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "wayBill", "xmlns", "text"})
@XmlSeeAlso(WayBill.class)
public class WayBillsResponse {
	@XmlMixed
	@XmlAnyElement(lax = true)
	private List<WayBill> wayBill;
	private Object xmlns;
	private String text;

	public List<WayBill> getWayBill() {
		return wayBill;
	}

	public void setWayBill(List<WayBill> wayBill) {
		this.wayBill = wayBill;
	}

	public Object getXmlns() {
		return xmlns;
	}

	public void setXmlns(Object xmlns) {
		this.xmlns = xmlns;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}