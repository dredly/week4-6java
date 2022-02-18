import java.util.Random;

public class RandomNums {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 16; i++) {
            System.out.println(rnd.nextInt(3, 7));
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.println(rnd.nextDouble(4, 8));
        }
    }
}