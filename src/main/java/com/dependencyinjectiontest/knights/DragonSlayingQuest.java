package com.dependencyinjectiontest.knights;

import java.io.PrintStream;

public class DragonSlayingQuest implements Quest{
	
	private PrintStream stream;

	public DragonSlayingQuest(PrintStream stream) {
		this.stream = stream;
	}
	
	public void embark() {
		stream.println("embarking on dragon slaying quest");
	}
}
