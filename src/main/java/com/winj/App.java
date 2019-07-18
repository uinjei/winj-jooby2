package com.winj;

import io.jooby.Jooby;

/**
 * Hello starter project.
 */
public class App extends Jooby {

  {
    get("/", ctx -> "Welcome to Jooby!");
  }

  public static void main(String[] args) {
    runApp(args, App::new);
  }

}
