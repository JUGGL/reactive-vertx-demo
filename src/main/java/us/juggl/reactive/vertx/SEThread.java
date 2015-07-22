package us.juggl.reactive.vertx;

import io.vertx.core.Vertx;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author <a href="https://github.com/InfoSec812">Deven Phillips</a>
 */
public class SEThread implements Runnable {
    
    private final Vertx vertx;

    public SEThread(Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public void run() {
        while (1==1) {
            try {
                System.out.println("Thread Sleeping");
                TimeUnit.SECONDS.sleep(5L);
                System.out.println("Thread Sending Message");
                vertx.eventBus().send("myapp.events.hello", "Hello From JavaSE!!!");
            } catch (InterruptedException ex) {
                Logger.getLogger(SEThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
