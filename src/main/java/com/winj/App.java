package com.winj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.jooby.Jooby;
import io.jooby.json.JacksonModule;


import static com.winj.EbeanService.*;

public class App extends Jooby {
    
    private final Logger log = LoggerFactory.getLogger(App.class);
    
  {
    
    /**jackson*/
    install(new JacksonModule()); 
    /** ebean */
	new EbeanBootstrap();
    
    get("/", ctx -> "Welcome to Jooby!");
    
    get("/customers", ctx -> findAll(Customer.class, customers -> customers));
    
    get("/customer/{id}", ctx ->
        findOne(Customer.class, ctx.path("id").longValue(), customer -> customer));
    
    post("/customer", ctx -> insert(ctx.body().to(Customer.class), message -> message));
  }

  public static void main(String[] args) {
    runApp(args, App::new);
  }

}
