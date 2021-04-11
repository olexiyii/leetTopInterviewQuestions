/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
*/
package ol.leet.Strings.LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder("");
        int charIndex = 0;
        int size0 = strs[0].length();
        boolean charInPlaceForAllStrings = true;

        while (charIndex < size0) {
            char lastChar = strs[0].charAt(charIndex);
            for (String s : strs) {

                charInPlaceForAllStrings = (s.length() > charIndex && lastChar == s.charAt(charIndex));
                if (!charInPlaceForAllStrings) {
                    return result.toString();
                }
            }
            result.append(lastChar);
            charIndex++;
        }

        return result.toString();
    }

}
