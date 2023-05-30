package Matrix;

import java.util.*;

public class _176SetMatrixZeros {
    public static void setMatrixOnes(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        boolean[] rowVis = new boolean[rows];
        boolean[] colVis = new boolean[cols];

        // Filled the visited arrays
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (mat[row][col] == 1) {
                    rowVis[row] = true;
                    colVis[col] = true;
                }
            }
        }

        // Setting Matrix Ones
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (rowVis[row] == true || colVis[col] == true) {
                    mat[row][col] = 1;
                }
            }
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

        setMatrixOnes(mat);

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
