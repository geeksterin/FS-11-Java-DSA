package Matrix;

import java.util.*;

public class _172Rotate180Degree {

    public static void reverserows(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            int left = 0, right = mat[0].length - 1;

            while (left < right) {
                int backup = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = backup;
                left++;
                right--;
            }
        }
    }

    public static void swaprows(int[][] mat) {
        int left = 0, right = mat.length - 1;

        while (left < right) {
            for (int col = 0; col < mat[0].length; col++) {
                int backup = mat[left][col];
                mat[left][col] = mat[right][col];
                mat[right][col] = backup;
            }
            left++;
            right--;
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                mat[row][col] = scn.nextInt();
            }
        }

        reverserows(mat);
        swaprows(mat);

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
