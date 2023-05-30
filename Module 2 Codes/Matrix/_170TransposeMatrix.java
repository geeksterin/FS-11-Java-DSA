package Matrix;

import java.util.*;

public class _170TransposeMatrix {
    public static void transpose(int[][] mat) {
        // upper triangle
        for (int row = 0; row < mat.length; row++) {
            for (int col = row; col < mat[0].length; col++) {
                int backup = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = backup;
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

        transpose(mat);
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
