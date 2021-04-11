/*
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
 */

package ol.leet.Strings.ValidAnagram;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        if (s.length() == t.length()) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            result = Arrays.equals(sChars, tChars);
        }

        return result;
    }
}
