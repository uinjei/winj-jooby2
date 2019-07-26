package com.winj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.jooby.Jooby;
import io.jooby.MediaType;
import io.jooby.json.JacksonModule;


import static com.winj.EbeanService.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App extends Jooby {
    
    private final Logger log = LoggerFactory.getLogger(App.class);
    
  {
    
    /**jackson*/
    install(new JacksonModule()); 
    /** ebean */
	new EbeanBootstrap();
    
    ObjectMapper mapper = new ObjectMapper();

      decoder(MediaType.json, (ctx, type) -> {          
    
        byte[] body = ctx.body().bytes();              
        
        //mapper.readValue(body, type);
        return null;
        //return lib.fromJson(body, type);               
      });
    
    get("/", ctx -> "Welcome to Jooby!");
    
    get("/customers", ctx -> findAll(Customer.class, customers -> customers));
    
    get("/customer/{id}", ctx ->
        findOne(Customer.class, ctx.path("id").longValue(), customer -> {
            customer.setName("namu");
            return customer;
        }));
    
    post("/customer", ctx -> insert(ctx.body(Customer.class), message -> message));
  }

  public static void main(String[] args) {
    runApp(args, App::new);
  }

}
