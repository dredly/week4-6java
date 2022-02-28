import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassicBubbleSort {

    public static List<Integer> bubbleSort(List<Integer> unsortedList) {
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

    public static void main(String[] args) {
        MakeArray ma = new MakeArray(100000);
        int[] bigArray = ma.getRandArray();
        List<Integer> unsorted = Arrays.stream(bigArray).boxed().collect(Collectors.toList());
        long beforeTime = System.nanoTime();
        bubbleSort(unsorted);
        long afterTime = System.nanoTime();
        System.out.println("Took " + (afterTime - beforeTime) + " ns");
    }
}
