package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIXMLBeanInitDestroyDemoApp {

	public static void main(String[] args) {
		
		//load Spring configuration file
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			//retrieve bean from spring container
			Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
			Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
			
			//check if they are same
			boolean result = (tennisCoach == alphaCoach);
			System.out.println("Two Beans are same: " + result);
			
			System.out.println("Default memory address of tennisCoach: " + tennisCoach);
			System.out.println("Default memory address of alphaCoach: " + alphaCoach);
			
		}	// Auto close context
	}

}