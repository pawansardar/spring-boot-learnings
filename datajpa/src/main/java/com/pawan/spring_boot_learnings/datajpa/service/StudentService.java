package com.pawan.spring_boot_learnings.datajpa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pawan.spring_boot_learnings.datajpa.model.Student;
import com.pawan.spring_boot_learnings.datajpa.model.StudentProfile;
import com.pawan.spring_boot_learnings.datajpa.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public Student createStudentWithProfile(Student student, StudentProfile profile) {
		// Link both. This ensures both sides are aware of each other.
		student.setProfile(profile);
		profile.setStudent(student);
		
		return studentRepository.save(student);   // Due to 'cascade = CascadeType.ALL', we don't need to separately save profile, it automatically get's saved after saving the student
	}

	public Optional<Student> getStudentById(long id) {
		return studentRepository.findById(id);
	}
}
