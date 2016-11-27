package com.dependencyinjectiontest.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.dependencyinjectiontest.knights.*;

@Configuration
public class KnightConfig {

	@Bean
	public Knight knightBean(Quest questBean) {
		return new BraveKnight(questBean);
	}
	
	@Bean
	public Quest questBean() {
		return new DragonSlayingQuest(System.out);
	}

}
