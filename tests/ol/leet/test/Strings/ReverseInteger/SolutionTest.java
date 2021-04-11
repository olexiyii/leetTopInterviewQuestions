package ol.leet.test.Strings.ReverseInteger;


import ol.leet.Strings.ReverseInteger.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int arr1;
    int expected;
    private Solution solution;

    public SolutionTest(int arr1, int expected) {
        this.arr1 = arr1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {123, 321},
                {-123, -321},
                {120, 21},
                {1534236469, 0},
                {-2147483412, -2143847412},

        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.reverse(arr1) == expected);

    }

}