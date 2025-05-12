package com.pawan.spring_boot_learnings.datajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StudentProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String email;
	
	private String phone;
	
	@OneToOne
	@JoinColumn(name = "student_id")   // Owning side of the entity relationship between StudentpProfile and Student
	private Student student;
	
	public StudentProfile() {}

	public StudentProfile(String email, String phone, Student student) {
		super();
		this.email = email;
		this.phone = phone;
		this.student = student;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
