package com.winj;

import javax.inject.Singleton;

import com.winj.controller.CustomerController;
import com.winj.service.EbeanService;

import dagger.Component;

@Singleton
@Component(modules=EbeanService.class)
public interface AppComponent {
	CustomerController customer();
}
