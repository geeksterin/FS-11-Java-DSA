package Matrix;

import java.util.*;

public class _177StepcaseSearch {
    public static void searchTarget(int[][] mat, int target) {
        int row = 0, col = mat[0].length - 1;

        while (col >= 0 && row < mat.length) {
            if (mat[row][col] == target) {
                System.out.println(row);
                System.out.println(col);
                return;
            } else if (mat[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        System.out.println("Not Found");
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

        int target = scn.nextInt();

        searchTarget(mat, target);
    }
}
