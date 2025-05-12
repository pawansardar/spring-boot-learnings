package com.pawan.spring_boot_learnings.datajpa.dto.response;

public class StudentProfileResponse {
	private String email;
	private String phone;
	
	public StudentProfileResponse() {}

	public StudentProfileResponse(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
