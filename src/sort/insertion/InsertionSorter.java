package sort.insertion;

/**
 * Class contains static methods for sorting integer array using
 * insertion sort algorithm
 *
 * Created by V Ivnaovs on 16/06/2015.
 */
public class InsertionSorter {

    /**
     * Prints integer array in one line
     *
     * @param arr array of integers to be printed
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Sorts integer array in ascending order starting from the left side
     *
     * @param arr integer array to be sorted
     */
    public static void insertionSortAsc(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        for (int pos = 1; pos < arr.length; pos++) {
            int value = arr[pos];
            int prevPos = pos - 1;
            while (prevPos >= 0 && value < arr[prevPos]) {
                arr[prevPos + 1] = arr[prevPos];
                arr[prevPos] = value;
                prevPos--;
            }
        }
    }

    /**
     * Sorts array in descending order starting form the left side
     *
     * @param arr integer array to be sorted
     */
    public static void insertionSortDesc(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        for (int pos = 1; pos < arr.length; pos++) {
            int value = arr[pos];
            int prevPos = pos - 1;
            while (prevPos >= 0 && value > arr[prevPos]) {
                arr[prevPos + 1] = arr[prevPos];
                arr[prevPos] = value;
                prevPos--;
            }
        }
    }
}
