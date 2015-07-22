package us.juggl.reactive.vertx;

import io.vertx.core.AbstractVerticle;

/**
 * @author <a href="https://github.com/InfoSec812">Deven Phillips</a>
 */
public class VertxMain extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    vertx.eventBus().consumer("myapp.events.hello", msg -> {
        System.out.println("Got a hello message: "+msg.body());
    });
    vertx.deployVerticle("webserver.js");
  }
}
