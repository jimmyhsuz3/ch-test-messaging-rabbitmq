package hello;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(2);

    public void receiveMessage(Object message) {
    	System.out.println(message.getClass().toString());
    	if (message instanceof byte[])
    	System.out.println(new String((byte[]) message));
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
