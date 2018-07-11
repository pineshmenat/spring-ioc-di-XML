package com.spring.demo;

public class TrackCoach implements Coach{
	
	//define private field fortuneService
	private FortuneService fortuneService;
	
	//define no arg constructor
	public TrackCoach() {
		System.out.println(">>TrackCoach() : Inside TrackCoach Constructor");
	}
	
	//define setter method for fortuneService
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>setFortuneService() : Inside setFortuneService method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
