package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "ServiceUser")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "ID", "USER_NAME", "UN_ID","IP","NAME"})
public class ServiceUser {
	private Integer ID;
	private String USER_NAME;
	private Integer UN_ID;
	private String IP;
	private String NAME;


	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String USER_NAME) {
		this.USER_NAME = USER_NAME;
	}

	public int getUN_ID() {
		return UN_ID;
	}

	public void setUN_ID(int UN_ID) {
		this.UN_ID = UN_ID;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String IP) {
		this.IP = IP;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	@Override
	public String toString() {
		return "ID:"+this.ID+"USER_NAME:"+this.USER_NAME+"UN_ID:"+this.UN_ID+"IP:"+this.IP+"NAME:"+this.NAME;
	}
}