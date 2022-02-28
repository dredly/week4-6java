import java.util.concurrent.ThreadLocalRandom;

public class HorseThread extends Thread {
    private int id;
    private int totalDist;
    private int steps;

    public HorseThread(int id) {
        this.id = id;
        totalDist = 0;
    }

    private void step() {
        int randomStep = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        totalDist += randomStep;
        steps++;
    }

    public int getSteps() {
        return steps;
    }

    public int getHorseID() {
        return id;
    }

    public void run() {
        try {
            System.out.println("Horse number " + id + " starting");
            while (totalDist < 1000) {
                Thread.sleep(10);
                step();
            }
            System.out.println("Horse number " + id + " finished in " + steps + " steps.");
        } catch (InterruptedException ie) {
            System.err.println(ie.toString());
        }
    }
}
