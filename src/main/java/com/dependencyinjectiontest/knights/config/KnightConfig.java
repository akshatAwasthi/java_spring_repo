package com.dependencyinjectiontest.knights.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.dependencyinjectiontest.knights.*;

@Configuration
@ComponentScan(basePackageClasses=Knight.class)
public class KnightConfig {

	@Bean()
	public PrintStream streamBean() {
		return System.out;
	}
	
}
