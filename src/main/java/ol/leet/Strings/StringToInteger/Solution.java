/*
 *https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
 */

package ol.leet.Strings.StringToInteger;

public class Solution {
    public int myAtoi(String s) {
        long result = 0;
        int sign = 0;
        for (char c : s.toCharArray()) {
            if (!(c >= '0' && c <= '9')) {
                if (sign == 0) {
                    if (c == ' ') {
                        continue;
                    } else if (c == '+') {
                        sign = 1;
                    } else if (c == '-') {
                        sign = -1;
                    } else {
                        break;
                    }
                } else {
                    break;
                }

            } else {
                if (sign == 0) {
                    sign = 1;
                }
                result = result * 10 + (c & 0x0f);
                if (result > Integer.MAX_VALUE) {
                    break;
                }
            }

        }
        result *= sign;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}
