package ol.leet.test.Arrays.IntersectionOfTwoArraysII;

import ol.leet.Arrays.IntersectionOfTwoArraysII.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int[] arr1;
    int[] arr2;
    int[] expected;
    private Solution solution;

    public SolutionTest(int[] arr1, int[] arr2, int[] expected) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2}},
                {new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{9, 4}},
                {new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9}},


        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        //assertTrue(Arrays.asList(solution.intersect(arr1,arr2)).containsAll(Arrays.asList(expected)) );
        int[] res = solution.intersect(arr1, arr2);
        Arrays.sort(res);
        Arrays.sort(expected);
        assertTrue(Arrays.equals(res, expected));

    }

}
