package com.enjoy.cap9.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Moon {
	public Moon(){
		System.out.println("Moon constructor........");
	}
	@PostConstruct
	public void init(){
		System.out.println("Moon....init......");
	}
	
@PreDestroy
	public void destroy(){
		System.out.println("Moon....destroy......");
	}
}
