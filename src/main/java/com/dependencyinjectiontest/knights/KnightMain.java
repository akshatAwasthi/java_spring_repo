package com.dependencyinjectiontest.knights;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependencyinjectiontest.knights.config.KnightConfig;

public class KnightMain {

	public static void main(String[] args) throws BeansException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		// in case of xml based configuration, ^ line will change and load context from the xml file.
		// beans and DI can be described in the xml or autowired like above by adding the following line
		// to enable component scan of classes declared as @Component
		Knight knight = (Knight) context.getBean("knightBean");
		knight.embarkOnQuest();
		context.close();

	}
}
