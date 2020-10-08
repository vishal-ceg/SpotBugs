package com.demo.SpotBugs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.demo.SpotBugs", "com.demo.SpotBugs.cust"} )
public class SpotBugsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpotBugsApplication.class, args);
	}
	

	

}
