package com.pawan.spring_boot_learnings.datajpa.dto.response;

public class StudentResponse {
	private long id;
	private String name;
	private StudentProfileResponse profile;
	
	public StudentResponse() {}

	public StudentResponse(long id, String name, StudentProfileResponse profile) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentProfileResponse getProfile() {
		return profile;
	}

	public void setProfile(StudentProfileResponse profile) {
		this.profile = profile;
	}
}
