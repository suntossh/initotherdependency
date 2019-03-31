package com.suntossh.preprocessor.maintest;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

	@PostConstruct
	public void postSomeServiceContruct(){
		System.out.println("###############  SomeService Constructed");
	}
}
