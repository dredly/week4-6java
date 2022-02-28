import java.util.concurrent.ThreadLocalRandom;

public class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i < 100; i++) {
                int randWait = ThreadLocalRandom.current().nextInt(50, 150 + 1);
                try {
                    buffer.put(i);
                    System.out.println("Successfully added value " + i);
                } catch (CustomException e) {
                    System.out.println("ERROR!!! " + e.getMessage());
                }
                Thread.sleep(randWait);
            }
        } catch (InterruptedException ie) {
            System.err.println(ie.toString());
        }

    }
}
