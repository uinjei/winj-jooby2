package com.winj;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.winj.model.Customer;
import com.winj.module.DaggerModule;
import com.winj.module.EbeanModule;

import io.jooby.Jooby;
import io.jooby.ModelAndView;
import io.jooby.handlebars.HandlebarsModule;
import io.jooby.json.JacksonModule;

public class App extends Jooby {

	private final Logger log = LoggerFactory.getLogger(App.class);
	
	public App() {
		
		install(new JacksonModule()); 
		install(new EbeanModule());
	    install(new DaggerModule());
	    install(new HandlebarsModule("public/dist"));
	    
		onStarting(() -> {
			log.info("Starting app...");
			
			for (int i = 0; i < 5; i++) {
				Customer c = new Customer()
						.setName("Customer "+i)
						.setAddress("Address " + i);
				c.insert();
			}
		});
		
		assets("/public/dist/**", Paths.get("public/dist")); 
		get("/", ctx ->  new ModelAndView("index.html"));
		
		/* routes */
		AppComponent dagger = require(AppComponent.class);
	    mvc(dagger.customer());    

	}
	
	public static void main(String[] args) {
		runApp(args, App::new);
	}
	
}
