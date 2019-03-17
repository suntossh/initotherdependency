package com.suntossh.processor.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.suntossh.processor","com.rohan.processor"})
//@ComponentScan({"com.suntossh.processor","com.rohan.processor"})
public class MainApplication {

	public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
