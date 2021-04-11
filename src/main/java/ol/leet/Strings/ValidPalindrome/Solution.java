/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
*/
package ol.leet.Strings.ValidPalindrome;

public class Solution {
    boolean isABSChar(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }

    public boolean isPalindrome(String s) {
        int head = 0;
        int tile = s.length() - 1;
        char[] sChars = s.toLowerCase().toCharArray();
        while (head < tile) {
            while (head < tile && !isABSChar(sChars[head])) {
                head++;
            }
            while (head < tile && !isABSChar(sChars[tile])) {
                tile--;
            }
            if (sChars[head] != sChars[tile]) {
                break;
            } else {
                head++;
                tile--;
            }
        }
        return sChars[head] == sChars[tile];
    }
}
