package ol.leet.test.Strings.ValidPalindrome;

import ol.leet.Strings.ValidPalindrome.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    String arg1;
    boolean expected;
    private Solution solution;

    public SolutionTest(String arg1, boolean expected) {
        this.arg1 = arg1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {"A man, a plan, a canal: Panama", true},
                {"race a car", false},

        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        assertTrue(solution.isPalindrome(arg1) == expected);

    }

}