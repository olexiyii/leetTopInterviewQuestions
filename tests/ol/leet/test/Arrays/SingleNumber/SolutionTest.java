package ol.leet.test.Arrays.SingleNumber;

import ol.leet.Arrays.SingleNumber.Solution;
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
                {new int[]{-336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, 354}, 354},
                {new int[]{2, 2, 1}, 1},
                {new int[]{4, 1, 2, 1, 2}, 4},
                {new int[]{1}, 1}

        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {


        assertTrue(solution.singleNumber(arr) == expected);

    }

}
