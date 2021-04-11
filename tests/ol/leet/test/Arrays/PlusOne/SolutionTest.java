package ol.leet.test.Arrays.PlusOne;

import ol.leet.Arrays.PlusOne.Solution;
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
    int[] expected;
    private Solution solution;

    public SolutionTest(int[] arr1, int[] expected) {
        this.arr1 = arr1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[]{1, 2, 2, 9}, new int[]{1, 2, 3, 0}},
                {new int[]{1, 2, 2, 1}, new int[]{1, 2, 2, 2}},
                {new int[]{0}, new int[]{1}},
                {new int[]{9}, new int[]{1, 0}},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        int[] res = solution.plusOne(arr1);
        assertTrue(Arrays.equals(res, expected));

    }

}
