package sort.bubble;

/**
 * Created by V Ivanovs on 16/06/2015.
 */
public class BubbleSorter {
    /**
     * Prints array in one line (for debug purposes)
     *
     * @param arr array to be printed
     */
    public static void print(int[] arr) {
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
    public static void bubbleSortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println("DEBUG: Outer iteration single asc: " + i);
            int j = 0;
            while (j < arr.length - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                j++;
//                print(arr);
            }
        }
    }

    /**
     * Sorts integer array in descending order starting from the left side
     *
     * @param arr integer array to be sorted
     */
    public static void bubbleSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println("DEBUG: Outer iteration single desc: " + i);
            int j = 0;
            while (j < arr.length - i - 1) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                j++;
//                print(arr);
            }
        }
    }

    /**
     * Sorts integer array in ascending order from both sides
     *
     * @param arr integer array to be sorted
     */
    public static void bubbleSortAscDouble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println("DEBUG: Outer iteration double asc: " + i);
            int left = 0;
            int right = arr.length-1;
            while (left < arr.length - i - 1 && left < right) {
//                System.out.println("DEBUG: left :" + left + " right: " + right);
                if (arr[left] > arr[left + 1]) {
                    int tmp = arr[left];
                    arr[left] = arr[left + 1];
                    arr[left + 1] = tmp;
                }
                if (arr[right-1] > arr[right]) {
                    int tmp = arr[right];
                    arr[right] = arr[right - 1];
                    arr[right - 1] = tmp;
                }
                left++;
                right--;
//                print(arr);
            }
        }
    }
}
