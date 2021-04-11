/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/
*/
package ol.leet.Strings.CountAndSay;

public class Solution {
    private String say(String arg1) {
        StringBuilder result = new StringBuilder();
        char lastChar = arg1.charAt(0);
        int count = 1;
        for (int i = 1; i < arg1.length(); i++) {
            if (lastChar == arg1.charAt(i)) {
                count++;
            } else {
                result.append(count).append(lastChar);
                lastChar = arg1.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(lastChar);
        return result.toString();
    }

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = say(result);
        }
        return result;
    }
}
