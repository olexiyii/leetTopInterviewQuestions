package ol.leet.Arrays.RotateArray;

import java.util.Arrays;


public class Solution {
    public void rotate(int[] nums, int k) {
        int realSteps = k % nums.length;
        if (realSteps == 0) {
            return;
        }
        int[] numsCopy = Arrays.copyOfRange(nums, nums.length - realSteps, nums.length);
        System.arraycopy(nums, 0, nums, realSteps, nums.length - realSteps);
        System.arraycopy(numsCopy, 0, nums, 0, realSteps);

    }
}
