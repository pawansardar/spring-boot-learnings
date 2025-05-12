package com.pawan.spring_boot_learnings.datajpa.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.spring_boot_learnings.datajpa.dto.request.StudentRequest;
import com.pawan.spring_boot_learnings.datajpa.dto.response.CreateStudentResponse;
import com.pawan.spring_boot_learnings.datajpa.dto.response.StudentProfileResponse;
import com.pawan.spring_boot_learnings.datajpa.dto.response.StudentResponse;
import com.pawan.spring_boot_learnings.datajpa.model.Student;
import com.pawan.spring_boot_learnings.datajpa.model.StudentProfile;
import com.pawan.spring_boot_learnings.datajpa.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping("/createStudent")
	public ResponseEntity<CreateStudentResponse> createStudentWithProfile(@RequestBody StudentRequest request) {
		Student student = new Student();
		student.setName(request.getName());
		
		StudentProfile profile = new StudentProfile();
		profile.setEmail(request.getEmail());
		profile.setPhone(request.getPhone());
		
		Student savedStudent = studentService.createStudentWithProfile(student, profile);
		
		CreateStudentResponse response = new CreateStudentResponse(savedStudent.getId());
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudent/{id}")
	public ResponseEntity<StudentResponse> getStudent(@PathVariable long id) {
		Optional<Student> studentOpt = studentService.getStudentById(id);
		if (studentOpt.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Student student = studentOpt.get();
		StudentProfile profile = student.getProfile();
		StudentProfileResponse profileResponse = new StudentProfileResponse(profile.getEmail(), profile.getPhone());
		StudentResponse response = new StudentResponse(student.getId(), student.getName(), profileResponse);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
