package com.dependencyinjectiontest.knights;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dragonQuestBean")
public class DragonSlayingQuest implements Quest{
	
	@Autowired
	@Qualifier("streamBean")
	private PrintStream stream;
	
	public void embark() {
		stream.println("embarking on dragon slaying quest");
	}
}
