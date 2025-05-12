package com.pawan.spring_boot_learnings.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawan.spring_boot_learnings.datajpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
