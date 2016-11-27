package com.dependencyinjectiontest.knights;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("princessQuestBean")
public class SavePrincessQuest implements Quest{

	@Autowired
	@Qualifier("streamBean")
	private PrintStream stream;
	
	public void embark() {
		stream.println("embarking on dragon slaying quest");
	}
}
