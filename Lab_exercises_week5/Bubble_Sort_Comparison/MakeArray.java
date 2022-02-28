import java.util.Arrays;
import java.util.Random;

public class MakeArray {
    private int len;

    public MakeArray(int arrayLength) {
        len = arrayLength;
    }

    public int[] getRandArray() {
        int[] output = new int[len];
        Random rg = new Random();
        return Arrays.stream(output).map(ele -> rg.nextInt(1000)).toArray();
    }
}
