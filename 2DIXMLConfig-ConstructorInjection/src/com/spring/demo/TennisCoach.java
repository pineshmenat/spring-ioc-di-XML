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
	
	@Override
	public String getDailyWorkout() {
		return "Go to Tennis court daily for practice!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
