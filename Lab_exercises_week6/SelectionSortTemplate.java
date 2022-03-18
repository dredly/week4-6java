import java.util.List;
import java.util.ArrayList;

class SelectionSortTemplate {
	
    int comparisons = 0;
    int swaps = 0;

	public static void runSort(List<String> list, int n) {
        int comparisons = 0;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                // Check if the element at index j is less than the current minimum
                // System.out.println("Comparing");
                comparisons++;
                if (list.get(j).compareTo(list.get(min)) < 0){
                    min = j;
                }
            }
            if (i != min) {
                // System.out.println("Swapping");
                swaps++;
                String temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp); 
            }
            // System.out.println("Intermadiate step: " + list);
        }
        System.out.println("n = " + n);
        System.out.println(comparisons + " comparisons");
        System.out.println(swaps + " swaps");

	}

	public static void main(String args[]) {

		// Create an ArrayList to store words
		List<String> list = new ArrayList<String>();

		// We have a string, and can split this string to get the individual words
		String test = "this is a test string with a few more words added";
        String test2 = "aardvark abacus banana chocolate dairy echidna ferret gopher hippo iguana";
        String test3 = "zebra yak xylophone walrus viper tiger snake rhino porpoise";
		String[] splitTest = test3.split("\\s+");

		// We add the individual words to the ArrayList
		for (String a : splitTest)
			list.add(a);

        System.out.println("Before");
        System.out.println(list);
        System.out.println();

		// Run the sort
		SelectionSortTemplate.runSort(list, list.size());

        System.out.println("After");
        System.out.println(list);
        System.out.println();
	}

}