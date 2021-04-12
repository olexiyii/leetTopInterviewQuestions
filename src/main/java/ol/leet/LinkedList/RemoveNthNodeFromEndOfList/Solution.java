/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
* */
package ol.leet.LinkedList.RemoveNthNodeFromEndOfList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        Stack<ListNode> stack = new Stack<>();
        ListNode lastNode = head;
        while (lastNode != null) {
            stack.push(lastNode);
            lastNode = lastNode.next;
        }
        if (n == 1) {
            if (stack.size() == 1) {
                return null;
            } else {
                ListNode previosNodetoDelete = stack.get(stack.size() - n - 1);
                previosNodetoDelete.next = previosNodetoDelete.next.next;
            }

        } else {
            ListNode toDeleteNode = stack.get(stack.size() - n);
            toDeleteNode.val = toDeleteNode.next.val;
            toDeleteNode.next = toDeleteNode.next.next;
        }

        return head;
    }

    ListNode getNodeByVal(ListNode headList, int val) {
        ListNode lastNode = headList;
        while (lastNode != null && lastNode.val != val) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }

    public ListNode getListFromArray(int[] arr) {
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

    public int[] getArrayFromList(ListNode headList) {
        List<Integer> result = new ArrayList<>();
        ListNode lastNode = headList;
        while (lastNode != null) {
            result.add(lastNode.val);
            lastNode = lastNode.next;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
