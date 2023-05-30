package Matrix;

import java.util.*;

public class _182AddMatrices {
    public static void addMatrices(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println(-1);
            return;
        }

        int rows = m1.length, cols = m1[0].length;
        int[][] res = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                res[r][c] = m1[r][c] + m2[r][c];
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(res[r][c] + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] m1 = new int[r1][c1];

        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                m1[row][col] = scn.nextInt();
            }
        }

        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] m2 = new int[r2][c2];

        for (int row = 0; row < r2; row++) {
            for (int col = 0; col < c2; col++) {
                m2[row][col] = scn.nextInt();
            }
        }

        addMatrices(m1, m2);
    }
}
