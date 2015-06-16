package sort.bubble.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import static sort.bubble.BubbleSorter.*;

/**
 * TestNG tests for static methods in BubbleSorter class
 *
 * Created by V Ivanovs on 16/06/2015.
 */
public class BubbleSorterTest {
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
    public void testBubbleSortAsc() throws Exception {
        bubbleSortAsc(arrToSort);
        assertEquals(arrToSort, arrResult);
    }

    @Test
    public void testBubbleSortAsc1() throws Exception {
        bubbleSortAsc(arrToSort1);
        assertEquals(arrToSort1, arrResult1);
    }

    @Test
    public void testBubbleSortAsc2() throws Exception {
        bubbleSortAsc(arrToSort2);
        assertEquals(arrToSort2, arrResult2);
    }

    @Test
    public void testBubbleSortAsc3() throws Exception {
        bubbleSortAsc(arrToSort3);
        assertEquals(arrToSort3, arrResult3);
    }

    //Ascending order Double

    @Test
    public void testBubbleSortAscDouble() throws Exception {
        bubbleSortAscDouble(arrToSort);
        assertEquals(arrToSort, arrResult);
    }

    @Test
    public void testBubbleSortAscDouble1() throws Exception {
        bubbleSortAscDouble(arrToSort1);
        assertEquals(arrToSort1, arrResult1);
    }

    @Test
    public void testBubbleSortAscDouble2() throws Exception {
        bubbleSortAscDouble(arrToSort2);
        assertEquals(arrToSort2, arrResult2);
    }

    @Test
    public void testBubbleSortAscDouble3() throws Exception {
        bubbleSortAscDouble(arrToSort3);
        assertEquals(arrToSort3, arrResult3);
    }

    //Descending order

    @Test
    public void testBubbleSortDesc() throws Exception {
        bubbleSortDesc(arrToSort);
        assertEquals(arrToSort, arrResultR);
    }

    @Test
    public void testBubbleSortDesc1() throws Exception {
        bubbleSortDesc(arrToSort1);
        assertEquals(arrToSort1, arrResult1R);
    }

    @Test
    public void testBubbleSortDesc2() throws Exception {
        bubbleSortDesc(arrToSort2);
        assertEquals(arrToSort2, arrResult2R);
    }

    @Test
    public void testBubbleSortDesc3() throws Exception {
        bubbleSortDesc(arrToSort3);
        assertEquals(arrToSort3, arrResult3R);
    }
}