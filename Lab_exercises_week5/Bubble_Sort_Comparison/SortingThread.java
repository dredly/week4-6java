import java.util.List;

public class SortingThread extends Thread {
    private String name;
    private List<Integer> unsorted;

    public SortingThread(String name, List<Integer> unsorted) {
        this.name = name;
        this.unsorted = unsorted;
    }

    public List<Integer> bubbleSort(List<Integer> unsortedList) {
        for (int i = 0; i < unsortedList.size(); i++) {
            List<Integer> sub = unsortedList.subList(i, unsortedList.size());
            for (int j = sub.size() - 2; j >= 0; j--) {
                if (sub.get(j) < sub.get(j + 1)) {
                    int[] temp = new int[] { sub.get(j), sub.get(j + 1) };
                    sub.set(j, temp[1]);
                    sub.set(j + 1, temp[0]);
                }
            }
        }
        return unsortedList;
    }

    public void run() {
        try {
            System.out.println(name + " starting");
            List<Integer> sorted = bubbleSort(unsorted);
            Thread.sleep(0);
            System.out.println(name + " finished");
        } catch (InterruptedException ie) {
            System.err.println(ie.toString());
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
