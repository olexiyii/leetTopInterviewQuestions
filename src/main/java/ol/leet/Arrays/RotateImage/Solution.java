package ol.leet.Arrays.RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int halfSize = (n >> 1);
        int notOdd = (n & 1);
        n--;
        for (int i = 0; i < halfSize + notOdd; i++) {
            for (int j = 0; j < halfSize; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = tmp;
            }
        }

    }
}
