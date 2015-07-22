package us.juggl.reactive.vertx;

import io.vertx.core.Vertx;

/**
 *
 * @author <a href="https://github.com/InfoSec812">Deven Phillips</a>
 */
public class Main {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        
        vertx.deployVerticle(new VertxMain());
        
        SEThread myThread = new SEThread(vertx);
        
        System.out.println("Starting JavaSE Thread");
        (new Thread(myThread)).start();
    }
}
