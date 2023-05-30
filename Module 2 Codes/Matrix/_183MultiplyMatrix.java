package Matrix;

import java.util.*;

public class _183MultiplyMatrix {
    public static void multiplyMatrices(int[][] m1, int[][] m2) {
        int r1 = m1.length, r2 = m2.length;
        int c1 = m1[0].length, c2 = m2[0].length;

        if (c1 != r2) {
            System.out.println(-1);
            return;
        }

        int[][] res = new int[r1][c2];

        for (int r = 0; r < r1; r++) {
            for (int c = 0; c < c2; c++) {
                for (int k = 0; k < c1; k++) {
                    res[r][c] += m1[r][k] * m2[k][c];
                }
            }
        }

        for (int r = 0; r < r1; r++) {
            for (int c = 0; c < c2; c++) {
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

        multiplyMatrices(m1, m2);
    }
}
