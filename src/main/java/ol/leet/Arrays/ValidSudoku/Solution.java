package ol.leet.Arrays.ValidSudoku;

public class Solution {
    private boolean isValidArea(char[][] board, int top, int left, int height, int width) {
        int[] count = new int[9];
        for (int i = top; i < top + height; i++) {
            for (int j = left; j < left + width; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int index = (board[i][j] & 0x0f) - 1;
                count[index] = count[index] + 1;
                if (count[index] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        boolean result = true;
        for (int i = 0; i < 9 && result; i++) {
            result = isValidArea(board, i, 0, 1, 9);
        }
        for (int i = 0; i < 9 && result; i++) {
            result = isValidArea(board, 0, i, 9, 1);
        }
        for (int i = 0; i < 9 && result; i += 3) {
            for (int j = 0; j < 9 && result; j += 3) {
                result = isValidArea(board, i, j, 3, 3);
            }
        }
        return result;
    }
}
