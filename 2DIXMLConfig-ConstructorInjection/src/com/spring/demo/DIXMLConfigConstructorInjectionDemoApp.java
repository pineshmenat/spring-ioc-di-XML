package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIXMLConfigConstructorInjectionDemoApp {

	public static void main(String[] args) {
		
		//load Spring configuration file
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			//retrieve bean from spring container
			Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
			//Coach trackCoach = context.getBean("trackCoach", Coach.class);
			
			//call methods on Bean
			System.out.println(tennisCoach.getDailyWorkout());
			System.out.println(tennisCoach.getDailyFortune());
			
			//System.out.println(trackCoach.getDailyWorkout());
			
		}	// Auto close context
	}

}