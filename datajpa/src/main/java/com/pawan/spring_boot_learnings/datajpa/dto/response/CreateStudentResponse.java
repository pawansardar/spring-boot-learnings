package com.pawan.spring_boot_learnings.datajpa.dto.response;

public class CreateStudentResponse {
	private long id;
	
	public CreateStudentResponse() {}

	public CreateStudentResponse(long id) {
		super();
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
