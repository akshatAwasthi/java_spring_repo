package com.dependencyinjectiontest.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("knight")
public class BraveKnight implements Knight{
	
	@Autowired
	private Quest quest;
	
	public void embarkOnQuest() {
		quest.embark();
	}
}
