package com.rs.client.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;



@XmlRootElement(name = "ERROR_CODES",namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"ERROR_CODE"})
@XmlSeeAlso({ ERROR_CODE.class})
public class ERROR_CODES {
	public List<ERROR_CODE> ERROR_CODE;

	public List<com.rs.client.model.ERROR_CODE> getERROR_CODE() {
		return ERROR_CODE;
	}

	public void setERROR_CODE(List<com.rs.client.model.ERROR_CODE> ERROR_CODE) {
		this.ERROR_CODE = ERROR_CODE;
	}
}
