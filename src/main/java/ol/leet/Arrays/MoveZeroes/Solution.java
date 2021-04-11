package ol.leet.Arrays.MoveZeroes;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int indexBorder = nums.length;
        int zeroTotal = 0;
        int i = 0;
        while (i < nums.length - zeroTotal) {
            if (nums[i] == 0) {
                int zeroCount = 1;
                while (i + zeroCount < nums.length - zeroTotal && nums[i + zeroCount] == 0) {
                    zeroCount++;
                }
                if (i + zeroCount <= nums.length - zeroTotal && nums.length - zeroTotal - i - zeroCount > 0) {
                    System.arraycopy(nums, i + zeroCount, nums, i, nums.length - zeroTotal - i - zeroCount);
                }
                zeroTotal += zeroCount;

            }
            i++;
        }
        Arrays.fill(nums, nums.length - zeroTotal, nums.length, 0);

    }
}
