package sort.bubble;

/**
 * Created by V Ivanovs on 16/06/2015.
 */
public class BubbleSorter {

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println("Outer iteration: " + i);
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

    public static void bubbleSortDouble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println("Outer iteration: " + i);
            int left = 0;
            int right = arr.length-1;
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



    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        bubbleSortDouble(arr);
        System.out.println("FINAL:");
        print(arr);
    }



}
