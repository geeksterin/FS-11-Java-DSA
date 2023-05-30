package Matrix;

import java.util.*;

public class _180SpiralMatrix {
    public static void spiralMatrix(int[][] mat) {
        int fr = 0, fc = 0, lr = mat.length - 1, lc = mat[0].length - 1;
        int count = 0;
        int size = mat.length * mat[0].length;

        while (count < size) {
            // top wall (left to right)
            for (int c = fc; c <= lc; c++) {
                System.out.print(mat[fr][c] + "\t");
                count++;
            }
            fr++;
            if (count == size)
                return;

            // right wall (top to bottom)
            for (int r = fr; r <= lr; r++) {
                System.out.print(mat[r][lc] + "\t");
                count++;
            }
            lc--;
            if (count == size)
                return;

            // bottom wall (right to left)
            for (int c = lc; c >= fc; c--) {
                System.out.print(mat[lr][c] + "\t");
                count++;
            }
            lr--;
            if (count == size)
                return;

            // left wall (bottom to top)
            for (int r = lr; r >= fr; r--) {
                System.out.print(mat[r][fc] + "\t");
                count++;
            }
            fc++;
        }
    }

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

        spiralMatrix(mat);
    }
}
