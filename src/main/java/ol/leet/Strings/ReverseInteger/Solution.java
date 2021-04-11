package ol.leet.Strings.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        if (Integer.MAX_VALUE <= x || Integer.MIN_VALUE >= x) {
            return 0;
        }

        int result = 0;

        if (Integer.MAX_VALUE / 10 >= x && Integer.MIN_VALUE / 10 <= x) {
            while (x != 0) {
                result = result * 10 + x % 10;
                x /= 10;
            }
        } else {
            int result10 = 0;
            while (x != 0) {
                int toAdd = x % 10;
                if ((x > 0 && Integer.MAX_VALUE / 10 < result)
                        || (x < 0 && Integer.MIN_VALUE / 10 > result)
                ) {
                    return 0;
                }
                result10 = result * 10;
                if ((x > 0 && Integer.MAX_VALUE - toAdd <= result10)
                        || (x < 0 && Integer.MIN_VALUE - toAdd >= result10)) {
                    return 0;
                }
                result = result10 + toAdd;
                x /= 10;
            }
        }

        return result;
    }
}
