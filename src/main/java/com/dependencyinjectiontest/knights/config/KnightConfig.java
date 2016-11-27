package com.dependencyinjectiontest.knights.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.dependencyinjectiontest.knights.*;

@Configuration
@ComponentScan(basePackageClasses=BraveKnight.class)
public class KnightConfig {

	@Bean()
	public PrintStream stream() {
		return System.out;
	}
	
}
