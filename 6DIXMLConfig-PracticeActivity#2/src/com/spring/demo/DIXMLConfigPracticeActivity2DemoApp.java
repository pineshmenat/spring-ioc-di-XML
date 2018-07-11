package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIXMLConfigPracticeActivity2DemoApp {

	public static void main(String[] args) {
		
		//load Spring configuration file
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			//retrieve bean from spring container
			TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
			//Coach trackCoach = context.getBean("trackCoach", Coach.class);
			
			//call methods on Bean
			System.out.println(tennisCoach.getDailyWorkout());
			System.out.println(tennisCoach.getDailyFortune());
			
			System.out.println(tennisCoach.getEmail());
			System.out.println(tennisCoach.getTeam());

		}	// Auto close context
	}
}