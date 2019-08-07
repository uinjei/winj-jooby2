package com.winj.service;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.ebean.Ebean;
import io.ebean.EbeanServer;

@Module
public class EbeanService {
    
	@Provides @Singleton EbeanServer provideEbeanServer() {
		return Ebean.getDefaultServer();
	}
	
}
