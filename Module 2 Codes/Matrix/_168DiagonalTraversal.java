package Matrix;

import java.util.*;

public class _168DiagonalTraversal {
    public static void traversals(int[][] mat, int n) {
        // Top Right to Bottom Left
        for (int d = 0; d <= 2 * n - 2; d++) {
            int r = 0, c = 0;
            if (d < n) {
                r = 0;
                c = d;
            } else {
                c = n - 1;
                r = d - c;
            }

            while (r < n && c >= 0) {
                System.out.print(mat[r][c] + " ");
                r++;
                c--;
            }
        }

        // Bottom Left to Top Right
        for (int d = 0; d <= 2 * n - 2; d++) {
            int r = 0, c = 0;
            if (d < n) {
                r = d;
                c = 0;
            } else {
                r = n - 1;
                c = d - r;
            }

            while (c < n && r >= 0) {
                System.out.print(mat[r][c] + " ");
                r--;
                c++;
            }
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

        for (int d = 0; d <= 2 * n - 2; d++) {
            if (d % 2 == 0) {
                int r = 0, c = 0;
                if (d < n) {
                    r = d;
                    c = 0;
                } else {
                    r = n - 1;
                    c = d - r;
                }

                while (c < n && r >= 0) {
                    System.out.print(mat[r][c] + " ");
                    r--;
                    c++;
                }
            } else {
                int r = 0, c = 0;
                if (d < n) {
                    r = 0;
                    c = d;
                } else {
                    c = n - 1;
                    r = d - c;
                }

                while (r < n && c >= 0) {
                    System.out.print(mat[r][c] + " ");
                    r++;
                    c--;
                }
            }
        }

    }
}
