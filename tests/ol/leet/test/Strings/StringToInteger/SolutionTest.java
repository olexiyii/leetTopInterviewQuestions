package ol.leet.test.Strings.StringToInteger;

import ol.leet.Strings.StringToInteger.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    String arg1;
    int expected;
    private Solution solution;

    public SolutionTest(String arg1, int expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {"42", 42},
                {"   -42", -42},
                {"4193 with words", 4193},
                {"words and 987", 0},
                {"-91283472332", -2147483648},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.myAtoi(arg1) == expected);

    }

}