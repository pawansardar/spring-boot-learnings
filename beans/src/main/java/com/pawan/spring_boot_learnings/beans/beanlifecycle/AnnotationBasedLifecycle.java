package com.pawan.spring_boot_learnings.beans.beanlifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class AnnotationBasedLifecycle {
	
	public AnnotationBasedLifecycle() {
		System.out.println("Annotation-based lifecycle's constructor called.");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Annotation's @PostConstruct called (after DI)");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Annotation's @PreDestroy called (before shutdown)");
	}
}
