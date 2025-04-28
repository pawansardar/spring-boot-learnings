package com.pawan.spring_boot_learnings.beans.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component     // Alternative to Annotation-based
public class InterfaceBasedLifecycle implements InitializingBean, DisposableBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Interface-based lifecycle initialized");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Interface-based lifecycle cleaned-up");
	}
	
}
