package com.dependencyinjectiontest.knights;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DragonSlayingQuest implements Quest{
	
	@Autowired
	private PrintStream stream;
	
	public void embark() {
		stream.println("embarking on dragon slaying quest");
	}
}
