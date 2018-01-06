package com.xxzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestgitApplication {
    public String test(){
		System.out.println("1212");
		return "test";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestgitApplication.class, args);
	}
}
