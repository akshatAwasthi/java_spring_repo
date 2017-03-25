package com.dependencyinjectiontest.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BraveKnight implements Knight {

	@Autowired
	@Qualifier("thisBean")
	private Quest quest; // field injection

	private Quest quest2;

	@Autowired
	@Qualifier("dragonQuest")
	public void setQuest2(Quest quest2) {
		this.quest2 = quest2;
	}

	public void embarkOnQuest() {
		quest.embark();
		quest2.embark();
	}
}
