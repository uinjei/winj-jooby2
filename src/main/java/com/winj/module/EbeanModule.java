package com.winj.module;

import org.avaje.agentloader.AgentLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.jooby.Extension;
import io.jooby.Jooby;
import io.jooby.ServiceRegistry;

public class EbeanModule implements Extension {

	private static final Logger log = LoggerFactory.getLogger(EbeanModule.class);

	@Override
	public void install(Jooby application) throws Exception {
		log.info("Starting Ebean...");

		//AgentLoader.loadAgentByMainClass("io.ebean.enhance.Transformer", "debug=0");

		final EbeanServer db = Ebean.getDefaultServer();
		db.createSqlQuery("/* EbeanHealthCheck */ SELECT 1 ").findOne();

		ServiceRegistry registry = application.getServices(); 
		registry.put(EbeanServer.class, db);           

		/* TODO edit this*/
		//application.onStop(dataSource::close);; 
	}
}
