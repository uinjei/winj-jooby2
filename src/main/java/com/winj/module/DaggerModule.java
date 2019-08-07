package com.winj.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.winj.AppComponent;
import com.winj.DaggerAppComponent;

import io.jooby.Extension;
import io.jooby.Jooby;
import io.jooby.ServiceRegistry;

public class DaggerModule implements Extension {

	private static final Logger log = LoggerFactory.getLogger(DaggerModule.class);

	@Override
	public void install(Jooby application) throws Exception {
		log.info("Starting Dagger...");
		
		AppComponent dagger = DaggerAppComponent.builder()
		        .build();
		
		ServiceRegistry registry = application.getServices(); 
		registry.put(AppComponent.class, dagger);           

	}
}
