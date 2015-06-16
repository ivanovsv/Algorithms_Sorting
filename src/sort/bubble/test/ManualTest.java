package sort.bubble.test;

import static sort.bubble.BubbleSorter.*;

/**
 * Manual test for bubble sort algorithm
 *
 * Created by V Ivanovs on 16/06/2015.
 */
public class ManualTest {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
        bubbleSortAsc(arr2);
        bubbleSortAscDouble(arr);
        System.out.println("DEBUG: FINAL ACS");
        print(arr);
        System.out.println();
        print(arr2);
        bubbleSortDesc(arr2);
        System.out.println("DEBUG: FINAL DESC");
        print(arr2);
    }
}
