package ol.leet.Arrays.SingleNumber;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int start = 0;
        int finish = nums.length - 1;
        while (finish - start > 1) {
            int midle = start + ((finish - start) >> 1);

            if (nums[midle] == nums[midle + 1]) {
                if ((midle & 1) == 0) {
                    start = midle + 2;
                } else {
                    finish = midle - 1;
                }
            } else if (nums[midle] == nums[midle - 1]) {
                if ((midle & 1) == 1) {
                    start = midle + 1;
                } else {
                    finish = midle - 2;
                }
            } else {
                start = midle;
                break;
            }
        }
        return nums[start];
    }

}
