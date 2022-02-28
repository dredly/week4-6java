import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class HorseRace {

    public static int findWinnerId(ArrayList<HorseThread> horses) {
        // Make a hashmap in the form numSteps: horseId
        HashMap<Integer, Integer> horseStats = new HashMap<Integer, Integer>();
        int leastSteps = 0;
        for (HorseThread ht : horses) {
            if (horseStats.size() > 0) {
                leastSteps = Collections.min(horseStats.keySet());
                if (ht.getSteps() < leastSteps) {
                    horseStats.put(ht.getSteps(), ht.getHorseID());
                }
            } else {
                horseStats.put(ht.getSteps(), ht.getHorseID());
            }
        }
        return horseStats.get(leastSteps);
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<HorseThread> horses = new ArrayList<HorseThread>();
        for (int i = 0; i < 10; i++) {
            HorseThread h = new HorseThread(i);
            horses.add(h);
            h.start();
        }
        for (HorseThread ht : horses) {
            ht.join();
        }
        int winnerId = findWinnerId(horses);
        System.out.println("Horse " + winnerId + " won");
    }
}
