package Matrix;

import java.util.*;

public class _178NQueenCheck {
    public static boolean isDanger(int[][] mat, int row, int col) {
        // top
        for (int r = row - 1; r >= 0; r--) {
            if (mat[r][col] == 1)
                return true;
        }

        // left
        for (int c = col - 1; c >= 0; c--) {
            if (mat[row][c] == 1)
                return true;
        }

        // top left
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (mat[r][c] == 1)
                return true;
        }

        // top right
        int n = mat.length;
        for (int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) {
            if (mat[r][c] == 1)
                return true;
        }

        return false;
    }

    public static String nQueen(int[][] mat) {
        int n = mat.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (mat[row][col] == 1
                        && isDanger(mat, row, col) == true) {
                    return "Danger";
                }
            }
        }
        return "N Queens";
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

        System.out.println(nQueen(mat));
    }
}
