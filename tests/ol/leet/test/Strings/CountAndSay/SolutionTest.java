package ol.leet.test.Strings.CountAndSay;

import ol.leet.Strings.CountAndSay.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int arg1;
    String expected;
    private Solution solution;

    public SolutionTest(int arg1, String expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {1, "1"},
                {4, "1211"},
                {5, "111221"},
                {6, "312211"},
                {7, "13112221"},
                {8, "1113213211"},
                {9, "31131211131221"},
                {10, "13211311123113112211"},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.countAndSay(arg1).equals(expected));

    }

}