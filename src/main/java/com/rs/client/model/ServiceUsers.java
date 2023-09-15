package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "ServiceUsers")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "ServiceUsers", "xmlns", "text"})
@XmlSeeAlso(ServiceUser.class)
public class ServiceUsers {
	@XmlMixed
	@XmlAnyElement(lax = true)
	private List<ServiceUser> ServiceUsers;
	private Object xmlns;
	private String text;

	public List<ServiceUser> getServiceUsers() {
		return ServiceUsers;
	}

	public void setServiceUsers(List<ServiceUser> serviceUsers) {
		ServiceUsers = serviceUsers;
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