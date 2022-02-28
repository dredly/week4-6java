import java.util.concurrent.ThreadLocalRandom;

public class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i < 100; i++) {
                int randWait = ThreadLocalRandom.current().nextInt(50, 150 + 1);
                try {
                    int retrieved = buffer.get();
                    System.out.println("Successfully retrieved value " + retrieved);
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
