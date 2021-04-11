package ol.leet.test.Strings.LongestCommonPrefix;

import ol.leet.Strings.LongestCommonPrefix.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    String[] arg1;
    String expected;
    private Solution solution;

    public SolutionTest(String[] arg1, String expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new String[]{"flower", "flow", "flight"}, "fl"},
                {new String[]{"dog", "racecar", "car"}, ""},
                {new String[]{"flower", "flower", "flower", "flower"}, "flower"},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.longestCommonPrefix(arg1).equals(expected));

    }

}