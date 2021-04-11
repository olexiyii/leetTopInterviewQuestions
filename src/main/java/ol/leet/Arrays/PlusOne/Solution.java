package ol.leet.Arrays.PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length;
        int add = 1;
        do {
            i--;
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += add;
                add = 0;
            }
        } while (i > 0 && add == 1);

        if (i == 0 && add == 1) {
            int[] result = new int[digits.length + 1];
            //System.arraycopy(digits,0,result,1,digits.length);
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
