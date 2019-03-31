package com.suntossh.preprocessor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suntossh.preprocessor.maintest.SomeService;

@SpringBootApplication(scanBasePackages={"com.suntossh"})
public class MainApplication {

	@Autowired
	private static SomeService someSVC;
	
	public static void main(String[] args) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("MESSAGE PRE-PROCESSOR MAIN");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        SpringApplication.run(MainApplication.class, args);
    }
}
