package ol.leet.test.Arrays.ContainsDuplicate;

import ol.leet.Arrays.ContainsDuplicate.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int[] arr;
    boolean expected;
    private Solution solution;

    public SolutionTest(int[] arr, boolean expected) {
        this.arr = arr;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[]{1, 2, 3, 1}, true},
                {new int[]{1, 2, 3, 4}, false},
                {new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true}
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {


        assertTrue(solution.containsDuplicate(arr) == expected);

    }

}
