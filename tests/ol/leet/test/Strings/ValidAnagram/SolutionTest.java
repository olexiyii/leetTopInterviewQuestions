package ol.leet.test.Strings.ValidAnagram;

import ol.leet.Strings.ValidAnagram.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    String arg1;
    String arg2;
    boolean expected;
    private Solution solution;

    public SolutionTest(String arg1, String arg2, boolean expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {"anagram", "nagaram", true},
                {"rat", "car", false},

        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.isAnagram(arg1, arg2) == expected);

    }

}