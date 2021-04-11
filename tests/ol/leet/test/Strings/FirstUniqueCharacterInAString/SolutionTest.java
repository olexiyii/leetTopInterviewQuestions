package ol.leet.test.Strings.FirstUniqueCharacterInAString;


import ol.leet.Strings.FirstUniqueCharacterInAString.Solution;
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
                {"leetcode", 0},
                {"loveleetcode", 2},
                {"aabb", -1},
                {"dddccdbba", 8},

        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.firstUniqChar(arg1) == expected);

    }

}