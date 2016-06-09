package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleTest {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("quartz-servlet.xml");

	}

}
