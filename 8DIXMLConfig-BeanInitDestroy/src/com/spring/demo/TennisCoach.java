package com.spring.demo;

public class TennisCoach implements Coach {
	
	public TennisCoach() {
	}
	
	//define private field for FortuneService
	private FortuneService fortuneService; 
	
	//define constructor for dependency
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	//define in-it method
	/*The method can have any return type. However, "void' is most commonly used. 
	 * If you give a return type just note that you will not be able to capture the return value. 
	 * As a result, "void" is commonly used.*/
	public void initTennisCoachMethod() {
		System.out.println("INITIALISATION WORK...");
	}
	
	//define destroy method
	//For "prototype" scoped beans, Spring does not call the destroy method.
	public void destroyTennisCoachMethod() {
		System.out.println("DESTRUCTION WORK...");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Go to Tennis court daily for practice!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
