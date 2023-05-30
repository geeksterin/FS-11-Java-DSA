package Matrix;

import java.util.*;

public class _175RotateMatrixByK {
    public static void reverse(int[][] mat, int row, int l, int r) {
        while (l < r) {
            int backup = mat[row][l];
            mat[row][l] = mat[row][r];
            mat[row][r] = backup;
            l++;
            r--;
        }
    }

    public static void rotate(int[][] mat, int k) {
        int n = mat.length;
        for (int row = 0; row < n; row++) {
            reverse(mat, row, 0, k - 1);
            reverse(mat, row, k, n - 1);
            reverse(mat, row, 0, n - 1);
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

        int k = scn.nextInt();
        rotate(mat, k);

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
