package ol.leet.test.Arrays.RotateArray;

import ol.leet.Arrays.RotateArray.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int[] arr;
    int k;
    int[] expected;
    private Solution solution;

    public SolutionTest(int[] arr, int k, int[] expected) {
        this.arr = arr;
        this.k = k;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}},
                {new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}}
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        solution.rotate(arr, k);
        assertTrue(Arrays.equals(arr, expected));

    }

}
