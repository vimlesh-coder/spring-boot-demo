package com.springboot.demo;

import com.springboot.demo.sub1.SpringComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.springboot.demo.sub1")

public class SpringbokDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =SpringApplication.run(SpringbokDemoApplication.class, args);
		SpringComponent component=applicationContext.getBean(SpringComponent.class);
		//(SpringComponent is beans applicationContext-provide by IOC

		System.out.println(component.getMessage());
		//System.out.println("hello world");
	}

}
