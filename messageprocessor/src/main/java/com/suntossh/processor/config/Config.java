package com.suntossh.processor.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.rohan.processor" })
public class Config {

	@PostConstruct
	public void postconstructconfig() {
		System.out.println("###############  CONFIG Constructed");
	}

}
