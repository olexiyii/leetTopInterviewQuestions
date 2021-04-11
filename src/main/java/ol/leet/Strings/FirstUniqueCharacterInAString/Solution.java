/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
* */
package ol.leet.Strings.FirstUniqueCharacterInAString;

import java.util.Arrays;

public class Solution {
    public int firstUniqChar(String s) {
        int result = -1;
        if (s.length() == 1) {
            return 0;
        }
        int[] indexes = new int[256];
        Arrays.fill(indexes, -1);
        int i = 0;
        for (; i < s.length() && result == -1; i++) {
            char c = s.charAt(i);
            if (indexes[c] != -1) {
                continue;
            }
            int j = i + 1;
            for (; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    indexes[c] = i;
                    break;
                }
            }
            if (j == s.length()) {
                result = i;
                break;
            }
        }
        return result;
    }
}
