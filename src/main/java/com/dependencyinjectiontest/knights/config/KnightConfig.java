package com.dependencyinjectiontest.knights.config;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dependencyinjectiontest.knights.BraveKnight;
import com.dependencyinjectiontest.knights.DragonSlayingQuest;
import com.dependencyinjectiontest.knights.Knight;
import com.dependencyinjectiontest.knights.Quest;
import com.dependencyinjectiontest.knights.SomeUnrelatedQuest;

@Configuration
@ComponentScan(basePackageClasses = Knight.class)
public class KnightConfig {

	@Bean
	public Knight knightBean() {
		return new BraveKnight();
	}

	@Bean
	@Qualifier("dragonQuest")
	public Quest questBean() {
		return new DragonSlayingQuest();
	}

	@Bean
	@Qualifier("thisBean")
	public Quest unrelatedQuestBean() {
		return new SomeUnrelatedQuest();
	}

	@Bean
	public PrintStream printStreamBean() {
		return System.out;
	}
}
