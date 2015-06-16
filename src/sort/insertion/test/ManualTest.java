package sort.insertion.test;

import static sort.insertion.InsertionSorter.*;

/**
 * Manual tests for insertion sort algorithm
 *
 * Created by V Ivanovs on 16/06/2015.
 */
public class ManualTest {
    public static void main(String[] args) {

        int[] arrToSort = {10,9,8,7,6,0,1,2,3,4,5};
        String result = "Result {0,1,2,3,4,5,6,7,8,9,10} {10,9,8,7,6,5,4,3,2,1,0}";

        int[] arrToSort1 = {-5,0};
        String result1 = "Result1 {0,-5} {-5,0}";

        int[] arrToSort2 = {-10};
        String result2 = "Result2 {-10} {-10}";

        int[] arrToSort3 = {9999, -8888, 0, 5, 89, 774, -2};
        String result3 = "Result3 {9999, 774, 89, 5, 0, -2, -8888} {-8888, -2, 0, 5, 89, 774, 9999}";

        insertionSortAsc(arrToSort);
        printArray(arrToSort);
        insertionSortDesc(arrToSort);
        printArray(arrToSort);
        System.out.println(result);

        insertionSortDesc(arrToSort1);
        printArray(arrToSort1);
        insertionSortAsc(arrToSort1);
        printArray(arrToSort1);
        System.out.println(result1);

        insertionSortAsc(arrToSort2);
        printArray(arrToSort2);
        insertionSortDesc(arrToSort2);
        printArray(arrToSort2);
        System.out.println(result2);

        insertionSortDesc(arrToSort3);
        printArray(arrToSort3);
        insertionSortAsc(arrToSort3);
        printArray(arrToSort3);
        System.out.println(result3);
    }
}
