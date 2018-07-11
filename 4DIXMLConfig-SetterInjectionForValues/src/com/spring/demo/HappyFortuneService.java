package com.spring.demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "A body makes his own luck, be it good or bad.";
	}

}
