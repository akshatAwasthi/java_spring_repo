package com.dependencyinjectiontest.knights;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependencyinjectiontest.knights.config.KnightConfig;

public class KnightMain {
	public static void main(String[] args) throws BeansException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		//context.refresh();
		Knight knight = (Knight)context.getBean("knightBean");
		knight.embarkOnQuest();
		context.close();
	}
}
