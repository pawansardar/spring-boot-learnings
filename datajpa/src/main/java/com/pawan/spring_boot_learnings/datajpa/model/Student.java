package com.pawan.spring_boot_learnings.datajpa.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)   // Non-owning side
	private StudentProfile profile;
	
	public Student() {}

	public Student(String name, StudentProfile profile) {
		super();
		this.name = name;
		this.profile = profile;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentProfile getProfile() {
		return profile;
	}
	
	public void setProfile(StudentProfile profile) {
		this.profile = profile;
	}
}
