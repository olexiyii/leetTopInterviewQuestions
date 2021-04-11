package ol.leet.test.Arrays.RotateImage;

import ol.leet.Arrays.RotateImage.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int[][] arr1;
    int[][] expected;
    private Solution solution;

    public SolutionTest(int[][] arr1, int[][] expected) {
        this.arr1 = arr1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}},

                {new int[][]{{1, 2}, {3, 4}},
                        new int[][]{{3, 1}, {4, 2}}},
                {new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}},
                        new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}},
                {new int[][]{{1}},
                        new int[][]{{1}}},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    private void printArray() {
        System.out.println("==============");
        for (int[] ints : arr1) System.out.println(Arrays.toString(ints));
    }

    @Test
    public void testMethod() {
        printArray();
        solution.rotate(arr1);
        printArray();
        assertTrue(Arrays.deepEquals(arr1, expected));

    }

}