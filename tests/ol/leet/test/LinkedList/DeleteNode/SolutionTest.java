package ol.leet.test.LinkedList.DeleteNode;

import ol.leet.LinkedList.DeleteNode.ListNode;
import ol.leet.LinkedList.DeleteNode.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                {new int[]{4, 5, 1, 9}, 1, new int[]{4, 5, 9}},
                {new int[]{4, 5, 1, 9}, 5, new int[]{4, 1, 9}},
                {new int[]{1, 2, 3, 4}, 3, new int[]{1, 2, 4}},
                {new int[]{0, 1}, 0, new int[]{1}},
                {new int[]{-3, 5, -99}, -3, new int[]{5, -99}},
        };
    }

    @Before
    public void initialise() {
        solution = new Solution();
    }

    @Test
    public void testMethod() {

        ListNode head = getListFromArray(arg1);

        solution.deleteNode(getNodeByVal(head, target));
        int[] arr = getArrayFromList(head);
        assertTrue(Arrays.equals(arr, expected));

    }

    ListNode getNodeByVal(ListNode headList, int val) {
        ListNode lastNode = headList;
        while (lastNode != null && lastNode.val != val) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }

    ListNode getListFromArray(int[] arr) {
        ListNode result = null;
        ListNode lastNode = null;
        for (int val : arr) {
            ListNode currentNode = new ListNode(val);
            if (result == null) {
                result = currentNode;
                lastNode = currentNode;
            } else {
                lastNode.next = currentNode;
                lastNode = currentNode;
            }
        }
        return result;
    }

    int[] getArrayFromList(ListNode headList) {
        List<Integer> result = new ArrayList<>();
        ListNode lastNode = headList;
        while (lastNode != null) {
            result.add(lastNode.val);
            lastNode = lastNode.next;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}