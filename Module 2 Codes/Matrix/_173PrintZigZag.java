package Matrix;

import java.util.*;

public class _173PrintZigZag {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] mat = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                mat[row][col] = scn.nextInt();
            }
        }

        for (int row = 0; row < mat.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < mat[0].length; col++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                for (int col = mat[0].length - 1; col >= 0; col--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
