package hello;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(3);

    public void receiveMessage(Object message) {
    	System.out.println(String.format("%s : %s", message.getClass(),
    			message instanceof byte[] ? new String((byte[]) message) : message.toString()));
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
