package ol.leet.test.Arrays.TwoSum;

import ol.leet.Arrays.TwoSum.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int[] arr1;
    int target;
    int[] expected;
    private Solution solution;

    public SolutionTest(int[] arr1, int target, int[] expected) {
        this.arr1 = arr1;
        this.target = target;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}},
                {new int[]{3, 2, 4}, 6, new int[]{1, 2}},
                {new int[]{3, 3}, 6, new int[]{0, 1}},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(Arrays.equals(solution.twoSum(arr1, target), expected));

    }

}