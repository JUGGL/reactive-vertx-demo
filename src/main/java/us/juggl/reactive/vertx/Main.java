package us.juggl.reactive.vertx;

import io.vertx.core.AbstractVerticle;

/**
 *
 */
public class Main extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    vertx.eventBus().consumer("myapp.events.hello", msg -> {
        System.out.println("Got a hello message");
    });
    vertx.deployVerticle("webserver.js");
  }
}
