package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCXMLConfigDemoApp {

	public static void main(String[] args) {
		
		//load Spring configuration file
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			//retrieve bean from spring container
			/*Why do we specify the Coach interface in getBean()?
			 * Behaves the same as getBean(String), but provides a measure of type safety by throwing a BeanNotOfRequiredTypeException if the bean 
			 * is not of the required type. This means that ClassCastException can't be thrown on casting the result correctly, 
			 * as can happen with getBean(String).*/
			Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
			Coach trackCoach = context.getBean("trackCoach", Coach.class);
			
			//call methods on Bean
			System.out.println(tennisCoach.getDailyWorkout());
			System.out.println(trackCoach.getDailyWorkout());
		}	// Auto close context
	}

}
