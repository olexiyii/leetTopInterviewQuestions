package ol.leet.Strings.ReverseString;

public class Solution {
    public void reverseString(char[] s) {
        if (s.length == 1)
            return;
        int maxIndex = s.length - 1;
        int i = (maxIndex >> 1);
        while (i >= 0) {
            char tmp = s[i];
            s[i] = s[maxIndex - i];
            s[maxIndex - i] = tmp;
            i--;
        }
    }
}
