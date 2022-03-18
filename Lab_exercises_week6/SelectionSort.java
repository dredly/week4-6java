public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp; 
            }
        }
    }
    public static void main (String[] args) {
        int[] arr = new int[]{2, 5, 1, 5, 2, 8, 124};
        for (int entry: arr) {
            System.out.print(entry + ", ");
        }
        System.out.println();
        selectionSort(arr);
        for (int entry: arr) {
            System.out.print(entry + ", ");
        }
        System.out.println();
    }
}