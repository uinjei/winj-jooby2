[![Build Status](https://travis-ci.org/jooby-project/hello-starter.svg?branch=master)](https://travis-ci.org/jooby-project/hello-starter)
# hello starter

JSON Starter project.

## quick preview

This project contains a simple application that:

* Accept an optional `name` HTTP parameter
* Creates a POJO and send the response back as JSON

[App.java](https://github.com/jooby-project/hello-starter/blob/master/src/main/java/starter/hello/App.java):

```java
public class App extends Jooby {

  {
    /** Render JSON: */
    use(new Jackson());

    /**
     * Say hello:
     */
    get("/", req -> {
      String name = req.param("name").value("Jooby");
      return new Message("Hello " + name + "!");
    });
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
```

## run

    mvn jooby:run

## help

* Read the [jooby documentation](http://jooby.org/doc)
* Join the [channel](https://gitter.im/jooby-project/jooby)
* Join the [group](https://groups.google.com/forum/#!forum/jooby-project)
