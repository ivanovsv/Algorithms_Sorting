package sort.insertion;

/**
 * Created by V Ivnaovs on 16/06/2015.
 */
public class InsertionSorter {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


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
