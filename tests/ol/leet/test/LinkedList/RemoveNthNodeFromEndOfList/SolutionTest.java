package ol.leet.test.LinkedList.RemoveNthNodeFromEndOfList;


//import ol.leet.LinkedList.DeleteNode.ListNode;

import ol.leet.LinkedList.RemoveNthNodeFromEndOfList.Solution;
import ol.leet.LinkedList.RemoveNthNodeFromEndOfList.Solution.ListNode;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SolutionTest {
    int[] arg1;
    int target;
    int[] expected;
    private Solution solution;

    public SolutionTest(int[] arg1, int target, int[] expected) {
        this.arg1 = arg1;
        this.target = target;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters1() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 2, new int[]{1, 2, 3, 5}},
                {new int[]{1}, 1, new int[]{}},
                {new int[]{1, 2}, 1, new int[]{1}},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        ListNode head = solution.getListFromArray(arg1);

        ListNode headResult = solution.removeNthFromEnd(head, target);
        int[] arr = solution.getArrayFromList(headResult);
        assertTrue(Arrays.equals(arr, expected));

    }

}