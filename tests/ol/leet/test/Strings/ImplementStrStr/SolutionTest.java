package ol.leet.test.Strings.ImplementStrStr;

import ol.leet.Strings.ImplementStrStr.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    String arg1;
    String arg2;
    int expected;
    private Solution solution;

    public SolutionTest(String arg1, String arg2, int expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {"a", "a", 0},
//                {"hello", "ll", 2},
//                {"aaaaa", "bba", -1},
//                {"", "", 0},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.strStr(arg1, arg2) == expected);

    }

}