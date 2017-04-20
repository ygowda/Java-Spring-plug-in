package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Configuration
@ComponentScan
@Controller
public class SpringTestApplication {

	@ResponseBody
	@RequestMapping(value ="/", method=RequestMethod.GET)
	public String entry(){ 
		return "Using spring plugin";
	}
	
	@ResponseBody
	@RequestMapping("/greeting")
	public String greeting(){ 
		return "Hello World";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
}
