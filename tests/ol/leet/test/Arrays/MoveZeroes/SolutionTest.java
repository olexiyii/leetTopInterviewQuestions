package ol.leet.test.Arrays.MoveZeroes;

import ol.leet.Arrays.MoveZeroes.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

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
                {new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0}, new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0}},
                {new int[]{0, 0, 1}, new int[]{1, 0, 0}},
                {new int[]{1, 0, 1}, new int[]{1, 1, 0}},
                {new int[]{1, 0}, new int[]{1, 0}},
                {new int[]{0, 1, 0, 0, 3, 12}, new int[]{1, 3, 12, 0, 0, 0}},
                {new int[]{0}, new int[]{0}},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        solution.moveZeroes(arr1);
        assertTrue(Arrays.equals(arr1, expected));

    }

}