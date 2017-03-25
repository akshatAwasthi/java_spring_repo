package com.dependencyinjectiontest.knights;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeUnrelatedQuest implements Quest {

	@Autowired
	private PrintStream stream;

	public void embark() {
		stream.println("Embarking on some unrelated quest!");
	}

}
