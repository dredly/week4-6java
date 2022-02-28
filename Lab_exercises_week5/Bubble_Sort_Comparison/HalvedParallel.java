import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HalvedParallel {
    public static void main(String[] args) throws InterruptedException {
        MakeArray ma = new MakeArray(50000);
        int[] array1 = ma.getRandArray();
        int[] array2 = ma.getRandArray();
        List<Integer> unsorted1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> unsorted2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
        SortingThread st1 = new SortingThread("Thread 1", unsorted1);
        SortingThread st2 = new SortingThread("Thread 2", unsorted2);
        long beforeTime = System.nanoTime();
        st1.start();
        st2.start();
        st1.join();
        st2.join();
        long afterTime = System.nanoTime();
        System.out.println("Took " + (afterTime - beforeTime) + " ns");
    }
}
