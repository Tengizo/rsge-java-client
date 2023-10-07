package com.rs.client.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "chek_service_userResponse",namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"chek_service_userResult", "un_id", "s_user_id"})
public class CheckServiceUserResponse {
	private Boolean chek_service_userResult;
	private Integer un_id;
	private Integer s_user_id;

	public Boolean getChek_service_userResult() {
		return chek_service_userResult;
	}

	public void setChek_service_userResult(Boolean chek_service_userResult) {
		this.chek_service_userResult = chek_service_userResult;
	}

	public Integer getUn_id() {
		return un_id;
	}

	public void setUn_id(Integer un_id) {
		this.un_id = un_id;
	}

	public Integer getS_user_id() {
		return s_user_id;
	}

	public void setS_user_id(Integer s_user_id) {
		this.s_user_id = s_user_id;
	}
}