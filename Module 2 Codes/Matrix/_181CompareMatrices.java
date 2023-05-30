package Matrix;

import java.util.*;

public class _181CompareMatrices {
    public static String compare(int[][] m1, int[][] m2) {
        int r1 = m1.length, r2 = m2.length;
        int c1 = m1[0].length, c2 = m2[0].length;
        if (r1 != r2 || c1 != c2)
            return "Not Same";

        for (int r = 0; r < r1; r++) {
            for (int c = 0; c < c1; c++) {
                if (m1[r][c] != m2[r][c])
                    return "Not Same";
            }
        }

        return "Same";
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

        System.out.println(compare(m1, m2));
    }
}
