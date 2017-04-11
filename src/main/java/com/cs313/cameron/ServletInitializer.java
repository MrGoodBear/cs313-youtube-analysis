package com.cs313.cameron;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * This class is simply here to auto-configure the servlets so we don't need
 * to use web.xml. Doesn't need to be touched or edited.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TubeHappyFinalApplication.class);
	}

}
