/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
*/

package ol.leet.Strings.ImplementStrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        if (haystack.equals("") && needle.equals("")) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            for (; j < needle.length() && haystack.charAt(i + j) == needle.charAt(j); j++) {

            }
            if (j == needle.length()) {
                result = i;
                break;
            }
        }
        return result;
    }
}
