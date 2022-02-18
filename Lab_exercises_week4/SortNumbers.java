import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SortNumbers {

    public static ArrayList<Integer> makeArray(String filename) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                intArray.add(Integer.parseInt(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return intArray;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> unsortedList) {
        return unsortedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> unsorted = makeArray("numbers");
        System.out.println(unsorted);
    }
}
