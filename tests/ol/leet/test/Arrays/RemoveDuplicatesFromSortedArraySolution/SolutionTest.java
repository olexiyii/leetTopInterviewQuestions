package ol.leet.test.Arrays.RemoveDuplicatesFromSortedArraySolution;

import ol.leet.Arrays.RemoveDuplicatesFromSortedArraySolution.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int[] arr;
    int expected;
    private Solution solution;

    public SolutionTest(int[] arr, int expected) {
        this.arr = arr;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[]{1, 1, 2}, 2},
                {new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.removeDuplicates(arr) == expected);

    }

}
