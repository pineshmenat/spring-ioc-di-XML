package com.spring.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String fortuneList[] = {
			"It's Not Whether You Get Knocked Down, Its Whether You Get Up.",
			"People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do.",
			"Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough."
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		return fortuneList[myRandom.nextInt(fortuneList.length)];
	}

}
