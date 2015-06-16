package sort.insertion.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import static sort.insertion.InsertionSorter.*;

/**
 * TestNG tests for static methods in InsertionSorter class
 *
 * Created by V Ivanovs on 16/06/2015.
 */
public class InsertionSorterTest {
    int[] arrToSort, arrToSort1, arrToSort2,arrToSort3;
    int[] arrResult, arrResult1, arrResult2, arrResult3;
    int[] arrResultR, arrResult1R, arrResult2R, arrResult3R;

    @BeforeMethod
    public void setUp() throws Exception {
        arrToSort = new int[]{10,9,8,7,6,0,1,2,3,4,5};
        arrResult = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        arrResultR = new int[]{10,9,8,7,6,5,4,3,2,1,0};

        arrToSort1 = new int[]{-5,0};
        arrResult1 = new int[]{-5,0};
        arrResult1R = new int[]{0,-5};

        arrToSort2 = new int[]{-10};
        arrResult2 = new int[]{-10};
        arrResult2R = new int[]{-10};

        arrToSort3 = new int[]{9999, -8888, 0, 5, 89, 774, -2};
        arrResult3 = new int[]{-8888, -2, 0, 5, 89, 774, 9999};
        arrResult3R = new int[]{9999, 774, 89, 5, 0, -2, -8888};
    }

    // Ascending order

    @Test
    public void testInsertionSortAsc() throws Exception {
        insertionSortAsc(arrToSort);
        assertEquals(arrToSort, arrResult);
    }

    @Test
    public void testInsertionSortAsc1() throws Exception {
        insertionSortAsc(arrToSort1);
        assertEquals(arrToSort1, arrResult1);
    }

    @Test
    public void testInsertionSortAsc2() throws Exception {
        insertionSortAsc(arrToSort2);
        assertEquals(arrToSort2, arrResult2);
    }

    @Test
    public void testInsertionSortAsc3() throws Exception {
        insertionSortAsc(arrToSort3);
        assertEquals(arrToSort3, arrResult3);
    }

    //Descending order

    @Test
    public void testInsertionSortDesc() throws Exception {
        insertionSortDesc(arrToSort);
        assertEquals(arrToSort, arrResultR);
    }

    @Test
    public void testInsertionSortDesc1() throws Exception {
        insertionSortDesc(arrToSort1);
        assertEquals(arrToSort1, arrResult1R);
    }

    @Test
    public void testInsertionSortDesc2() throws Exception {
        insertionSortDesc(arrToSort2);
        assertEquals(arrToSort2, arrResult2R);
    }

    @Test
    public void testInsertionSortDesc3() throws Exception {
        insertionSortDesc(arrToSort3);
        assertEquals(arrToSort3, arrResult3R);
    }
}