import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

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

    public static ArrayList<Integer> easySort(ArrayList<Integer> unsortedList) {
        Integer[] unsortedArr = unsortedList.toArray(new Integer[unsortedList.size()]);
        Arrays.sort(unsortedArr, Collections.reverseOrder());
        ArrayList<Integer> sortedList = new ArrayList<Integer>(Arrays.asList(unsortedArr));
        return sortedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> unsorted = makeArray("numbers");
        System.out.println(bubbleSort(unsorted));
        System.out.println(easySort(unsorted));
    }
}
