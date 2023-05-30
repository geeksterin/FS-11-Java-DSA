package Matrix;

import java.util.*;

public class _169UpperTriangleMatrix {
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
            for (int col = 0; col < mat[0].length; col++) {
                if (row <= col)
                    System.out.print(mat[row][col] + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
