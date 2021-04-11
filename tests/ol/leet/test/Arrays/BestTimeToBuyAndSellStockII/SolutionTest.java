package ol.leet.test.Arrays.BestTimeToBuyAndSellStockII;

import ol.leet.Arrays.BestTimeToBuyAndSellStockII.Solution;
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
                {new int[]{7, 1, 5, 3, 6, 4}, 7},
                {new int[]{1, 2, 3, 4, 5}, 4},
                {new int[]{7, 6, 4, 3, 1}, 0}
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.maxProfit(arr) == expected);

    }

}
