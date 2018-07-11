package com.spring.demo;

public class TennisCoach implements Coach {
	
	public TennisCoach() {
	}

	//define private field email and team
	private String team;
	private String email;
	
	//define getter setter methods for both	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println(">>TennisCoach : Inside setTeam method");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println(">>TennisCoach : Inside setemail method");
		this.email = email;
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
